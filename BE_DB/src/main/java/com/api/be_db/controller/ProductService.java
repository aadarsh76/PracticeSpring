package com.api.be_db.controller;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.api.be_db.products.Product;

public interface ProductService {

	Product createProduct(Product product);
	
	Product updateProduct(Product product);
	
	List<Product> getAllProduct();
	
	Product getProductById(long productId);
	
	void deleteProduct(long id);
	
}
