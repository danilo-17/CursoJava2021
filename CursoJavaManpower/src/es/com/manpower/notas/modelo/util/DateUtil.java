package es.com.manpower.notas.modelo.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public DateUtil() {
		
	}
	
	public static int getAnio (Date pFecha) {
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(pFecha);
		return cal.get(Calendar.YEAR);
	}

}
