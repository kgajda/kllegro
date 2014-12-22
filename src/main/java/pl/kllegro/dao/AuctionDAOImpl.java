package pl.kllegro.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.kllegro.model.Auction;

/**
 * Created by karol on 22.12.14.
 */
@Repository
@Profile("production")
public class AuctionDAOImpl implements AuctionDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public long insert(Auction auction) {
        sessionFactory.getCurrentSession().save(auction);
        return auction.getId();
    }

    @Override
    @Transactional
    public Auction findById(long id) {
       Query query =  sessionFactory.getCurrentSession().createQuery("from Auction where id= :id");
        query.setParameter("id",id);
        return (Auction) query.uniqueResult();
    }
}
