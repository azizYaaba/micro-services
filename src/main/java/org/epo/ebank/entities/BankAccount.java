package org.epo.ebank.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.epo.ebank.enums.AccountStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",length =4 )
@Data @NoArgsConstructor @AllArgsConstructor
public class BankAccount {
    @Id
    private Long id;

    private Date createdId;

    private double balance;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "bankaccount")
    private List<AccountOperation> accountOperations;




}
