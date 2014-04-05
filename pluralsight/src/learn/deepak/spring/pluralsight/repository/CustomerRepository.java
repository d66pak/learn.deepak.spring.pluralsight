package learn.deepak.spring.pluralsight.repository;

import learn.deepak.spring.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by dtelkar on 4/5/14.
 */
public interface CustomerRepository {
    List<Customer> findCustomers();
}
