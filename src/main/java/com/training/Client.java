package com.training;

import com.training.model.Customer;
import com.training.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);

        List<Customer> customers = service.findAll();
        System.out.printf("Name: %s name again: %<s", customers.get(0).getName());
        System.out.println();
        System.out.printf("Name: %s LastName:%s", customers.get(0).getName(), customers.get(0).getLastName());
    }
}
