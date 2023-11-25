package com.apiwork.api.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address_tb")
@JsonIgnoreProperties(value = "customer")
public final class Address extends BaseEntity {

    @Column(name = "zipcode", nullable = false, length = 8)
    private String zipCode;

    @Column(name = "street", nullable = false, length = 100)
    private String street;

    @Column(name = "number", nullable = false, length = 6)
    private String number;

    @Column(name = "complement", length = 120)
    private String complement;

    @ManyToOne
    private Customer customer;

    public Address() {
    }

    public Address(String zipCode, String street, String number, String complement) {
        this.zipCode = zipCode;
        this.street = street;
        this.number = number;
        this.complement = complement;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
