public class Box {
    //variables
    public double width;
    public double height;
    public double length;
    public double side;

    //constructor
    public Box(double wid, double hei, double len){
        this.width = wid;
        this.height = hei;
        this.length = len;
     }  
    //  public OutsideBox(double widt, double heig, double leng) {
    //      this.width = widt;
    //      this.height = heig;
    //      this.length = leng;
    //  }

    //methods
    
    public Box biggerBox(Box oldBox) {
         return new Box(oldBox.width()*1.25, oldBox.height()*1.25, oldBox.length()*1.25);
    }
    public Box smallerBox(Box oldBox) {
        return new Box(oldBox.width()*.5, oldBox.height()*.5, oldBox.length()*.5);
    }
    public Box outsideBox(Box oldBox) {
        return new Box(oldBox.width()+1, oldBox.height()+1, oldBox.length()+1);
    }    

    public double volume() {
        return width*height*length;       
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
        // return 2*((width*length)+(height*length)+(height*width));
    }
    public double width() {
        return width;
    }
    public double height() {
        return height;
    }
    public double length() {
        return length;
    }
    private double faceArea() {
        return width*length;
    }
    private double topArea() {
        return height*length;
    }
    private double sideArea() {
        return height*width;
    }
    public boolean fit() {
        return false;  
    }

}