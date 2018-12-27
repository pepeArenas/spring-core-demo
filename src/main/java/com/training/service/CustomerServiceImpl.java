package com.training.service;

import com.training.model.Customer;
import com.training.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    /*
        By name it matter the name of the property it  MUST be a setter with the same name
    * */
    private CustomerRepository repository;


    public void setRepository(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

}
