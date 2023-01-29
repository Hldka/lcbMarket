package com.lcbmarket.backend.services.Impl;

import com.lcbmarket.backend.entities.Customer;
import com.lcbmarket.backend.repositories.CustomerRepo;
import com.lcbmarket.backend.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepo customerRepo;
    CustomerServiceImpl(CustomerRepo customerRepo){this.customerRepo=customerRepo;}
    @Override
    public Customer getCustomer(Long id) {
        return customerRepo.findAllById(id);
    }

    @Override
    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        return null;
    }

    @Override
    public Long addCustomer(Customer customer) {
         Customer savedCustomer =customerRepo.save(customer);
         return savedCustomer.getId();
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepo.deleteById(id);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }
}
