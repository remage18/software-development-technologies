package lab1;

public class Pencil extends Tool{

    private PencilHardness pencilHardness;

    public Pencil(double length, double width, double height, double price, PencilHardness pencilHardness) {
        super(length, width, height, price);
        this.pencilHardness = pencilHardness;
    }

    public PencilHardness getPencilHardness(){
        return pencilHardness;
    }

    public String draw() throws DrawException {
        if(getLength() < 1) throw new DrawException("Length of pencil so small, take another.", getLength());
        length--;
        return "Drawing...";
    }

    public void setPencilHardness(PencilHardness pencilHardness){
        this.pencilHardness = pencilHardness;
    }

    @Override
    public String toString(){
        return "Pencil hardness is " + pencilHardness + ", volume is " + getVolume() + ", price is " + getPrice() + " UAH;";
    }
}
