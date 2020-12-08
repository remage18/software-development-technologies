package lab1;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StationeryStand {

    private String name;
    private ArrayList<Tool> tools;
    private double price;

    public StationeryStand(){
        this.name = "default";
        this.price = 99.99;
        tools = new ArrayList<Tool>();
    }

    public StationeryStand(String name, double price){
        this.name = name;
        this.price = price;
        tools = new ArrayList<Tool>();
    }

    public String draw(Pencil pencil) throws DrawException{
        return pencil.draw();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public ArrayList<Tool> getTools(){
        return tools;
    }

    public void addTools(Tool tool){ tools.add(tool); }

    public int getToolsAmount(){
        return tools.size();
    }

    public double getTotalPrice(){ return tools.stream().mapToDouble(Tool::getPrice).sum() + getPrice(); }

    public ArrayList<Tool> getCertainTool(Predicate<? super Tool> predicate){
        ArrayList<Tool> certainTool = new ArrayList<>();
        for(Tool obj: this.getTools()){
            if(predicate.test(obj)){
                certainTool.add(obj);
            }
        }
        System.out.println("Price of all pens is " + certainTool.stream().mapToDouble(Tool::getPrice).sum());
        return certainTool;
    }

    public Optional<Tool> getMaxPrice(){ return tools.stream().max(Comparator.comparing(Tool::getPrice)); }

    public double getAveragePrice(){ return tools.stream().mapToDouble(Tool::getPrice).average().orElse(0.0); }

    public Map<String, List<Tool>> getToolsByPrice(){
        return tools.stream().collect(Collectors.groupingBy(tool -> tool.price <= 15.00 ?
                "Tool price is less than 15.00 UAN" : "Tool price is higher than 15.00 UAN"));
    }

    public Optional<Map.Entry<Color, Long>> getPenColors(){
        Stream<Color> temp = tools.stream().filter(tool -> tool instanceof Pen).map(pen -> ((Pen) pen).getPenColor());
        System.out.println("Colors: ");
        temp.forEach(x -> System.out.println(x + " "));
        System.out.println();
        return tools.stream().filter(tool -> tool instanceof Pen).map(pen -> ((Pen) pen).getPenColor())
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                    .stream().max(Map.Entry.comparingByValue());
    }
}
