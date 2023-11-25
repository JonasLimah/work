package com.apiwork.api.repositories;

import com.apiwork.api.model.entities.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
