package lab1;

public enum Color{
    Blue,
    Black,
    Red;

    public String penColors(){
        StringBuilder builder = new StringBuilder();
        builder.append(Blue.name());
        builder.append(",");
        builder.append(Black.name());
        builder.append(",");
        builder.append(Red.name());
        return builder.toString();
    }

    @Override
        public String toString() {
        return name().toUpperCase();
    }
}
