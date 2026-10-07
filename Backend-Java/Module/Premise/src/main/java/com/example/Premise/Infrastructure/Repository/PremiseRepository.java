package com.example.Premise.Infrastructure.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Premise.Models.Premise.PremiseModel;

public interface PremiseRepository extends JpaRepository<PremiseModel, UUID> {
}
