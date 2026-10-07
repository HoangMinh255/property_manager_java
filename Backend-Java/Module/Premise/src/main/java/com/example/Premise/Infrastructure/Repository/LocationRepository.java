package com.example.Premise.Infrastructure.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Premise.Models.Premise.LocationModel;

public interface LocationRepository extends JpaRepository<LocationModel, UUID> {
}
