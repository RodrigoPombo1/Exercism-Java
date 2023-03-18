import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

    Signal binaryToSignal(int number) {
        Signal res;
        switch (number) {
            case 1:
                res = Signal.WINK;
                break;
            case 10:
                res = Signal.DOUBLE_BLINK;
                break;
            case 100:
                res = Signal.CLOSE_YOUR_EYES;
                break;
            case 1000:
                res = Signal.JUMP;
                break;
            default:
                res = null;
        }
        return res;
    }


    List<Signal> calculateHandshake(int number) {
        List<Signal> res =  new ArrayList<Signal>();
        for (int i = 0; number > 0; i++) {
            if (number % 2 == 1) {
                if (Math.pow(10, i) == 10000) {
                    Collections.reverse(res);
                    break;
                }
                Signal signal_to_add = binaryToSignal((int)Math.pow(10, i));
                if (signal_to_add != null) {
                    res.add(signal_to_add);
                }
            }
            number /= 2;
        }
        return res;
    }

}
