package pl.kllegro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.kllegro.dao.AuctionDAO;
import pl.kllegro.exceptions.DepositsOfferException;
import pl.kllegro.model.Auction;
import pl.kllegro.model.Offer;

/**
 * Created by karol on 22.12.14.
 */
@Service
public class OfferServiceImpl implements OfferService {

    @Autowired
    private AuctionDAO auctionDAO;

    @Override
    @Transactional
    public Long createNewOffer(Long auctionId, Offer offer) throws DepositsOfferException {
        Auction auction = auctionDAO.findById(auctionId);
        auction.depositsNewOffer(offer);
        return offer.getId();
    }
}
