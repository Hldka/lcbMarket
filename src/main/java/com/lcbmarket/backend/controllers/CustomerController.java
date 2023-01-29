package com.lcbmarket.backend.controllers;

import com.lcbmarket.backend.entities.Customer;
import com.lcbmarket.backend.services.Impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerService;
    @PostMapping("/add")
    public ResponseEntity<Customer> addNewCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
        return ResponseEntity.ok(customer);

    }

    @GetMapping("/getCustomer")
    public ResponseEntity<Customer> getCustomer(@RequestParam("id") Long id){
        Customer customer= customerService.getCustomer(id);
        return ResponseEntity.ok(customer);

    }


}
