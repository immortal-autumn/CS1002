import java.util.*;
import java.text.SimpleDateFormat;

/**
 * @employer SystemDate
 */
public class System_Date {
    //get date from system to judge the retirement date!
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        String timeNow = dateFormat.format(now);

        int systemYear = c.get(Calendar.YEAR);
    }
