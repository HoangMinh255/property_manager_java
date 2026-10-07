package com.example.Identity.Infrastructure.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.Identity.Infrastructure.Persistence.RoleJpaRepository;
import com.example.Identity.Interfaces.IRepository.RoleRepository;
import com.example.Identity.Models.Role.RoleModel;

@Repository
public class RoleRepositoryImpl implements RoleRepository {
    private final RoleJpaRepository delegate;
    public RoleRepositoryImpl(RoleJpaRepository delegate) { this.delegate = delegate; }
    public RoleModel save(RoleModel role) { return delegate.save(role); }
    public List<RoleModel> findAll() { return delegate.findAll(); }
    public Optional<RoleModel> findById(UUID id) { return delegate.findById(id); }
    public Optional<RoleModel> findByCode(String code) { return delegate.findByRoleCode(code); }
}
