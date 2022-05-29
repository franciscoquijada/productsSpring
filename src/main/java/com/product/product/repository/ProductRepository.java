package com.product.product.repository;

import com.product.product.entity.ProductEntity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}