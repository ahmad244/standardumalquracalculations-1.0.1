package com.ahmad.plugins.firstplugin;

import java.sql.Date;
import java.util.Calendar;

import org.apache.log4j.Logger;

import com.appiancorp.dateconversion.HijriCalendar;
import com.appiancorp.services.ServiceContext;
import com.appiancorp.suiteapi.expression.annotations.Function;
import com.appiancorp.suiteapi.expression.annotations.Parameter;

@AhmadFunctionsCategory
public class AppianDateTOUmAlQuraConversionWithArabicName {

	private static final Logger LOG = Logger
			.getLogger(AppianDateTOUmAlQuraConversionWithArabicName.class);

	@Function
	public String convertgregoriantoumalqurawitharabicmonth(ServiceContext sc,
			@Parameter Date GregorianDate) {
		Calendar cal = Calendar.getInstance(sc.getLocale());
		cal.setTime(GregorianDate);
		HijriCalendar.getHijriDate_ArabicMonthName(cal);
		return HijriCalendar.getHijriDate_ArabicMonthName(cal);
	}

	 
	
	 

}
