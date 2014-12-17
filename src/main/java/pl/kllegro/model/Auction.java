package pl.kllegro.model;

import java.util.Date;
import java.util.List;

/**
 * Created by karol on 17.12.14.
 */
public class Auction {

    private long id;
    private Date start;
    private Date end;
    private Product product;
    private List<Offer> offerList;
    private Offer currentWinOffer;

    public Auction() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Offer> getOfferList() {
        return offerList;
    }

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
    }

    public Offer getCurrentWinOffer() {
        return currentWinOffer;
    }

    public void setCurrentWinOffer(Offer currentWinOffer) {
        this.currentWinOffer = currentWinOffer;
    }
}
