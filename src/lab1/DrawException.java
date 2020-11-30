package lab1;

public class DrawException extends Exception {
    private double length;
    public double getLength(){ return length; }
    public DrawException(String message){
        super(message);
    }
    public DrawException(String message, double length){
        super(message);
        this.length = length;
    }
}
