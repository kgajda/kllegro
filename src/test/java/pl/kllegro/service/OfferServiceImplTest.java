package pl.kllegro.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.kllegro.AbstractInicializerForTests;
import pl.kllegro.exceptions.DepositsOfferException;
import pl.kllegro.helper.DateParser;
import pl.kllegro.model.Offer;

import java.math.BigDecimal;
import java.text.ParseException;

import static org.junit.Assert.assertNotNull;

public class OfferServiceImplTest extends AbstractInicializerForTests {

    @Autowired
    private OfferService offerService;

    @Test
    public void testCreateNewOfferSucces() throws Exception {
        Offer offer = new Offer();
        offer.setDate(DateParser.parseToDate("2015-12-12 16:14:17"));
        offer.setPrice(new BigDecimal(40));
        Long id = offerService.createNewOffer(auction.getId(), offer);
        assertNotNull(id);
    }

    @Test
    public void testCreateNewOfferFailPrice() throws ParseException {
        Offer offer = new Offer();
        offer.setDate(DateParser.parseToDate("2015-12-12 15:14:17"));
        offer.setPrice(new BigDecimal(20.00));
        Long id = null;
        try {
            id = offerService.createNewOffer(auction.getId(), offer);
            assertNotNull(null);
        } catch (DepositsOfferException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCreateNewOfferFailDate() throws ParseException {
        Offer offer = new Offer();
        offer.setDate(DateParser.parseToDate("2014-12-12 15:14:17"));
        offer.setPrice(new BigDecimal(50.00));
        Long id = null;
        try {
            id = offerService.createNewOffer(auction.getId(), offer);
            assertNotNull(null);
        } catch (DepositsOfferException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testCreateNewOfferAfterEnd() throws ParseException {
        Offer offer = new Offer();
        offer.setDate(DateParser.parseToDate("2114-12-12 15:14:17"));
        offer.setPrice(new BigDecimal(50.00));
        Long id = null;
        try {
            id = offerService.createNewOffer(auction.getId(), offer);
            assertNotNull(null);
        } catch (DepositsOfferException e) {
            e.printStackTrace();
        }
    }

}