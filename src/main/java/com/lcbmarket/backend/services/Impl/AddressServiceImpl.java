package com.lcbmarket.backend.services.Impl;

import com.lcbmarket.backend.entities.Address;
import com.lcbmarket.backend.exception.AddressNotFoundException;
import com.lcbmarket.backend.repositories.AddressRepo;
import com.lcbmarket.backend.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepo addressRepo;
    @Override
    public Optional<Address> getAddressById(Long id) throws AddressNotFoundException {
        Optional<Address> address=addressRepo.findAllById(id);
        if (address==null){throw  new AddressNotFoundException("Address con not be find with "+id);}
        return address;
    }

    @Override
    public Address updateAddress(Address address, Long id) {
        return null;
    }

    @Override
    public List<Address> getAddressesByUserId(Long userId) {
        return null;
    }

    @Override
    public Long saveAddress(Address address) {
        Address newAddress=addressRepo.save(address);
        return newAddress.getId();
    }

    @Override
    public Boolean deleteAdress(Long id) {
        return null;
    }
}
