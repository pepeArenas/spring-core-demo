package com.training;

import com.training.repository.CustomerRepository;
import com.training.repository.HibernateRepositoryImpl;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("repository")
    public CustomerRepository getCustomRepository() {
        return new HibernateRepositoryImpl();
    }

    @Bean("customerService")
    public CustomerService getCustomerService(CustomerRepository customerRepository) {
        return new CustomerServiceImpl(getCustomRepository());
    }
}
