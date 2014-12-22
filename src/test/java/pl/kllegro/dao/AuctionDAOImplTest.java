package pl.kllegro.dao;

import org.junit.Test;
import pl.kllegro.AbstractInicializerForTests;
import pl.kllegro.model.Auction;

import static org.junit.Assert.assertEquals;


public class AuctionDAOImplTest extends AbstractInicializerForTests {

    @Test
    public void findByIdTest() {
        Auction auctionResult = auctionDAO.findById(auction.getId());
        assertEquals(auction.getEnd(), auctionResult.getEnd());
    }

}