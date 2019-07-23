package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


//CustomerRepository inherits several methods for working with Customer persistence,
//including methods for saving, deleting, and finding Customer entities.
//Thanks to Spring Data JPA i don’t have to write an implementation of the repository interface.
//Spring Data JPA creates an implementation on the fly when you run the application.

public interface CustomerRepository extends CrudRepository<Customer,Long>{

    // define other query method by declaring their signature
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
}
