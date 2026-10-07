package com.example.Premise.Infrastructure.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Premise.Models.Business.PremiseBusinessTypeModel;

public interface PremiseBusinessTypeRepository
        extends JpaRepository<PremiseBusinessTypeModel, PremiseBusinessTypeModel.PremiseBusinessTypeId> {
}
