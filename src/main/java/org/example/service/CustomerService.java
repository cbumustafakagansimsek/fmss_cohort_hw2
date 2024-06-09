package org.example.service;



import org.example.model.Customer;
import org.example.service.dto.CustomerDto;

import java.util.List;
import java.util.Set;

public interface CustomerService {
    CustomerDto save(Customer customer);



    List<CustomerDto> findByNameContains(String name);

    List<CustomerDto> findAllAsDto();

    List<Customer> findAll();

    Set<String> findNamesOfUnderBillAmount(int number);



    List<Customer> filterByMonth(int month);




}
