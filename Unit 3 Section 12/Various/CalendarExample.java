import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExample {

	 public static void main(String[] args) {
		// Get an instance of a Calendar, using the current time.
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 Calendar calendar = Calendar.getInstance();
		 System.out.println(dateFormat.format(calendar.getTime()));
		
		// Printing some information...
		System.out.println("ERA: " + calendar.get(Calendar.ERA));
		System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println("DATE: " + calendar.get(Calendar.DATE));
		System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
		System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
		System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
	 }
}
//   ERA Definition
//   Calendar system         Era name         Since (in Gregorian)
//   -----------------------------------------------------------------------
//   Japanese calendar       Meiji            1868-01-01 midnight local time
//                           Taisho           1912-07-30 midnight local time
//                           Showa            1926-12-26 midnight local time
//                           Heisei           1989-01-08 midnight local time
//   Julian calendar         BeforeCommonEra  -292275055-05-16T16:47:04.192Z
//                           CommonEra        0000-12-30 midnight local time
//   Taiwanese calendar      MinGuo           1911-01-01 midnight local time
//   Thai Buddhist calendar  BuddhistEra      -543-01-01 midnight local time
//   -----------------------------------------------------------------------