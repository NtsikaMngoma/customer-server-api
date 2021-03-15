package za.co.showmax.server.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import za.co.showmax.server.entities.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Long>{

}
