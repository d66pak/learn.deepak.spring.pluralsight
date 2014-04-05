package learn.deepak.spring.pluralsight;

import learn.deepak.spring.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dtelkar on 4/5/14.
 */
public class Application {

    public static void main(String[] args) {

        //CustomerService service = new CustomerServiceImpl();

        // Inject customer service implementation
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);

        System.out.println(service.findCustomers());
    }
}
