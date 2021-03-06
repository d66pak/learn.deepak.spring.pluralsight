package learn.deepak.spring.pluralsight.repository;

import learn.deepak.spring.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dtelkar on 4/5/14.
 */
@Repository("customerRepository") // class level annotation
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${firstName}")
    private String firstName;

    @Override
    public List<Customer> findCustomers() {

        List<Customer> customerList = new ArrayList<Customer>();

        Customer c1 = new Customer();
        c1.setFirstName(firstName);
        c1.setLastName("Radison");
        customerList.add(c1);
        return customerList;
    }
}
