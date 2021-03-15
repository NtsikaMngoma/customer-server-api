package za.co.showmax.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.showmax.server.entities.Customer;
import za.co.showmax.server.repository.CustomerRepository;
import za.co.showmax.server.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public String saveCustomer(Customer customer) {
		customerRepository.save(customer);
		return String.format("Added book with #ID: %d", customer.getId());
	}

}
