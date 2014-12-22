package pl.kllegro.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import pl.kllegro.Application;
import pl.kllegro.configuration.HibernateConfigurationForTest;
import pl.kllegro.helper.DateParser;
import pl.kllegro.model.Auction;
import pl.kllegro.model.Product;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;


public class AuctionDAOImplTest extends AbstractInicializerForTests{

    @Test
    public void findByIdTest() {
        Auction auctionResult = auctionDAO.findById(auction.getId());
        assertEquals(auction.getEnd(), auctionResult.getEnd());
    }

}