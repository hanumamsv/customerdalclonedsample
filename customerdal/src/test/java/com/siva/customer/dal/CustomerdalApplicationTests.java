package com.siva.customer.dal;

import com.siva.customer.dal.entity.Customer;
import com.siva.customer.dal.repos.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerdalApplicationTests {
	@Autowired
	CustomerRepository repo;
	@Test
	void CreateCustomer() {

		Customer customer = new Customer();
		customer.setName("Rebel");
		customer.setEmail("rebel@gmail.com");
		repo.save(customer);
	}
	@Test
        void testReadCustomer(){
		Customer customer = repo.findById(2L).get();
		System.out.println(customer);
	}
	@Test
	void testUpdateCustomer(){
		Customer customer = repo.findById(2L).get();
		customer.setEmail("Billa@gmail.com");
		repo.save(customer);
	}
	@Test
	void testDeleteCustomer(){
		Customer customer = repo.findById(3L).get();
		repo.delete(customer);
	}


	}

