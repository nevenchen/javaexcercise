package com.neven.java.basic.time;

import java.util.Calendar;


public class CalendarTest {

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
		
		Calendar firstTime = Calendar.getInstance();
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		Calendar secondTime = Calendar.getInstance();
		System.out.println(firstTime.after(secondTime));
		System.out.println(firstTime.getTimeZone().getDisplayName());
		
	}
}
