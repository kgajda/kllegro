package pl.kllegro.dao.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import pl.kllegro.dao.mongo.model.OfferHistory;
import pl.kllegro.model.Offer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by karol on 23.12.14.
 */
@Repository
@Profile(value = {"production", "test"})
public class HistoryOfferImpl implements HistoryOffer {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insert(Offer offer) {
        mongoTemplate.save(new OfferHistory(offer));
    }

    @Override
    public Collection<Offer> getAllOffer(long auctionId) {
        Query query = new Query(Criteria.where("offerId").is(auctionId));
        List<OfferHistory> offerHistories = mongoTemplate.find(query, OfferHistory.class);
        Collection<Offer> offerCollection = new LinkedList<>();
        offerHistories.forEach(offerHistory -> offerCollection.add(offerHistory.toOffer()));
        return offerCollection;
    }
}
