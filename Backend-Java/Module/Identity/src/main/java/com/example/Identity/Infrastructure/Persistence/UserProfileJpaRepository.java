package com.example.Identity.Infrastructure.Persistence;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Identity.Models.Profile.UserProfileModel;

public interface UserProfileJpaRepository extends JpaRepository<UserProfileModel, String> {
    Optional<UserProfileModel> findByUserProfileAccountId(UUID accountId);
}
