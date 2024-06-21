package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "customer")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity{

    private Long customer_id;

    @Column(name = "account_number")
    @Id
    private Long account_number;


    private String account_type;
    private String branch_address;


}
