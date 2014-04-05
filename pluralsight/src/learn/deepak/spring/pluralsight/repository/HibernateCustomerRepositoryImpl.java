package learn.deepak.spring.pluralsight.repository;

import learn.deepak.spring.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dtelkar on 4/5/14.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findCustomers() {

        List<Customer> customerList = new ArrayList<Customer>();

        Customer c1 = new Customer();
        c1.setFirstName("Mark");
        c1.setLastName("Radison");
        customerList.add(c1);
        return customerList;
    }
}
