package pl.kllegro.dao.mongo;

import pl.kllegro.model.Offer;

import java.util.Collection;
import java.util.List;

/**
 * Created by karol on 23.12.14.
 */
public interface HistoryOffer {
    void insert(Offer offer);

    List<Offer> getAllOffer(long auctionId);
}
