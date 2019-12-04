public class Geolocation {

    //data

    private String id;
    private double latitude;
    private double longitude;

    private double distance;
    private boolean withinDis;

    //constructor

    public Geolocation(String id, double latitude, double longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getId() {
        return this.id;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }
    
}