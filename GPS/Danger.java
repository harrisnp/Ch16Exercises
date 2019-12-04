public class Danger {

    //data

    private double latitude;
    private double longitude;
    private double temp;

    private double distance;
    private double target;
    private boolean danger;

    //constructor
    
    public Danger(double latitude, double longitude, double temp, double distance, double target, boolean danger){
        this.latitude = latitude;
        this.longitude = longitude;
        this.temp = temp;
        this.distance = distance;
        this.target = target;
        this.danger = danger;
    }

    public double getLatitude() {
        return this.latitude;
    }
    public double getLongitude() {
        return this.longitude;
    }
    public double getTemp() {
        return this.temp;
    }
    public double getDistance() {
        return this.distance;
    }
    public double getTarget() {
        return this.target;
    }
    public boolean getDanger() {
        return this.danger;
    }

}