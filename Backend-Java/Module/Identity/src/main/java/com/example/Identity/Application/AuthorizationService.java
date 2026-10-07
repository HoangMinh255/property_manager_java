package com.example.Identity.Application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Identity.Interfaces.IApplication.IAuthorizationApplication;
import com.example.Identity.Interfaces.IRepository.PermissionRepository;
import com.example.Identity.Interfaces.IRepository.RoleRepository;
import com.example.Identity.Models.Permission.PermissionModel;
import com.example.Identity.Models.Role.RoleModel;

@Service
public class AuthorizationService implements IAuthorizationApplication {
    private final RoleRepository roles;
    private final PermissionRepository permissions;

    public AuthorizationService(RoleRepository roles, PermissionRepository permissions) {
        this.roles = roles;
        this.permissions = permissions;
    }

    public List<RoleModel> getRoles() { return roles.findAll(); }
    public List<PermissionModel> getPermissions() { return permissions.findAll(); }
    public RoleModel saveRole(RoleModel role) { return roles.save(role); }
    public PermissionModel savePermission(PermissionModel permission) { return permissions.save(permission); }
}
