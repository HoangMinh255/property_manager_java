package com.example.Premise.Infrastructure.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Premise.Models.Business.BusinessTypeModel;

public interface BusinessTypeRepository extends JpaRepository<BusinessTypeModel, UUID> {
}
