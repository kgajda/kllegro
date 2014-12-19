package pl.kllegro.dao;

import org.springframework.stereotype.Repository;
import pl.kllegro.model.Product;
import pl.kllegro.model.SimpleAuction;

import java.util.List;

/**
 * Created by karol on 19.12.14.
 */
public interface SimpleAuctionDAO {
    List<SimpleAuction> getAllProduct();
}
