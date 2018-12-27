package com.training.repository;

import com.training.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("repository")
public class HibernateRepositoryImpl implements CustomerRepository {

    private List<Customer> customers = new ArrayList<>();
    @Value("${username}")
    private String username;

    @Override
    public List<Customer> findAll() {
        Customer customer = new Customer();

        customer.setName(username);
        customer.setLastName("Sand");

        customers.add(customer);

        return customers;
    }
}
