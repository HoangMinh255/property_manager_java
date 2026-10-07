package com.example.Premise.Infrastructure.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Premise.Models.Premise.PremiseMediaModel;

public interface PremiseMediaRepository extends JpaRepository<PremiseMediaModel, Integer> {
}
