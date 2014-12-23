package pl.kllegro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.kllegro.dao.AuctionDAO;
import pl.kllegro.dao.UserDAO;
import pl.kllegro.dao.mongo.HistoryOffer;
import pl.kllegro.exceptions.DepositsOfferException;
import pl.kllegro.model.Auction;
import pl.kllegro.model.Offer;

import java.util.List;

/**
 * Created by karol on 22.12.14.
 */
@Service
public class OfferServiceImpl implements OfferService {

    @Autowired
    private AuctionDAO auctionDAO;
    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;
    @Autowired
    private HistoryOffer historyOffer;
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public Long createNewOffer(Long auctionId, Offer offer) throws DepositsOfferException {
        Auction auction = auctionDAO.findById(auctionId);
        auction.depositsNewOffer(offer);
        taskExecutor.execute(() -> historyOffer.insert(offer));
        return offer.getId();
    }

    @Override
    public List<Offer> getHistoryOffer(long auctionId) {
        List<Offer> offerList = historyOffer.getAllOffer(auctionId);
        offerList.forEach(offer -> {
            String name = userDAO.getName(offer.getUser().getId());
            offer.getUser().setName(name);
        });
        return offerList;
    }
}
