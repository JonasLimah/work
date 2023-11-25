package com.apiwork.api.model.entities;

import com.apiwork.api.model.datatypes.Name;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "customer_tb")
public final class Customer extends BaseEntity {

    @OneToMany
    @JoinTable(
            name = "customer_address",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id")
    )
    private final Set<Address> addresses = new LinkedHashSet<>();
    @OneToMany
    @JoinTable(
            name = "customer_telephone",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "telephone_id")
    )
    private final Set<Telephone> telephones = new LinkedHashSet<>();
    @OneToMany
    @JoinTable(
            name = "customer_email",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "email_id")
    )
    private final Set<Email> emails = new LinkedHashSet<>();
    @Embedded
    private Name name;

    public Customer() {
    }

    public Customer(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public Set<Telephone> getTelephones() {
        return telephones;
    }

    public Set<Email> getEmails() {
        return emails;
    }
}
