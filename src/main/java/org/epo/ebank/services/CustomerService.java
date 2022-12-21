package org.epo.ebank.services;

import org.epo.ebank.dtos.CustomerDTO;
import org.epo.ebank.entities.Customer;
import org.epo.ebank.exceptions.CustomerNotFoundException;

import java.util.List;

public interface CustomerService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> listCustomer();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

}
