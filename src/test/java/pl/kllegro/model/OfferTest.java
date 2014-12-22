package pl.kllegro.model;

import org.junit.Before;
import org.junit.Test;
import pl.kllegro.helper.DateParser;

import java.math.BigDecimal;
import java.text.ParseException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OfferTest {

    private Offer newOffer;

    @Before
    public void setUp() throws ParseException {
        newOffer = new Offer();
        newOffer.setPrice(new BigDecimal(20));
        newOffer.setDate(DateParser.parseToDate("2017-11-10 10:14:17"));
    }

    @Test
    public void testIsBiggerNull() throws Exception {
        assertTrue(newOffer.isBigger(null));
    }
    @Test
    public void testIsBiggerPrice() throws Exception {
        Offer smoller = new Offer();
        smoller.setPrice(new BigDecimal(10));
        smoller.setDate(DateParser.parseToDate("2007-11-10 10:14:17"));
        assertTrue(newOffer.isBigger(smoller));
    }

    @Test
    public void testIsBiggerOldDate() throws Exception {
        Offer smoller = new Offer();
        smoller.setPrice(new BigDecimal(10));
        smoller.setDate(DateParser.parseToDate("2027-11-10 10:14:17"));
        assertFalse(newOffer.isBigger(smoller));
    }
    @Test
    public void testIsBiggerEquls() throws Exception {
        Offer smoller = new Offer();
        smoller.setPrice(new BigDecimal(20));
        smoller.setDate(DateParser.parseToDate("2027-11-10 10:14:17"));
        assertFalse(newOffer.isBigger(smoller));
    }
}