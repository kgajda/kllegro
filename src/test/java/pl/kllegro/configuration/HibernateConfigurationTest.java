package pl.kllegro.configuration;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import pl.kllegro.Application;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {HibernateConfigurationForTest.class, Application.class})
@WebAppConfiguration
@ActiveProfiles("test")
public class HibernateConfigurationTest {
    @Autowired
    private SessionFactory sessionFactory;

    @Test
    @Transactional
    public void testConnectionToDb() {
        sessionFactory.getCurrentSession().createSQLQuery("select 1");
    }

}