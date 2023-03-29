package ex4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
/*
	public static String format(String pattern, Date date) {

		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}

 */

	/**
	 * farmat date
	 * @return
	 */
	public static String formatDefaut() {

		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return formateur.format(new Date());
	}

}
