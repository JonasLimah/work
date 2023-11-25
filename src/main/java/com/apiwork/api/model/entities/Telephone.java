package com.apiwork.api.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "telephone_tb")
@JsonIgnoreProperties(value = "id")
public final class Telephone extends BaseEntity {

    @Column(name = "telephone_number", nullable = false, unique = true, length = 14)
    private String telephoneNumber;

    public Telephone() {
    }

    public Telephone(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
