package com.training.repository;

import com.training.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
