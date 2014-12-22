package pl.kllegro.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import pl.kllegro.Application;
import pl.kllegro.configuration.HibernateConfigurationForTest;
import pl.kllegro.model.SimpleAuction;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {HibernateConfigurationForTest.class, Application.class})
@WebAppConfiguration
@ActiveProfiles("test")
public class SimpleAuctionDAOImplTest extends AbstractInicializerForTests {

    @Autowired
    private SimpleAuctionDAO simpleAuctionDAO;

    @Test
    public void testGetSimpleAuction() throws Exception {
        List<SimpleAuction> simpleAuctionDAOList = simpleAuctionDAO.getSimpleAuction();
        assertEquals(1,simpleAuctionDAOList.size());
    }
}