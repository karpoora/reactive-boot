package com.learning.reactive.springboot.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public Flux<Customer> create(List<Customer> customers) {
        return customerRepository.insert(customers);
    }

    @Override
    public Flux<Customer> fetch() {
        return customerRepository.findAll();
    }

    @Override
    public Mono<Customer> fetchById(String id) {
        return customerRepository.findById(id);
    }
}
