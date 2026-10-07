package com.example.Identity.Infrastructure.Persistence;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Identity.Models.Account.AccountAdditionalPermissionModel;

public interface AccountAdditionalPermissionJpaRepository extends
        JpaRepository<AccountAdditionalPermissionModel, AccountAdditionalPermissionModel.AccountAdditionalPermissionModelId> {
    void deleteByIdAccountId(UUID accountId);
}
