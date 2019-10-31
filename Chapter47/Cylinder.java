public class Cylinder
{
   
//variables
    private double radius;
    private double height;
//constructor
    public Cylinder(double rad, double hei){
        radius = rad;
        height = hei;
    }
//methods
    public double volume() {
        return Math.PI*(radius*radius) * height;
    }
    public double sa() {
        return 2*(Math.PI)*(radius*radius) + 2*(Math.PI)*(radius*radius)*height;
    }
}