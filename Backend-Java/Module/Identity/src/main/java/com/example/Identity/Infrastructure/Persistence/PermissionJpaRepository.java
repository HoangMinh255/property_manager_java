package com.example.Identity.Infrastructure.Persistence;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Identity.Models.Permission.PermissionModel;

public interface PermissionJpaRepository extends JpaRepository<PermissionModel, UUID> {
    Optional<PermissionModel> findByPermissionCode(String permissionCode);
}
