package learn.deepak.spring.pluralsight;

import learn.deepak.spring.pluralsight.repository.CustomerRepository;
import learn.deepak.spring.pluralsight.repository.HibernateCustomerRepositoryImpl;
import learn.deepak.spring.pluralsight.service.CustomerService;
import learn.deepak.spring.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Application configuration class (Java configuration)
 * NOTE: With introduction of this class there is no need of using aplicationContext.xml
 *
 * Created by dtelkar on 4/6/14.
 */
@Configuration
@ComponentScan({"learn.deepak.spring.pluralsight"}) // component scan autowired
@PropertySource("app.properties") // java config
public class AppConfig {


    // Required to read app.properties
    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    @Bean(name="customerService")
    public CustomerService getCustomerService() {
        // constructor injection
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        // setter injection
//        customerService.setCustomerRepository(getCustomerRepository());

        return customerService;
    }

    @Bean(name="customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }
}
