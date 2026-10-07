package com.example.Identity.Presentation.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.Identity.Interfaces.IApplication.IAuthorizationApplication;
import com.example.Identity.Models.Permission.PermissionModel;
import com.example.Identity.Models.Role.RoleModel;

@RestController
@RequestMapping("/api/authorization")
public class AuthorizationController {
    private final IAuthorizationApplication application;

    public AuthorizationController(IAuthorizationApplication application) {
        this.application = application;
    }

    @GetMapping("/roles")
    public List<RoleModel> getRoles() {
        return application.getRoles();
    }

    @GetMapping("/permissions")
    public List<PermissionModel> getPermissions() {
        return application.getPermissions();
    }

    @PostMapping("/roles")
    public RoleModel addRole(@RequestBody RoleModel role) {
        return application.saveRole(role);
    }

    @PostMapping("/permissions")
    public PermissionModel addPermission(@RequestBody PermissionModel permission) {
        return application.savePermission(permission);
    }
}
