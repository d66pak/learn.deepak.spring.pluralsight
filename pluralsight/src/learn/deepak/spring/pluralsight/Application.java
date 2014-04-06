package learn.deepak.spring.pluralsight;

import learn.deepak.spring.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dtelkar on 4/5/14.
 */
public class Application {

    public static void main(String[] args) {

        //CustomerService service = new CustomerServiceImpl();

        // Inject customer service implementation
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Use app config java instead of xml config
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);

        // To check the scope
        CustomerService service1 = applicationContext.getBean("customerService", CustomerService.class);

        // For singleton scope same address should be printed
        System.out.println(service);
        System.out.println(service1);

        System.out.println(service.findCustomers().get(0).getFirstName());
    }
}
