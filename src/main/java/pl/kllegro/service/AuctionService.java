package pl.kllegro.service;

import pl.kllegro.model.Auction;
import pl.kllegro.model.SimpleAuction;

import java.util.List;

/**
 * Created by karol on 17.12.14.
 */
public interface AuctionService {
    List<SimpleAuction> getAllSimpleAuction();
    Long createNewAuction(Auction auction);
    Auction getAuction(long id);
}
