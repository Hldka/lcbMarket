package com.lcbmarket.backend.services;

import com.lcbmarket.backend.entities.Address;
import com.lcbmarket.backend.exception.AddressNotFoundException;
import jakarta.annotation.Nonnull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AddressService {
   Optional<Address> getAddressById(Long id) throws AddressNotFoundException;
    Address updateAddress(Address address,Long id);
    List<Address> getAddressesByUserId(Long userId);
    Long saveAddress(Address address);
    Boolean deleteAdress(@Nonnull Long id);
}
