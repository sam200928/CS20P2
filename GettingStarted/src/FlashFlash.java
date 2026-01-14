import com.phidget22.*;

public class FlashFlash {

    public static void main(String[] args) throws Exception {

        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        // Port assignments (confirmed)
        redButton.setHubPort(0);    // Red Button
        redButton.setIsHubPortDevice(true);

        redLED.setHubPort(1);       // Red LED
        redLED.setIsHubPortDevice(true);

        greenButton.setHubPort(5);  // Green Button
        greenButton.setIsHubPortDevice(true);

        greenLED.setHubPort(4);     // Green LED
        greenLED.setIsHubPortDevice(true);

        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        // Track previous button states
        boolean prevRedButton = redButton.getState();
        boolean prevGreenButton = greenButton.getState();

        int pressCount = 0;

        while (true) {

            boolean redButtonState = redButton.getState();
            boolean greenButtonState = greenButton.getState();

            // Green button controls RED LED (OFF when pressed, ON when released)
            redLED.setState(!greenButtonState);

            // Red button controls GREEN LED (OFF when pressed, ON when released)
            greenLED.setState(!redButtonState);

            // Count button presses (detect transition: released -> pressed)
            if (redButtonState && !prevRedButton) {
                pressCount++;
                System.out.println("Red Button Pressed. Total presses: " + pressCount);
            }

            if (greenButtonState && !prevGreenButton) {
                pressCount++;
                System.out.println("Green Button Pressed. Total presses: " + pressCount);
            }

            // Update previous states
            prevRedButton = redButtonState;
            prevGreenButton = greenButtonState;

            Thread.sleep(150);
        }
    }
}
