package com.api.be_db.controller;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.api.be_db.products.Product;

public interface ProductRepository extends MongoRepository<Product,Long>{

}
