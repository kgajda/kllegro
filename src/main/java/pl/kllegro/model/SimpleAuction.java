package pl.kllegro.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by karol on 18.12.14.
 */
public class SimpleAuction {

    private long id;
    private Date end;
    private String title;
    private String imageUrl;
    private BigDecimal currentPrice;

    public SimpleAuction() {
    }

    public SimpleAuction(long id, Date end, String title, String imageUrl, BigDecimal currentPrice) {
        this.id = id;
        this.end = end;
        this.title = title;
        this.imageUrl = imageUrl;
        this.currentPrice = currentPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }
}
