package cal;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

//import egenproj.WeatherApp.Facade.Constants.Constant;

public class Mainc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	        Date date = new Date(timestamp.getTime());

	        // S is the millisecond
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy' 'HH:mm:ss:S");
           System.out.println(date);
	        System.out.println(simpleDateFormat.format(timestamp));
	        System.out.println(simpleDateFormat.format(date));
	        String string = "January 2, 2010";
	        String s1="2017-02-01T05:48:41.861z";
	        String s2="2017-02-02W05:48:41.861z";
	        String s3="2017-02-01TH05:48:40.860z";
	        String s4="2017-02-04T05:48:41.861z";
	        //String s2="2017-02-14T05:48.41.861z";
	        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
	                                         // String s2="2017-02-1405:48:41.861";
	                                           // String s2="2017-02-1405:48.41.861";
	      s1=s1.replaceAll("[a-z A-Z]", "");
	      s2=s2.replaceAll("[a-z A-Z]", "");
	      s3=s3.replaceAll("[a-z A-Z]", "");
	      s4=s4.replaceAll("[a-z A-Z]", "");
	        DateFormat format1 = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss.SSS", Locale.ENGLISH);
	    	Date date1=null,date2=null,date3=null,date4=null;
	        try {
				 date1 = format1.parse(s1);
				 date2 = format1.parse(s2);
				 date3 = format1.parse(s3);
				 date4 = format1.parse(s4);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       // System.out.println(date1 +"  "+simpleDateFormat.format(date1));
	        
	        ArrayList<Date> d=new ArrayList<>();
	        d.add(date1);
	        d.add(date2);
	        d.add(date3);
	        d.add(date4);
	        int a=d.get(0).compareTo(d.get(1));
	        
	       Collections.sort(d,(f,b)->f.compareTo(b));
	       
	       d.forEach(System.out::println);
	        */
	/*long ONE_MINUTE_IN_MILLIS=60000;//millisecs

		Calendar date = Calendar.getInstance();
		long t= date.getTimeInMillis();
		Date afterAddingTenMins=new Date(t - (1440 * ONE_MINUTE_IN_MILLIS));
		//System.out.println(afterAddingTenMins);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dateWithoutTime = sdf.parse(sdf.format(new Date()));
			System.out.println(afterAddingTenMins);
			System.out.println(dateWithoutTime);
			System.out.println(afterAddingTenMins.compareTo(dateWithoutTime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Double.parseDouble("64564ghh");
		//Constant.TIME_STAMP_DATE_FORMAT.parse(weather.getTimeoftemp().replaceAll(Constant.ALPHABET_REGEX, ""));
	    }

	
		
	}

