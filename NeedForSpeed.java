class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven = 0;
    private int battery = 100;
    
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if (battery <= 0) {
            return true;
        }
        return false;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!this.batteryDrained()) {
            distanceDriven += speed;
            battery -= batteryDrain;       
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (distance > car.distanceDriven()) {
            if (car.batteryDrained()) {
                return false;
            }
            car.drive();
        }
        return true;
    }
}
