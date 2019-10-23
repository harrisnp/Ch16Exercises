public class Car {
    //data
    private String model;
    private String type;
    private int tank;
    private double time;
    private double mpg;
    private boolean meet;

    //constructor
    public Car(String model, String type, int tank, double time) {
        this.model = model;
        this.type = type;
        this.tank = tank;
        this.time = time;
    }

    //functions - abilities
    //getters and setters

    public String getModel() {
        return this.model;
    }

    public String getType() {
        return this.type;
    }
    
    public int getTank() {
        return this.tank;
    }
    
    public double getTime() {
        return this.time;
    }
    


    public String setModel() {
        this.model = model;
        return model;
    }

    public String setType() {
        this.type = type;
        return type;
    }

    public int setTank() {
        this.tank = tank;
        return tank;
    }

    public double setTime() {
        this.time = time;
        return time;
    }

    public double calculateMpg() {
        this.mpg = (60 * time) / (tank*.264712);
        return mpg;
    }

    public boolean meet() {
        if (type.equals("Sedan")) {
            if(mpg >= 50) {
                return true;
            } else{
                return false;
            }
        } else if (type.equals("SUV")) {
            if(mpg >= 40) {
                return true;
            } else{
                return false;
            }
        } else if (type.equals("Truck")) {
            if(mpg >= 30) {
                return true;
            } else{
                return false;
            }
        }
    return false;
    }
}