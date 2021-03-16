package za.co.showmax.server.service;

import java.util.List;
import java.util.Optional;

import za.co.showmax.server.entities.Customer;

public interface CustomerService {

	String saveCustomer(Customer customer);
	List<Customer> getAll();
	Optional<Customer> findByName(String name);
}
