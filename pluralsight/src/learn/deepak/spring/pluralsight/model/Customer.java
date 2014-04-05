package learn.deepak.spring.pluralsight.model;

/**
 * Created by dtelkar on 4/5/14.
 */
public class Customer {

    private String firstName;
    private String lastName;


    // Defautl ctor, not require to write
    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
