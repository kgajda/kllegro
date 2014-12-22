package pl.kllegro.dao;

import pl.kllegro.model.Auction;

/**
 * Created by karol on 22.12.14.
 */
public interface AuctionDAO {

    long insert(Auction auction);
    Auction findById(long id);
}
