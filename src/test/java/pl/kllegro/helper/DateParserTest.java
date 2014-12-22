package pl.kllegro.helper;

import org.junit.Test;

import java.text.DateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class DateParserTest {

    @Test
    public void testParseToDate() throws Exception {
        Date date = DateParser.parseToDate("2015-11-10 14:14:15");
        System.out.println(date.toString());
    }
}