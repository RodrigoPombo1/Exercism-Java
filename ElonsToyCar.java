public class ElonsToyCar {
    private int distanceDriven = 0;
    private int percentageBattery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (this.percentageBattery == 0) {
            return "Battery empty";
        }
        return "Battery at " + this.percentageBattery + "%";
    }

    public void drive() {
        if (this.percentageBattery != 0) {
            this.distanceDriven += 20;
            this.percentageBattery -= 1;
        }
    }
}
