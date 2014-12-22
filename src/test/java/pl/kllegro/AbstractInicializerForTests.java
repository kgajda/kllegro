package pl.kllegro;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import pl.kllegro.Application;
import pl.kllegro.configuration.HibernateConfigurationForTest;
import pl.kllegro.dao.AuctionDAO;
import pl.kllegro.helper.DateParser;
import pl.kllegro.model.Auction;
import pl.kllegro.model.Offer;
import pl.kllegro.model.Product;

import java.math.BigDecimal;
import java.text.ParseException;

/**
 * Created by karol on 22.12.14.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {HibernateConfigurationForTest.class, Application.class})
@WebAppConfiguration
@ActiveProfiles("test")
public class AbstractInicializerForTests {

    @Autowired
    public AuctionDAO auctionDAO;
    public Auction auction;

    @Before
    public void setUp() throws ParseException {
        auction = new Auction();
        Product product = new Product();
        product.setTitle("title");
        product.setImageUrl("url");
        product.setDescription("dis");
        Offer offer = new Offer();
        offer.setDate(DateParser.parseToDate("2015-12-10 15:14:17"));
        offer.setPrice(new BigDecimal(20));
        auction.setCurrentWinOffer(offer);
        auction.setProduct(product);
        auction.setStart(DateParser.parseToDate("2015-10-10 15:14:17"));
        auction.setEnd(DateParser.parseToDate("2016-10-10 15:14:17"));
        auctionDAO.insert(auction);
    }
}
