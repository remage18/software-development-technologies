package lab1;

public class Ruler extends Tool{

    private int scaleSize;

    public Ruler(double length, double width, double height, double price, int scaleSize) {
        super(length, width, height, price);
        this.scaleSize = scaleSize;
    }

    public int getScaleSize(){
        return scaleSize;
    }

    public void setScaleSize(int scaleSize){
        this.scaleSize = scaleSize;
    }

    @Override
    public String toString(){
        return "Ruler scale size is " + scaleSize + " volume is " + getVolume() + ", price is " + getPrice() + " UAH;";
    }
}
