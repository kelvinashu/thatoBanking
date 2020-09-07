package za.co.thato.services;

import java.util.List;

import za.co.thato.entities.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	String updateCustomer(Customer customer);

	Customer deleteCustomer(int id);

	List<Customer> fetchCustomers();

	Customer fetchCustomer(int id);
	
	Customer fetchCustomer(String email);
}
