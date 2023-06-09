package com.example.springsercurity.service;

import com.example.springsercurity.configuration.AccountDetails;
import com.example.springsercurity.model.Account;
import com.example.springsercurity.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountDetailService implements UserDetailsService {
        @Autowired
        AccountRepository acountRepository;
        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            Account account = acountRepository.findAllByUserName(username);
            if (account == null){
                throw new UsernameNotFoundException(username);
            }
            return new AccountDetails(account);
        }
}


