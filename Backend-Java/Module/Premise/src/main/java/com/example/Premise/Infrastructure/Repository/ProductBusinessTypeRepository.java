package com.example.Premise.Infrastructure.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Premise.Models.Product.ProductBusinessTypeModel;

public interface ProductBusinessTypeRepository
        extends JpaRepository<ProductBusinessTypeModel, ProductBusinessTypeModel.ProductBusinessTypeId> {
}
