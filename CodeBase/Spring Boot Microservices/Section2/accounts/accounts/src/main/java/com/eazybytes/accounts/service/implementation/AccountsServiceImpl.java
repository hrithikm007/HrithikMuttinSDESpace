package com.eazybytes.accounts.service.implementation;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.repository.AccountsRepository;
import com.eazybytes.accounts.repository.CustomerRepository;
import com.eazybytes.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     * When we have only 1 constructor having all the params of the class
     * Spring will automatically Autowire them, and we don't need to do explicitly
     * @param accountsRepository
     * @param customerRepository
     */
    public AccountsServiceImpl(AccountsRepository accountsRepository, CustomerRepository customerRepository) {}

    @Override
    public void createAccount(CustomerDto accountDto) {

    }
}
