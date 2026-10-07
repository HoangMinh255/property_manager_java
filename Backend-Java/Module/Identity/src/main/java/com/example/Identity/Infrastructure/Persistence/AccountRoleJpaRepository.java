package com.example.Identity.Infrastructure.Persistence;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Identity.Models.Account.AccountRoleModel;

public interface AccountRoleJpaRepository extends JpaRepository<AccountRoleModel, AccountRoleModel.AccountRoleModelId> {
    void deleteByIdAccountId(UUID accountId);
}
