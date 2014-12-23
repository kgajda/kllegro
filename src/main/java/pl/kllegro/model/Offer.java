package pl.kllegro.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by karol on 17.12.14.
 */
public class Offer {

    private long id;
    private User user;
    private BigDecimal price;
    private Date date;

    public Offer() {
    }

    public Offer(long id, User user, BigDecimal price, Date date) {
        this.id = id;
        this.user = user;
        this.price = price;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public boolean isBigger(Offer oldOffer) {
        if (oldOffer == null) {
            return true;
        }
        if (price.compareTo(oldOffer.getPrice()) == 1 && date.after(oldOffer.getDate())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBefore(Date end) {
        return date.before(end);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Offer{");
        sb.append("id=").append(id);
        sb.append(", user=").append(user);
        sb.append(", price=").append(price);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Offer offer = (Offer) o;

        if (id != offer.id) return false;
        if (!date.equals(offer.date)) return false;
        if (!price.equals(offer.price)) return false;
        if (!user.equals(offer.user)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + user.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }
}
