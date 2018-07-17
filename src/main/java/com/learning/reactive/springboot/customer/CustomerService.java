package com.learning.reactive.springboot.customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface CustomerService {
    Flux<Customer> create(List<Customer> customers);

    Flux<Customer> fetch();

    Mono<Customer> fetchById(String id);
}
