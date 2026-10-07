package com.example.Identity.Interfaces.IRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.Identity.Models.Role.RoleModel;

public interface RoleRepository {
    RoleModel save(RoleModel role);
    List<RoleModel> findAll();
    Optional<RoleModel> findById(UUID id);
    Optional<RoleModel> findByCode(String code);
}
