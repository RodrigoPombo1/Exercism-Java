import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    LocalDateTime dateTime;
    long secondsToAdd = 1_000_000_000L;

    public Gigasecond(LocalDate moment) {
        dateTime = moment.atStartOfDay().plusSeconds(secondsToAdd);
    }

    public Gigasecond(LocalDateTime moment) {
        dateTime = moment.plusSeconds(secondsToAdd);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
