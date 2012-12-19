package com.neven.java.basic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.joda.time.DateTime;


public class TimeTest {

	/**
	 * @Description:
	 *
	 * @author: Neven Chen
	 * @param @param args
	 * @return void
	 * 
	 * @Exception:
	 */
	public static void main(String[] args) {
//		Date date = new Date();
//		System.out.println("util.Date:"+date);
//		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
//		System.out.println("sql.Date:" + sqlDate);
//		java.sql.Timestamp ts = new java.sql.Timestamp(date.getTime()); 
//		System.out.println("sql.Timestamp:"+ts);
//		DateTime jodaDate = new DateTime();
//		System.out.println("joda DateTime:" + jodaDate);
		method();
	}
	
	static void method(){
		//2009-05-08T04:18:19.340-05:00 
		//2009-05-08T04:18:19.340+08:00
		//
		//
		String stringDate = "2010-11-03 11:34:32";
		DateFormat sf = new SimpleDateFormat("yyyy-mm-dd hh:ss");
		java.util.Date utilDate = null;
		try {
			utilDate = sf.parse(stringDate);
			System.out.println(utilDate);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		//java.sql.Date -> org.joda.time.DateTime
		java.sql.Date sqlDate= new java.sql.Date(utilDate.getTime());
		DateTime date = new DateTime(sqlDate);
		System.out.println(date);
		
		//org.joda.time.DateTime -> java.util.Date
		java.util.Date utilDate3 = date.toDate();
		System.out.println("utilDate3:"+utilDate3);
		
		//java.sql.Date -> java.util.Date
		java.util.Date utilDate2 = (java.util.Date)sqlDate;
		System.out.println(utilDate2);
	}
}
