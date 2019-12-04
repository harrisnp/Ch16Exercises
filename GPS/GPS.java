public class GPS {
    public static void main(String[]args) {
    
        Geolocation sample = new Geolocation("Sample" , 40.44, 79.98);
        WeatherInfo weather = new WeatherInfo(86.2234 , 84.3435, 72);
        Danger dangerCheck = new Danger(86.2234, 84.3435, 72, 50, 72, true);

        System.out.println("Location: " + sample.getId() + " - " +  sample.getLatitude() + "N " + sample.getLongitude() + "W.");

        System.out.println("Weatherinfo: " + weather.getLatitude() + "N " + weather.getLongitude() + "W " + weather.getTemp() + "°F");
        
        System.out.println("Danger Checker: " + dangerCheck.getLatitude() + "N " + dangerCheck.getLongitude() + " W " + dangerCheck.getTemp() + "°F " + dangerCheck.getDistance() + " " + dangerCheck.getTarget() + "  DANGEROUS? " + dangerCheck.getDanger());
 
    }
}