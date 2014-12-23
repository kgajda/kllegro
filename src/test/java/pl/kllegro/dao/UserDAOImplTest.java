package pl.kllegro.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.kllegro.AbstractInicializerForTests;
import pl.kllegro.model.User;

import static org.junit.Assert.assertEquals;

public class UserDAOImplTest extends AbstractInicializerForTests {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void testInsert() throws Exception {
        User user = new User();
        user.setName("test");
        userDAO.insert(user);
    }

    @Test
    public void testGetName() throws Exception {
        User user = new User();
        user.setName("test");
        userDAO.insert(user);

        String userResult = userDAO.getName(user.getId());
        assertEquals(user.getName(), userResult);
    }
}