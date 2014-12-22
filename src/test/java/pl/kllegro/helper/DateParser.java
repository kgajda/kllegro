package pl.kllegro.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by karol on 22.12.14.
 */
public class DateParser {

    public static Date parseToDate(String date) throws ParseException {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-dd-MM hh:mm:ss");
        return simpleDateFormat.parse(date);
    }
}
