package com.lcbmarket.backend.services;

import com.lcbmarket.backend.entities.Customer;
import jakarta.annotation.Nonnull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    Customer getCustomer(Long id);
    Customer updateCustomer(Long id,Customer updatedCustomer);
    Long addCustomer(Customer customer);
    void deleteCustomer(@Nonnull Long id);
    List<Customer> getAllCustomer();

}
