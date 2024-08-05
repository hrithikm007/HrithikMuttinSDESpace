package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

//todo    Derived Name method, because based on Name Spring JPA is querying the DB
    Optional<Customer> findByMobileNumber(String mobileNumber);

    Optional<Customer> findByEmailAndMobileNumber(String email, String mobileNumber);
}
