import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class lassoingrhetoric {

    public static void main(String[] args) {

        logIt(getNow() + ": started", "standard");

        

        logIt(getNow() + ": ended", "standard");

    }

    static String getNow() {

        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:sss'Z'"); // Quoted "Z" to indicate UTC, no timezone offset
        df.setTimeZone(tz);
        String nowAsISO = df.format(new Date());
        return nowAsISO;

    }

    static void logIt(String text, String type) {

        System.out.println(text);

    }

}
