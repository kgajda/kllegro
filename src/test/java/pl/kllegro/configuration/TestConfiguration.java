package pl.kllegro.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by karol on 23.12.14.
 */
@Configuration
@Import(value = {HibernateConfiguration.class, MongoDbConfiguration.class})
public class TestConfiguration {
}
