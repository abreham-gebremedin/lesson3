package lesson3.dates;

import java.text.*;
import java.util.*;

//Create an DateCalendarSamples class

public class DateCalendarSamples {

	//	declare class level variable datePattern

	String datePattern;

	// Create a class constructor for the DateCalendarSamples class with pattern
	// parameter
	//    The constructor is called when an object of a class is created(instantiated) . 
	public DateCalendarSamples(String pattern) {
		//   	 the value of local variables  going to be assigned to class level variables
		datePattern = pattern;

		// Creating a new Locale with US local time
		/*
		 * A Locale object represents a specific geographical, political,or cultural
		 * region. An operation that requires a Locale to performits task is called
		 * locale-sensitive and uses the Localeto tailor information for the user. For
		 * example, displaying a numberis a locale-sensitive operation— the number
		 * should be formattedaccording to the customs and conventions of the user's
		 * native country,region, or culture.
		 */
		Locale locale = Locale.US;
		/*
		 * The java.text.SimpleDateFormat class provides methods to format and parse
		 * date and time in java. The SimpleDateFormat is a concrete class for
		 * formatting and parsing date which inherits java.text.DateFormat class. Notice
		 * that formatting means converting date to string and parsing means converting
		 * string to date. Instantiates the SimpleDateFormat class using the provided
		 * pattern and For the provided FORMAT Locale
		 */

		SimpleDateFormat formatter = new SimpleDateFormat(datePattern, locale);
		//DateFormat is used for formatting a date into String based on specific locale that is provided as input. 
		//        formatter.format(new Date()); format the current date and assign to String dateString 
		String dateString = formatter.format(new Date());
		//       print the output like e.g Today's date: 11-10-22
		System.out.println("Today's date: " + dateString);

	} // end of constructor DateCalendarSamples(String pattern)

	//    main() method
	public static void main(String[] args) {

		//    	Create anonymous object   of class DateCalendarSamples (This will call the constructor DateCalendarSamples("MM-dd-yy")
		//		initialized the anonymous object and stored on the memory with pattern ("MM-dd-yy"))
		new DateCalendarSamples("MM-dd-yy");

		//    	Create dm object   of class DateCalendarSamples (This will call the constructor DateCalendarSamples("MM-dd-yy")
		//		initialized the dm object and stored on the memory with pattern ("MM-dd-yy"))
		DateCalendarSamples dm = new DateCalendarSamples("M-dd-yy");

		// invoke fromSlides() method to print date MM/dd/yy and "yyyy/MM/dd" format on
		// line 57
		dm.fromSlides();
		// invoke testConversion() on line 102
		dm.testConversion();
		// invoke testCalendar() on line 85
		dm.testCalendar();
	}

	public void fromSlides() {
		////////// j2se5.0: can use String.format with printf options
		String format = "%tD";
		Date d = new Date();
		String formattedDate = String.format(format, d); // has form MM/dd/yy
		System.out.println(formattedDate);

		/////////// pre – j2se5.0: use DateFormat and/or SimpleDateFormat

		d = new Date();
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		formattedDate = f.format(d); // form: MM/dd/yy
		System.out.println(formattedDate);

		// for finer control, where locale is enough like US
		// use SimpleDateFormat
		d = new Date();
		SimpleDateFormat f1 = (SimpleDateFormat) DateFormat.getDateInstance();
		String myFormat = "yyyy/MM/dd";
		f1.applyPattern(myFormat);
		formattedDate = f1.format(d);
		System.out.println(formattedDate);

	}

	public void testCalendar() {
		// gets today's time in this time zone and this locale
		Calendar cal = GregorianCalendar.getInstance();
		System.out.println("Default time zone: " + cal.getTimeZone().getID());
		Date d = cal.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy", Locale.US);
		System.out.println("Current date = " + formatter.format(d));

		// creates a new date
		cal = new GregorianCalendar(1951, Calendar.JANUARY, 1);
		System.out.println("1951 date = " + formatter.format(cal.getTime()));

		// test milliseconds methods
		long l = cal.getTime().getTime();
		d = new Date(l);
		System.out.println("date after getting it in milliseconds = " + formatter.format(d));
	}

	public void testConversion() {
		Date d = new Date(100000L);
		Locale loc = Locale.US;
		SimpleDateFormat twoDig = new SimpleDateFormat("MM-dd-yy", loc);
		SimpleDateFormat fourDig = new SimpleDateFormat("MM-dd-yyyy", loc);
		String s = twoDig.format(d);
		System.out.println("Here's Dec 31, 1969 in 2 digit format: " + twoDig.format(d));
		System.out.println("Here's Dec 31, 1969 in 4 digit format: " + fourDig.format(d));
	}

	public static void pause() {
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}
}
