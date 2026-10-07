package com.example.Premise.Infrastructure.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Premise.Models.Premise.RentedPremiseModel;

public interface RentedPremiseRepository
        extends JpaRepository<RentedPremiseModel, RentedPremiseModel.RentedPremiseId> {
    boolean existsByIdContractId(UUID contractId);
}
