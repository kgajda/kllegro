package pl.kllegro.transport;

import java.util.Date;

/**
 * Created by karol on 23.12.14.
 */
public class TAuction {

    private Date start;
    private Date end;
    private TProduct product;

    public TAuction() {
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

    public TProduct getProduct() {
        return product;
    }

    public void setProduct(TProduct product) {
        this.product = product;
    }
}
