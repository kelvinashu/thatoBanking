package za.co.thato.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.thato.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findAll();
	Customer findById(int id);
	Customer findByEmail(String email);
	Customer deleteById(int id);
}
