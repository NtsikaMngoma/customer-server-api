package za.co.showmax.server.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.showmax.server.entities.Customer;
import za.co.showmax.server.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerResource {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> findAll() {
		return customerService.getAll();
	}
	
	@PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String insertCustomer(Customer customer) {
		return customerService.saveCustomer(customer);
	}

}
