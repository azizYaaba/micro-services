package org.epo.ebank.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.epo.ebank.dtos.CustomerDTO;
import org.epo.ebank.repositories.CustomerRepository;
import org.epo.ebank.services.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class CustomerRestController {
    private final CustomerRepository customerRepository;
    private CustomerService customerService;

    @RequestMapping("/customers")
    public List<CustomerDTO> customers(){ return customerService.listCustomer();}

    @PostMapping("/customers")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.saveCustomer(customerDTO);
    }


}
