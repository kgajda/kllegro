package pl.kllegro.dao.mongo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.kllegro.AbstractInicializerForTests;
import pl.kllegro.model.Offer;
import pl.kllegro.model.User;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class HistoryOfferImplTest extends AbstractInicializerForTests {

    @Autowired
    private HistoryOffer historyOffer;

    @Test
    public void testInsert() throws Exception {
        historyOffer.insert(createNewOffer(1));
    }

    @Test
    public void testGetAllOffer() throws Exception {
        historyOffer.insert(createNewOffer(1));
        historyOffer.insert(createNewOffer(2));
        historyOffer.insert(createNewOffer(3));
        historyOffer.insert(createNewOffer(4));
        historyOffer.insert(createNewOffer(5));

        Collection<Offer> offerCollection = historyOffer.getAllOffer(new Long(10));
        assertEquals(offerCollection.size(), 5);

    }

    @Test
    public void testEquals() {
        Offer o = createNewOffer(1);
        historyOffer.insert(o);
        Collection<Offer> offerCollection = historyOffer.getAllOffer(new Long(10));
        assertEquals(offerCollection.size(), 1);
        offerCollection.forEach(offer -> assertEquals(offer, o));
    }

    private Offer createNewOffer(int nr) {
        User user = new User(20 + nr);
        Offer offer = new Offer(10, user, new BigDecimal(20 + nr), new Date());
        return offer;
    }
}