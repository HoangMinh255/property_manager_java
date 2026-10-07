package com.example.Identity.Interfaces.IApplication;

import java.util.List;

import com.example.Identity.Models.Permission.PermissionModel;
import com.example.Identity.Models.Role.RoleModel;

public interface IAuthorizationApplication {
    List<RoleModel> getRoles();
    List<PermissionModel> getPermissions();
    RoleModel saveRole(RoleModel role);
    PermissionModel savePermission(PermissionModel permission);
}
