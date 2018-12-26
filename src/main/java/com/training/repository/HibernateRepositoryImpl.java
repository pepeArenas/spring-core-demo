package com.training.repository;

import com.training.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateRepositoryImpl implements CustomerRepository {

    private List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> findAll() {
        Customer customer = new Customer();

        customer.setName("Jesus");
        customer.setLastName("Sand");

        customers.add(customer);

        return customers;
    }
}
