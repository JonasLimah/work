package com.apiwork.api.config;

import com.apiwork.api.model.datatypes.Name;
import com.apiwork.api.model.entities.Address;
import com.apiwork.api.model.entities.Customer;
import com.apiwork.api.model.entities.Email;
import com.apiwork.api.model.entities.Telephone;
import com.apiwork.api.repositories.AddressRepository;
import com.apiwork.api.repositories.CustomerRepository;
import com.apiwork.api.repositories.EmailRepository;
import com.apiwork.api.repositories.TelephoneRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class DataSampleConfig {

    private final CustomerRepository customerRepository;
    private final AddressRepository addressRepository;
    private final TelephoneRepository telephoneRepository;
    private final EmailRepository emailRepository;

    public DataSampleConfig(CustomerRepository customerRepository,
                            AddressRepository addressRepository,
                            TelephoneRepository telephoneRepository,
                            EmailRepository emailRepository) {
        this.customerRepository = customerRepository;
        this.addressRepository = addressRepository;
        this.telephoneRepository = telephoneRepository;
        this.emailRepository = emailRepository;
    }

    @Bean
    public void loadSample() throws Exception {
        final Name name = new Name("João", "Costa");
        final Customer customer = new Customer(name);
        final Address address = new Address("81981000", "Rua A", "1192", "");
        final Telephone telephone = new Telephone("+5581988239822");
        final Email email = new Email("joao@email.com");
        addressRepository.save(address);
        telephoneRepository.save(telephone);
        emailRepository.save(email);
        customer.getAddresses().add(address);
        customer.getTelephones().add(telephone);
        customer.getEmails().add(email);
        customerRepository.save(customer);
        address.setCustomer(customer);
        addressRepository.save(address);
    }
}
