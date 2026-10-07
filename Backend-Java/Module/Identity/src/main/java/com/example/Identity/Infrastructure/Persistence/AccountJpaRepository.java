package com.example.Identity.Infrastructure.Persistence;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Identity.Models.Account.AccountModel;

public interface AccountJpaRepository extends JpaRepository<AccountModel, UUID> {
    Optional<AccountModel> findByAccountEmailIgnoreCase(String email);
    Page<AccountModel> findByAccountIsActive(boolean active, Pageable pageable);
}
