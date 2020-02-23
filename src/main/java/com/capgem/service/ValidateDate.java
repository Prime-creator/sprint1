package com.capgem.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner; 

public class ValidateDate {
	public static boolean isThisDateWithin3MonthsRange(String dateToValidate,
			String dateFromat) {

		SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
		sdf.setLenient(false);
		try {

			// if not valid, it will throw ParseException
			Date date = sdf.parse(dateToValidate);

			// current date after 3 months
			Calendar currentDateAfter3Months = Calendar.getInstance();
			currentDateAfter3Months.add(Calendar.MONTH, 2);

			// current date before 3 months
			Calendar currentDateBefore3Months = Calendar.getInstance();
			currentDateBefore3Months.add(Calendar.MONTH, -2);
			
			if (date.before(currentDateAfter3Months.getTime())
					&& date.after(currentDateBefore3Months.getTime())) {

				//ok everything is fine, date in range
				return true;

			} else {

				return false;

			}

		} catch (ParseException e) {

			e.printStackTrace();
			return false;
		}

	}
	
	public static void main(String []args) throws Exception{
		System.out.println("enter date");
		Scanner s = new Scanner(System.in); 
		String sDate1=s.next();  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
		if(isThisDateWithin3MonthsRange(sDate1, "dd/MM/yyyy")) {
			System.out.println("your data is present in database");
		}else {
			System.out.println("your data is not there at database");
		}
	}

}
