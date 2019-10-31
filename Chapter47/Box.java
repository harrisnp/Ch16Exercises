public class Box {
    //variables
    private double width;
    private double height;
    private double length;
    private double side;

    //constructor
    public Box(double width, double height, double length){
        width = width;
        height = height;
        length =length;
    }

    //methods
    
    public double volume() {
        return width*height*length;       
    }

    public double area() {
        return 2*((width*length)+(height*length)+(height*width));
    }
}