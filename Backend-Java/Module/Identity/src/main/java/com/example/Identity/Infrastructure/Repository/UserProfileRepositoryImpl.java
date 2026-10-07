package com.example.Identity.Infrastructure.Repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.Identity.Infrastructure.Persistence.UserProfileJpaRepository;
import com.example.Identity.Interfaces.IRepository.UserProfileRepository;
import com.example.Identity.Models.Profile.UserProfileModel;

@Repository
public class UserProfileRepositoryImpl implements UserProfileRepository {
    private final UserProfileJpaRepository delegate;
    public UserProfileRepositoryImpl(UserProfileJpaRepository delegate) { this.delegate = delegate; }
    public UserProfileModel save(UserProfileModel profile) { return delegate.save(profile); }
    public Optional<UserProfileModel> findById(String identityCode) { return delegate.findById(identityCode); }
    public Optional<UserProfileModel> findByAccountId(UUID accountId) {
        return delegate.findByUserProfileAccountId(accountId);
    }
}
