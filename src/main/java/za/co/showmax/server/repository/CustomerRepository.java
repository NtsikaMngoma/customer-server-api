package za.co.showmax.server.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import za.co.showmax.server.entities.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Long>{

	Optional<Customer> findByName(String name);
}
