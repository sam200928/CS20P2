import com.phidget22.*;

public class HotCold {
    public static void main(String[] args) throws Exception {

        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();       
        temperatureSensor.setHubPort(3); 
        greenLED.setHubPort(4);          
        greenLED.setIsHubPortDevice(true);
        redLED.setHubPort(1);            
        redLED.setIsHubPortDevice(true);

        temperatureSensor.open(1000);
        greenLED.open(1000);
        redLED.open(1000);

        while (true) {

            double tempC = temperatureSensor.getTemperature();       
            System.out.println("Temperature: " + tempC + " °C");        
            if (tempC >= 20 && tempC <= 24) {
                greenLED.setState(true);
                redLED.setState(false);
            } else {
                greenLED.setState(false);
                redLED.setState(true);
            }
            Thread.sleep(500);
        }
    }
}