package com.example.springsercurity.repository;

import com.example.springsercurity.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    Account findAllByUserName(String username);

}
