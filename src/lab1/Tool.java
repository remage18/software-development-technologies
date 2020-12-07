package lab1;

public abstract class Tool {

    protected double length;
    protected double width;
    protected double height;
    protected double price;

    public Tool(double length, double width, double height, double price){
        if(length > 0) {
            this.length = length;
        }else throw new RuntimeException("Length must be biggest then 0");
        if(width > 0) {
            this.width = width;
        }else throw new RuntimeException("Width must be biggest then 0");
        if(height > 0) {
            this.height = height;
        }else throw new RuntimeException("Height must biggest then 0");
        if(price > 0) {
            this.price = price;
        }else throw new RuntimeException("Price must be biggest then 0");
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getVolume(){ return length * width * height; }
}
