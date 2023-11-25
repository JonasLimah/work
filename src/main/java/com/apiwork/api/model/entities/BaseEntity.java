package com.apiwork.api.model.entities;

import jakarta.persistence.*;

@MappedSuperclass
public abstract sealed class BaseEntity permits Address, Customer, Email, Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false, unique = true)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
