package pl.kllegro.configuration;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import pl.kllegro.Application;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfiguration.class, Application.class})
@WebAppConfiguration
@ActiveProfiles("test")
public class DataBaseConfigurationTest {

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private MongoTemplate mongoTemplate;

    @After
    public void afterTest() {
        mongoTemplate.dropCollection("testBean");
    }

    @Test
    @Transactional
    public void testConnectionToDb() {
        sessionFactory.getCurrentSession().createSQLQuery("select 1");
    }

    @Test
    public void testConnectionToMongoDb() {
        mongoTemplate.save(new TestBean("test"));
    }

    class TestBean {
        private String test;

        public TestBean() {
        }

        public TestBean(String test) {
            this.test = test;
        }

        public String getTest() {
            return test;
        }

        public void setTest(String test) {
            this.test = test;
        }
    }

}