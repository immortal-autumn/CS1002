//package
import java.util.*;

import java.text.SimpleDateFormat;
//class
public class SystemDate {
	//int year;
	Date now = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar c = Calendar.getInstance();
	String timeNow = dateFormat.format(now);

	int systemYear = c.get(Calendar.YEAR);
	
}
