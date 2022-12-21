package org.epo.ebank.repositories;

import org.epo.ebank.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CustomerRepository extends JpaRepository<Customer,Long> {
}
