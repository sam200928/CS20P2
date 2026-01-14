import com.phidget22.*;

public class Temperature {
    public static void main(String[] args) throws Exception {

        TemperatureSensor temperatureSensor = new TemperatureSensor();

       
        temperatureSensor.setHubPort(3);

        temperatureSensor.open(1000);

        while (true) {
            double tempC = temperatureSensor.getTemperature();
            double tempF = (tempC * 1.8) + 32;

            System.out.println(
                "Temperature: " + tempF + " °F"
            );

            Thread.sleep(150);
        }
    }
}