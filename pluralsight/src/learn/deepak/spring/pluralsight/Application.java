package learn.deepak.spring.pluralsight;

import learn.deepak.spring.pluralsight.service.CustomerService;
import learn.deepak.spring.pluralsight.service.CustomerServiceImpl;

/**
 * Created by dtelkar on 4/5/14.
 */
public class Application {

    public static void main(String[] args) {

        CustomerService service = new CustomerServiceImpl();
        System.out.println(service.findCustomers());
    }
}
