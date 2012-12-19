package jodatimeTest;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.ISODateTimeFormat;


public class JodaTimeTest {
	public static void main(String[] args) {
//		DateTime dateTime = new DateTime(new Date());
//		System.out.println(dateTime.minusDays(7));
////		dateTime = dateTime.withZoneRetainFields(DateTimeZone.UTC);
//		System.out.println(dateTime);
//		System.out.println(dateTime.toString(ISODateTimeFormat.dateTimeNoMillis()));
//		System.out.println(dateTime.toDateTimeISO());
//		System.out.println(dateTime.toDateTime(DateTimeZone.UTC).toString(ISODateTimeFormat.dateTimeNoMillis()));
//		System.out.println(dateTime.toDateTime(DateTimeZone.getDefault()));
		
		Date ddd  = new Date(1272247860000l);
		System.out.println(new DateTime(ddd));       
		System.out.println(DateTimeUtils.ISO8601DateToString(ddd));
	}
}
