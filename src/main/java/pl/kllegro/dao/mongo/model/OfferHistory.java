package pl.kllegro.dao.mongo.model;

import org.springframework.data.mongodb.core.mapping.Document;
import pl.kllegro.model.Offer;
import pl.kllegro.model.User;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by karol on 23.12.14.
 */
@Document(collection = "OfferHistory")
public class OfferHistory {

    private Long offerId;
    private Long userId;
    private BigDecimal price;
    private Date date;

    public OfferHistory() {
    }

    public OfferHistory(Long offerId, Long userId, String userName, BigDecimal price, Date date) {
        this.offerId = offerId;
        this.userId = userId;
        this.price = price;
        this.date = date;
    }

    public OfferHistory(Offer offer) {
        this.offerId = offer.getId();
        this.userId = offer.getUser().getId();
        this.price = offer.getPrice();
        this.date = offer.getDate();
    }

    public Offer toOffer() {
        Offer offer = new Offer(offerId, new User(userId), price, date);
        return offer;
    }

    public Long getOfferId() {
        return offerId;
    }

    public void setOfferId(Long offerId) {
        this.offerId = offerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}