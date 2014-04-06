package learn.deepak.spring.pluralsight.service;

import learn.deepak.spring.pluralsight.model.Customer;
import learn.deepak.spring.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dtelkar on 4/5/14.
 */
@Service("customerService") // class level annotation
@Scope("singleton") // always same instance is returned
public class CustomerServiceImpl implements CustomerService {

    //@Autowired // member variable injection
    private CustomerRepository customerRepository;

    /**
     * Default constructor require for autowire byType/byName
     */
    public CustomerServiceImpl() {
    }

    /**
     * Constructor required for spring constructor injection
     * @param customerRepository the customer repo to be used
     */
    @Autowired // constructor injection
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        System.out.println("constructor injection!");
    }

    @Override
    public List<Customer> findCustomers() {

        return customerRepository.findCustomers();
    }

    /**
     * Setter method for spring setter injection
     * Also require for autowire byType/byName
     *
     * @param customerRepository the customer repo to be used
     */
    //@Autowired // setter injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        System.out.println("setter injection!");
    }
}
