package org.epo.ebank.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("SA")
@Data @NoArgsConstructor @AllArgsConstructor
public class SavingAccount extends BankAccount{
    public double interestRate; //taux d'interet



}
