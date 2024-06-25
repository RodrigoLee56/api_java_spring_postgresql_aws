package com.rodrigolee.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigolee.api.domain.address.Address;

public interface AddressRepository extends JpaRepository<Address, UUID>{

}
