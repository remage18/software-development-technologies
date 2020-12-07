package lab1;

import java.util.Iterator;

public class Main {

    public static void main(String[] args){
	    StationeryStand stand = collectStationaryStand();
	    presentStationaryStand(stand);
    }

    private static StationeryStand collectStationaryStand(){
        StationeryStand stand = new StationeryStand("ERICH KRAUSE", 149.99);
        stand.addTools(new Pen(14.5, 0.5, 0.5, 13.99, Color.Blue));
        stand.addTools(new Pen(14.5, 0.5, 0.5, 13.99, Color.Blue));
        stand.addTools(new Pen(14.5, 0.5, 0.5, 15.49, Color.Black));
        stand.addTools(new Pen(14.5, 0.5, 0.5, 15.49, Color.Red));
        stand.addTools(new Pencil(2.3, 0.6, 0.6, 6.99, PencilHardness.F));
        stand.addTools(new Pencil(2.3, 0.6, 0.6, 4.99, PencilHardness.F));
        stand.addTools(new Ruler(21.4, 0.8, 0.3, 19.99, 20));
        stand.addTools(new Stapler(10.2, 1.5, 3.9, 49.99, "BUROMAX"));
        return stand;
    }

    private static void presentStationaryStand(StationeryStand stand){
        System.out.println("Stand for stationary sets: " + stand.getName());
        System.out.println("The set includes " + stand.getToolsAmount() + " tools");
        Iterator iterator = stand.getTools().iterator();
        while(iterator.hasNext()) {
            Tool tool = (Tool) iterator.next();
            System.out.println(tool.toString());
        }
        //functional
        System.out.println(stand.getCertainTool(tool -> tool instanceof Pen));
        System.out.println("Total price is(tools + stand): " + stand.getTotalPrice() + " UAH;");
        System.out.println("Dearest tool: " + stand.getMaxPrice());
        System.out.println("Average price of tools: " + stand.getAveragePrice());
        System.out.println(stand.getToolsByPrice());
        System.out.println(stand.getPenColors());
    }
}

