package com.lcbmarket.backend.repositories;

import com.lcbmarket.backend.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepo extends JpaRepository<Address,Long> {
    Optional<Address> findAllById(Long id);
}
