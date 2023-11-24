package com.apiwork.api.repository;

import com.apiwork.api.enteties.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
