package pl.kllegro.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.kllegro.model.User;

/**
 * Created by karol on 23.12.14.
 */
@Repository
@Profile(value = {"production", "test"})
public class UserDAOImpl implements UserDAO {
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public Long insert(User user) {
        sessionFactory.getCurrentSession().save(user);
        return user.getId();
    }

    @Override
    @Transactional
    public String getName(long userId) {
        Query query = sessionFactory.getCurrentSession().createQuery("SELECT u.name FROM User u WHERE u.id=:id");
        query.setParameter("id", userId);
        query.setMaxResults(1);
        return (String) query.uniqueResult();
    }
}
