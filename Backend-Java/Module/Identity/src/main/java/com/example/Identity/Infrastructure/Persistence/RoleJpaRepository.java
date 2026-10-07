package com.example.Identity.Infrastructure.Persistence;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Identity.Models.Role.RoleModel;

public interface RoleJpaRepository extends JpaRepository<RoleModel, UUID> {
    Optional<RoleModel> findByRoleCode(String roleCode);
}
