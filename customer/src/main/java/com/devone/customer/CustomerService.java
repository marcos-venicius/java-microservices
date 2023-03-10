package com.devone.customer;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {

  private final CustomerRepository customerRepository;

  public void registerCustomer(CustomerRegistrationRequest request) {
    Customer customer = Customer.builder()
        .firstName(request.firstName())
        .lastName(request.lastName())
        .email(request.email())
        .build();

    // TODO: check if email is valid
    // TODO: check if email not taken

    customerRepository.save(customer);
  }
}