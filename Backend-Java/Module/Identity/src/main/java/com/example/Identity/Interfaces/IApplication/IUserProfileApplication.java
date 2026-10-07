package com.example.Identity.Interfaces.IApplication;

import java.util.UUID;

import com.example.Identity.Models.Profile.UserProfileModel;

public interface IUserProfileApplication {
    UserProfileModel getByIdentityCode(String identityCode);
    UserProfileModel getByAccountId(UUID accountId);
    UserProfileModel save(UserProfileModel profile);
}
