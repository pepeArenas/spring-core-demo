package com.training;

import com.training.model.Customer;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();

        List<Customer> customers = service.findAll();
        System.out.printf("Name: %s name again: %<s",customers.get(0).getName());
        System.out.println();
        System.out.printf("Name: %s LastName:%s",customers.get(0).getName(), customers.get(0).getLastName());
    }
}
