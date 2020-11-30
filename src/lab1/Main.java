package lab1;

import java.util.Iterator;

public class Main {

    public static void main(String[] args){
	    StationeryStand stand = collectStationaryStand();
	    presentStationaryStand(stand);
	    staplerImitation(stand);
    }

    private static StationeryStand collectStationaryStand(){
        StationeryStand stand = new StationeryStand("ERICH KRAUSE");
        stand.addTools(new Pen(14.5, 0.5, 0.5, Color.Blue));
        stand.addTools(new Pen(14.5, 0.5, 0.5, Color.Blue));
        stand.addTools(new Pencil(2.3, 0.6, 0.6, PencilHardness.F));
        stand.addTools(new Pencil(2.3, 0.6, 0.6, PencilHardness.F));
        stand.addTools(new Ruler(21.4, 0.8, 0.3, 20));
        stand.addTools(new Stapler(10.2, 1.5, 3.9, "BUROMAX"));
        return stand;
    }

    private static void presentStationaryStand(StationeryStand stand){
        System.out.println("Stand for stationary sets: " + stand.getName());
        System.out.println("The set includes " + stand.getToolsAmount() + " tools");
        Iterator iterator = stand.getTools().iterator();
        while(iterator.hasNext()){
            Tool tool = (Tool) iterator.next();
            System.out.println(tool.toString());
        }
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(stand.draw((Pencil) stand.getTools().get(2)));
            }
        }catch (DrawException ex){
            System.out.println(ex.getMessage());
            System.out.print("Length - ");
            System.out.println(String.format( "%.2f" ,ex.getLength()));
        }
        System.out.println(((Pen) stand.getTools().get(0)).getPenColor().penColors());
        for(String i : ((Pen) stand.getTools().get(0)).getPenColor().penColors().split(","))
            System.out.println(i);
    }

    public static void staplerImitation(StationeryStand stand){
        for(int i = 0; i < 7; i++){
            ((Stapler) stand.getTools().get(5)).click();
            ((Stapler) stand.getTools().get(5)).checkClips();
        }
    }
}

