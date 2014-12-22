package pl.kllegro.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import pl.kllegro.model.SimpleAuction;

import java.util.List;

/**
 * Created by karol on 22.12.14.
 */
@Repository
@Profile("production")
public class SimpleAuctionDAOImpl implements SimpleAuctionDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<SimpleAuction> getSimpleAuction() {
        Query query = sessionFactory.getCurrentSession().createQuery("SELECT new pl.kllegro.model.SimpleAuction(a.id,a.end,p.title,p.imageUrl,o.price) from Auction a JOIN a.product p JOIN a.currentWinOffer o");
        return (List<SimpleAuction>) query.list();
    }
}
