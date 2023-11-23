package com.apiwork.api.repository;

import com.apiwork.api.enteties.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
