package learn.deepak.spring.pluralsight.service;

import learn.deepak.spring.pluralsight.model.Customer;
import learn.deepak.spring.pluralsight.repository.CustomerRepository;
import learn.deepak.spring.pluralsight.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by dtelkar on 4/5/14.
 */
public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<Customer> findCustomers() {

        CustomerRepository cr = new HibernateCustomerRepositoryImpl();

        return cr.findCustomers();
    }
}
