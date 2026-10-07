package com.example.Identity.Infrastructure.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.Identity.Infrastructure.Persistence.PermissionJpaRepository;
import com.example.Identity.Interfaces.IRepository.PermissionRepository;
import com.example.Identity.Models.Permission.PermissionModel;

@Repository
public class PermissionRepositoryImpl implements PermissionRepository {
    private final PermissionJpaRepository delegate;
    public PermissionRepositoryImpl(PermissionJpaRepository delegate) { this.delegate = delegate; }
    public PermissionModel save(PermissionModel permission) { return delegate.save(permission); }
    public List<PermissionModel> findAll() { return delegate.findAll(); }
    public Optional<PermissionModel> findById(UUID id) { return delegate.findById(id); }
    public Optional<PermissionModel> findByCode(String code) { return delegate.findByPermissionCode(code); }
}
