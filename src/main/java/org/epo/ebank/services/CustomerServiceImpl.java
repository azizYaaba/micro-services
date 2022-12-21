package org.epo.ebank.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.epo.ebank.dtos.CustomerDTO;
import org.epo.ebank.entities.Customer;
import org.epo.ebank.exceptions.CustomerNotFoundException;
import org.epo.ebank.mappers.CustomerMapperImpl;
import org.epo.ebank.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional @AllArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
    private CustomerService customerService;
    private CustomerMapperImpl dtoMapper;
    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {

        Customer customer = dtoMapper.fromCustomerDTO(customerDTO);
        Customer savedCustomer = customerRepository.save(customer);
        return dtoMapper.fromCustomer(savedCustomer);
    }

    @Override
    public List<CustomerDTO> listCustomer() {
        List<Customer> customers = customerRepository.findAll();
        return null;
    }

    @Override
    public CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException {
        return null;
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public void deleteCustomer(Long customerId) {

    }
}
