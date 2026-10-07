package com.example.Identity.Infrastructure.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Identity.Models.Role.RolePermissionModel;

public interface RolePermissionJpaRepository extends
        JpaRepository<RolePermissionModel, RolePermissionModel.RolePermissionModelId> {
}
