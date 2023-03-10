public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int distanceTravelled = 0;
    int speed = 20;

    public void drive() {
        distanceTravelled += speed;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
