package pl.kllegro.model;

import pl.kllegro.exceptions.DepositsOfferException;

import java.util.Date;

/**
 * Created by karol on 17.12.14.
 */
public class Auction {

    private long version;

    private long id;
    private Date start;
    private Date end;
    private User user;
    private Product product;
    private Offer currentWinOffer;

    public Auction() {
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
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

    public Offer getCurrentWinOffer() {
        return currentWinOffer;
    }

    public void setCurrentWinOffer(Offer currentWinOffer) {
        this.currentWinOffer = currentWinOffer;
    }

    public void depositsNewOffer(Offer newOffer) throws DepositsOfferException {
        if (newOffer == null) {
            throw new DepositsOfferException("Offer is null");
        }
        if (newOffer.isBigger(currentWinOffer) && newOffer.isBefore(end)) {
            currentWinOffer = newOffer;
        } else {
            throw new DepositsOfferException("Offer is too low current price is: " + currentWinOffer.getPrice() + "with date: " + currentWinOffer.getDate().toString() + " your price is: " + newOffer.getPrice() + " with date: " + newOffer.getDate().toString() + " end: " + end.toString());
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Auction{");
        sb.append("id=").append(id);
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", product=").append(product);
        sb.append(", currentWinOffer=").append(currentWinOffer);
        sb.append('}');
        return sb.toString();
    }
}
