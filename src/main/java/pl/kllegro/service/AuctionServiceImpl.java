package pl.kllegro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kllegro.dao.AuctionDAO;
import pl.kllegro.dao.SimpleAuctionDAO;
import pl.kllegro.model.Auction;
import pl.kllegro.model.SimpleAuction;

import java.util.List;

/**
 * Created by karol on 17.12.14.
 */

@Service
public class AuctionServiceImpl implements AuctionService {
    @Autowired
    private SimpleAuctionDAO simpleAuctionDAO;
    @Autowired
    private AuctionDAO auctionDAO;

    @Override
    public List<SimpleAuction> getAllSimpleAuction() {
        return simpleAuctionDAO.getSimpleAuction();
    }

    @Override
    public Long createNewAuction(Auction auction) {
        return auctionDAO.insert(auction);
    }

    @Override
    public Auction getAuction(long id) {
        return auctionDAO.findById(id);
    }
}
