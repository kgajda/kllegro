package pl.kllegro.service;

import pl.kllegro.exceptions.DepositsOfferException;
import pl.kllegro.model.Offer;

/**
 * Created by karol on 22.12.14.
 */
public interface OfferService {
    Long createNewOffer(Long auctionId,Offer offer) throws DepositsOfferException;
}
