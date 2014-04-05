package learn.deepak.spring.pluralsight.service;

import learn.deepak.spring.pluralsight.model.Customer;
import learn.deepak.spring.pluralsight.repository.CustomerRepository;

import java.util.List;

/**
 * Created by dtelkar on 4/5/14.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    /**
     * Constructor required for spring constructor injection
     * @param customerRepository the customer repo to be used
     */
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findCustomers() {

        return customerRepository.findCustomers();
    }

    /**
     * Setter method for spring setter injection
     *
     * @param customerRepository the customer repo to be used
     */
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
