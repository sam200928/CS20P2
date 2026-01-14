
import com.phidget22.*;

public class GetingStarted {
    public static void main(String[] args) throws Exception {
        DigitalOutput redLED = new DigitalOutput();
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        redLED.open(1000);
        redLED.setState(true);
        Thread.sleep(2000);
        redLED.setState(false);
        for (int i = 0; i < 3; i++) {
            redLED.setState(true);
            Thread.sleep(500);
            redLED.setState(false);
            Thread.sleep(500);
        }
        DigitalOutput greenLED = new DigitalOutput();
        
        greenLED.setHubPort(4); 
        greenLED.setIsHubPortDevice(true);
        greenLED.open(1000);
        for (int i = 0; i < 3; i++) {
            greenLED.setState(true);
            Thread.sleep(500);
            greenLED.setState(false);
            Thread.sleep(500);
        }
    }
}