package com.training.service;

import com.training.model.Customer;
import com.training.repository.CustomerRepository;
import com.training.repository.HibernateRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository repository = new HibernateRepositoryImpl();


    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

}
