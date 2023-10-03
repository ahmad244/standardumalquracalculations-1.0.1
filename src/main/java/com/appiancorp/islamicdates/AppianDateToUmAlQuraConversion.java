package com.appiancorp.islamicdates;

import java.sql.Date;
import java.util.Calendar;

import com.appiancorp.dateconversion.HijriCalendar;

// import org.apache.log4j.Logger;

import com.appiancorp.services.ServiceContext;
import com.appiancorp.suiteapi.expression.annotations.Function;
import com.appiancorp.suiteapi.expression.annotations.Parameter;

@IslamicDateFunctionsCategory
public class AppianDateToUmAlQuraConversion {

	// private static final Logger LOG = Logger
	// 		.getLogger(AppianDateToUmAlQuraConversion.class);

			@Function
			public String convertgregoriantoummalqura(ServiceContext sc,
					@Parameter Date GregorianDate) {
		    	 Calendar cal = Calendar.getInstance(sc.getLocale());
				 cal.setTime(GregorianDate);
				 String HijriString = HijriCalendar.getHijriDate(cal);
		         return HijriString;
			}
 


}
