package com.example.Identity.Interfaces.IRepository;

import java.util.Optional;
import java.util.UUID;

import com.example.Identity.Models.Profile.UserProfileModel;

public interface UserProfileRepository {
    UserProfileModel save(UserProfileModel profile);
    Optional<UserProfileModel> findById(String identityCode);
    Optional<UserProfileModel> findByAccountId(UUID accountId);
}
