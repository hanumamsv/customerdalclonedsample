package com.siva.customer.dal.repos;

import com.siva.customer.dal.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {}
