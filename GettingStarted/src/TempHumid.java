import com.phidget22.*;

public class TempHumid {
    public static void main(String[] args) throws Exception {

        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        while (true) {

            double humidity = humiditySensor.getHumidity();
            double temperatureC = temperatureSensor.getTemperature();
            double temperatureF = (temperatureC * 1.8) + 32;

            if (humidity > 30) {
                System.out.println("Humidity: " + humidity + " %RH");
            } else {
                System.out.println("not humid enough");
            }

            if (temperatureC > 21) {
                System.out.println(
                    "Temperature: " + temperatureC + " °C (" + temperatureF + " °F)"
                );
            }

            Thread.sleep(150);
        }
    }
}