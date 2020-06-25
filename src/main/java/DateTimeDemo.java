import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeDemo {

    public static void main(String[] args) {

        LocalDateTime japan = ZonedDateTime.now(ZoneId.of("Japan")).toLocalDateTime();
        System.out.println(japan.toString());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
       /* LocalDateTime japan = localDateTime.atZone(ZoneId.of("Japan")).toLocalDateTime();
        System.out.println(japan);*/
    }
}
