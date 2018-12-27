package com.training.service;

import com.training.model.Customer;
import com.training.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository repository;

    @Autowired
    public void setRepository(CustomerRepository repository) {
        System.out.println("Setter injection via autowired java configuration");
        this.repository = repository;
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

}
