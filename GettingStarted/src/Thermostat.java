import com.phidget22.*;

public class Thermostat {
    public static void main(String[] args) throws Exception {

        TemperatureSensor temp = new TemperatureSensor();
        DigitalInput greenBtn = new DigitalInput();
        DigitalInput redBtn = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();

        temp.setHubPort(3);

        greenBtn.setHubPort(5);
        greenBtn.setIsHubPortDevice(true);

        redBtn.setHubPort(0);
        redBtn.setIsHubPortDevice(true);

        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        temp.open(1000);
        greenBtn.open(1000);
        redBtn.open(1000);
        greenLED.open(1000);
        redLED.open(1000);

        int setTemp = 21;
        boolean prevGreen = false;
        boolean prevRed = false;
        int counter = 0;

        while (true) {

            double currentTemp = temp.getTemperature();

            boolean greenNow = greenBtn.getState();
            boolean redNow = redBtn.getState();

            if (greenNow && !prevGreen) setTemp++;
            if (redNow && !prevRed) setTemp--;

            prevGreen = greenNow;
            prevRed = redNow;

            if (Math.abs(currentTemp - setTemp) <= 2) {
                greenLED.setState(true);
                redLED.setState(false);
            } else {
                greenLED.setState(false);
                redLED.setState(true);
            }

            // Print every 10 seconds (150 ms × ~67 loops)
            if (counter >= 67) {
                System.out.println("Current: " + currentTemp + " °C | Set: " + setTemp + " °C");
                counter = 0;
            }

            counter++;
            Thread.sleep(150);
        }
    }
}