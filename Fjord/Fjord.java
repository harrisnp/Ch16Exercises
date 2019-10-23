public class Fjord {

    public static void main(String[] args) {

        Car Takk = new Car("Takk" , "Sedan" , 50 , 9.5);
        Car Beklager = new Car("Beklager" , "Sedan" , 40 , 7.5);
        Car Vakker = new Car("Vakker" , "SUV" , 60 , 7.5);
        Car Stygg = new Car("Stygg" , "SUV" , 55 , 9.0);
        Car Vanskellig = new Car("Vanskellig" , "Truck" , 65 , 8.75);
        Car Lastebil = new Car("Lastebil" , "Truck" , 70 , 5.5);

        System.out.println("Model:" + Takk.getModel() + "  Body type:" +  Takk.getType() + "  Tank size:" + Takk.getTank() + "  Time:" + Takk.getTime() + "    MPG:" + Takk.calculateMpg() + "  Meets gotv standards? " + Takk.meet()); 
        System.out.println("Model:" + Beklager.getModel() + "  Body type:" +  Beklager.getType() + "  Tank size:" + Beklager.getTank() + "  Time:" + Beklager.getTime() + "    MPG:" + Beklager.calculateMpg() + "  Meets gotv standards? " + Beklager.meet()); 
        System.out.println("Model:" + Vakker.getModel() + "  Body type:" +  Vakker.getType() + "  Tank size:" + Vakker.getTank() + "  Time:" + Vakker.getTime() + "    MPG:" + Vakker.calculateMpg() + "    Meets gotv standards? " + Vakker.meet()); 
        System.out.println("Model:" + Stygg.getModel() + "  Body type:" +  Stygg.getType() + "  Tank size:" + Stygg.getTank() + "  Time:" + Stygg.getTime() + "    MPG:" + Stygg.calculateMpg() + " Meets gotv standards? " + Stygg.meet()); 
        System.out.println("Model:" + Vanskellig.getModel() + "  Body type:" +  Vanskellig.getType() + "  Tank size:" + Vanskellig.getTank() + "  Time:" + Vanskellig.getTime() + "    MPG:" + Vanskellig.calculateMpg() + "    Meets gotv standards? " + Vanskellig.meet()); 
        System.out.println("Model:" + Lastebil.getModel() + "  Body type:" +  Lastebil.getType() + "  Tank size:" + Lastebil.getTank() + "  Time:" + Lastebil.getTime() + "    MPG:" + Lastebil.calculateMpg() + "  Meets gotv standards? " + Lastebil.meet()); 

    }

}