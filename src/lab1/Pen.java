package lab1;

public class Pen extends Tool{

    private Color penColor;

    public Pen(double length, double width, double height, Color penColor) {
        super(length, width, height);
        this.penColor = penColor;
    }

    public Color getPenColor(){
        return penColor;
    }

    public void setPenColor(Color penColor){
        this.penColor = penColor;
    }

    @Override
    public String toString() {
        return "Pen color is " + penColor + " volume is " + getVolume();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pen other = (Pen) obj;
        if (penColor != other.getPenColor())
            return false;
        return true;
    }
}
