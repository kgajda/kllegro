package pl.kllegro.configuration;

import org.hibernate.SessionFactory;
import org.postgresql.ds.PGPoolingDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by karol on 22.12.14.
 */
@Configuration
@Profile("production")
@EnableTransactionManagement
public class HibernateConfiguration {
    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public PGPoolingDataSource pgPoolingDataSource() throws SQLException {
        PGPoolingDataSource pgPoolingDataSource = new PGPoolingDataSource();
        pgPoolingDataSource.setPassword("postgres");
        pgPoolingDataSource.setUser("postgres");
        pgPoolingDataSource.setUrl("jdbc:postgresql://localhost:5432/kllegro");
        return pgPoolingDataSource;
    }

    @Bean
    public SessionFactory sessionFactory() throws IOException, SQLException {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setConfigLocation(applicationContext.getResource("classpath:hibernate/hibernate.cfg.xml"));
        sessionFactory.setDataSource(pgPoolingDataSource());
        sessionFactory.afterPropertiesSet();
        return sessionFactory.getObject();
    }

    @Bean
    public HibernateTransactionManager transactionManager() throws IOException, SQLException {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory());
        return transactionManager;

    }
}
