package copyConstructor.shallow;

public class address {
    String city;
    String state;
    int pin;

    address() {

    }

    address(String city, String state, int pin) {
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    public String toString() {

        return "City is: " + city + "\tState is: " + state + "\tPIN is: " + pin;
    }
}
