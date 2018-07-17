package com.learning.reactive.springboot.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Flux<Customer> create(@RequestBody List<Customer> customers) {
        return customerService.create(customers);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Flux<Customer> fetch() {
        return customerService.fetch();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Customer> fetchById(@PathVariable String id) {
        return customerService.fetchById(id);
    }
}
