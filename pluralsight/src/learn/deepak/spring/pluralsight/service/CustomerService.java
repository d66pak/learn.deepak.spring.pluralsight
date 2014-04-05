package learn.deepak.spring.pluralsight.service;

import learn.deepak.spring.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by dtelkar on 4/5/14.
 */
public interface CustomerService {
    List<Customer> findCustomers();
}
