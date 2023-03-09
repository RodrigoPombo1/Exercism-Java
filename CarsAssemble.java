public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double produced = 221 * speed; 
        if (1 <= speed && speed <= 4) {
            return produced;
        }
        if (5 <= speed && speed <= 8) {
            return produced - (1-0.9) * produced;
        }
        if (speed == 9) {
            return produced - (1-0.8) * produced;
        }
        if (speed == 10) {
            return produced - (1-0.77) * produced;
        }
        return 0.0; // isn't suppose to do this line
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
