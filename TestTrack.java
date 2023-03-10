import java.util.ArrayList;
import java.util.List;

public class TestTrack {
    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> listCars = new ArrayList<ProductionRemoteControlCar>();
        int cmp = prc1.compareTo(prc2);
        if (cmp > 0) {
            listCars.add(prc2);
            listCars.add(prc1);
        } else if (cmp < 0) {
            listCars.add(prc1);
            listCars.add(prc2);
        } else {
            // if both cars have the same number of victories, return them in any order
            listCars.add(prc2);
            listCars.add(prc1);
        }
        return listCars;
    }
}
