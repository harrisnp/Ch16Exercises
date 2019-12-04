public class WeatherInfo {

    //data

    private double latitude;
    private double longitude;
    private double temp;

    private double distance;
    private double target;
    private boolean danger;

    //constructor

    public WeatherInfo(double latitude, double longitude, double temp) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.temp = temp;
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


}