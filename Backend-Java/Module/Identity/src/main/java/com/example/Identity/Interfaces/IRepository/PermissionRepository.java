package com.example.Identity.Interfaces.IRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.Identity.Models.Permission.PermissionModel;

public interface PermissionRepository {
    PermissionModel save(PermissionModel permission);
    List<PermissionModel> findAll();
    Optional<PermissionModel> findById(UUID id);
    Optional<PermissionModel> findByCode(String code);
}
