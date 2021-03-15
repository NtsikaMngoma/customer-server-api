package za.co.showmax.server.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping(path = "/", consumes = "application/json",
			produces = "application/json")
	public String insertCustomer(Customer customer) {
		return customerService.saveCustomer(customer);
	}

}
