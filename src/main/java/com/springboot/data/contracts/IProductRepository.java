package com.springboot.data.contracts;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entities.Product;

@Repository
public interface IProductRepository  extends MongoRepository<Product, String> {

}
