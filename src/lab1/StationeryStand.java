package lab1;

import java.util.ArrayList;

public class StationeryStand {

    private String name;
    private ArrayList<Tool> tools;

    public StationeryStand(){
        this.name = "default";
        tools = new ArrayList<Tool>();
    }

    public StationeryStand(String name){
        this.name = name;
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

    public ArrayList<Tool> getTools(){
        return tools;
    }

    public void addTools(Tool tool){ tools.add(tool); }

    public int getToolsAmount(){
        return tools.size();
    }

}
