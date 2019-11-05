public class BoxTester{

    public static void main(String[]args) {

        
        Box box = new Box( 2.5, 5.0, 6.0);
        Box box2 = box.biggerBox(box);
        Box box3 = box.smallerBox(box);
        Box out = box.outsideBox(box);

        // OutsideBox outside = new OutsideBox( 2.6, 5.0, 6.0);

        System.out.println("Area: " + box.area() + " volume: " + box.volume() );

        System.out.println("length: " + box.length() + " height: " + box.height() + " width: " + box.width());

        System.out.println("BiggerBox Area: " + box2.area() + " BiggerBox volume: " + box2.volume() );

        System.out.println("BiggerBox length: " + box2.length() + " BiggerBox height: " + box2.height() + " BiggerBox width: " + box2.width());

        System.out.println("Smaller Box Area: " + box3.area() + "Smaller Box volume: " + box3.volume() );

        System.out.println("Smaller Box length: " + box3.length() + " Smaller Box height: " + box3.height() + " Smaller Box width: " + box3.width());

        System.out.println("Outside Box Area: " + out.area() + "Outside Box volume: " + out.volume() );

        System.out.println("Outside Box length: " + out.length() + " Outside Box height: " + out.height() + " Outside Box width: " + out.width());

        System.out.println("Fit? " + out.fit());

    }
}