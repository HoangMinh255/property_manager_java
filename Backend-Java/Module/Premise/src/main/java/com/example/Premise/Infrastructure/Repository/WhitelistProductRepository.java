package com.example.Premise.Infrastructure.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Premise.Models.Product.WhitelistProductModel;

public interface WhitelistProductRepository extends JpaRepository<WhitelistProductModel, UUID> {
}
