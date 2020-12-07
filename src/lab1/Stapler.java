package lab1;

import java.lang.Thread;

public class Stapler extends Tool implements Application{

    private String name;
    private PaperClip paperClip;

    public Stapler(double length, double width, double height, double price, String name) {
        super(length, width, height, price);
        this.name = name;
        paperClip = new PaperClip(0);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void checkClips(){
        if(paperClip.numberOfClips == 0){
            System.out.println("Clips is over!");
            paperClip.refillClips();
        }
        System.out.println("Number of clips is " + paperClip.numberOfClips);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public void click(){
        if(paperClip.numberOfClips > 0) {
            System.out.println("*Click*");
            paperClip.numberOfClips--;
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public String toString(){
        return "Stapler name is " + getName() + ", price is " + getPrice() + " UAH;";
    }

    private class PaperClip{

        private int numberOfClips;

        public PaperClip(int numberOfClips){
            this.numberOfClips = numberOfClips;
        }

        public void refillClips(){
            System.out.println("Refilling....");
            try {
                Thread.sleep(3500);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            this.numberOfClips = 5;
        }
    }
}
