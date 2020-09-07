package za.co.thato.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.thato.entities.Customer;
import za.co.thato.services.CustomerService;

@RestController
@RequestMapping("api/v1/customer-management/")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("customers")
	public List<Customer> fetchAllCustomers() {
		return customerService.fetchCustomers();
	}

	@GetMapping("customer/{id}")
	public Customer fetchCustomerById(@PathVariable(name = "id") int id) {
		return customerService.fetchCustomer(id);
	}
	
	@GetMapping("customer/email/{email}")
	public Customer fetchCustomerByEmail(@PathVariable(name = "email") String email) {
		return customerService.fetchCustomer(email);
	}

	@PostMapping("customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

	@DeleteMapping("customer/{id}")
	public Customer deleteCustomer(@PathVariable(name = "id")int id) {
		return customerService.deleteCustomer(id);
	}

	@PutMapping("customer")
	public String updateCustomer(Customer customer) {
		return customerService.updateCustomer(customer);
	}

}
