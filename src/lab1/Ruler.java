package lab1;

public class Ruler extends Tool{

    private int scaleSize;

    public Ruler(double length, double width, double height, int scaleSize) {
        super(length, width, height);
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
        return "Ruler scale size is " + scaleSize + " volume is " + getVolume();
    }
}
