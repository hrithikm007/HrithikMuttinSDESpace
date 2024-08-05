package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "accounts")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends  BaseEntity {

    @Column(name="customer_id")
    private Long customerId;
//    Snake Case Naming Convention of JPA

    @Column(name="account_number")
    @Id
    private Long accountNumber;


    private String accountType;
    private String branchAddress;

}
