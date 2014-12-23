package pl.kllegro.dao.mongo;

import pl.kllegro.model.Offer;

import java.util.Collection;

/**
 * Created by karol on 23.12.14.
 */
public interface HistoryOffer {
    void insert(Offer offer);

    Collection<Offer> getAllOffer(long auctionId);
}
