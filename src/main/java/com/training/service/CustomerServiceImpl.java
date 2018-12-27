package com.training.service;

import com.training.model.Customer;
import com.training.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository repository;

    /*
    By type is not matter what the name is of the setter because is going to resolve by type
    but is MUST be a setter
    * */
    public void setFoo(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

}
