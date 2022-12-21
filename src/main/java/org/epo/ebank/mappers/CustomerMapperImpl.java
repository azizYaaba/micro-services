package org.epo.ebank.mappers;

import org.epo.ebank.dtos.CustomerDTO;
import org.epo.ebank.entities.Customer;
import org.epo.ebank.repositories.CustomerRepository;
import org.epo.ebank.services.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapperImpl {


    public CustomerDTO fromCustomer(Customer customer){
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setName(customer.getName());
        customerDTO.setEmail(customer.getEmail());
        return customerDTO;
    }

    public Customer fromCustomerDTO(CustomerDTO customerDTO){
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO,customer);
        return customer;
    }
}
