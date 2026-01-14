import com.phidget22.*;

public class ReadButton {
    public static void main(String[] args) throws Exception {

        DigitalInput greenButton = new DigitalInput();

        
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenButton.open(1000);

        boolean previousState = greenButton.getState();
        System.out.println("Initial Green Button State: " + previousState);

        while (true) {
            boolean currentState = greenButton.getState();

            if (currentState != previousState) {
                System.out.println("Green Button State Changed To: " + currentState);
                previousState = currentState;
            }

            Thread.sleep(1000);
        }
    }
}