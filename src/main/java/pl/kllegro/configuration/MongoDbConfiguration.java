package pl.kllegro.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by karol on 23.12.14.
 */
@Configuration
@Profile("production")
public class MongoDbConfiguration {

    public
    @Bean
    Mongo mongo() throws Exception {
        return new MongoClient("localhost");
    }

    public
    @Bean
    MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "kllegro");
    }
}
