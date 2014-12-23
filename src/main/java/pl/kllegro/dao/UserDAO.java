package pl.kllegro.dao;

import pl.kllegro.model.User;

/**
 * Created by karol on 23.12.14.
 */
public interface UserDAO {
    Long insert(User user);

    String getName(long userId);
}
