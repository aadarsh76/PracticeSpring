package com.api.be_db.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.be_db.exception.ResourceNotFoundException;
import com.api.be_db.products.Product;

@Service
@Transactional
public class ProductServiceIMPL implements ProductService{

	@Autowired
	ProductRepository productrepo;
	
	@Override
	public Product createProduct(Product product) {
		return this.productrepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		
		Optional<Product> productDb=productrepo.findById(product.getId());
		 
		if(productDb.isPresent()) {
			Product updateProduct=productDb.get();
			updateProduct.setId(product.getId());
			updateProduct.setName(product.getName());
			updateProduct.setDescription(product.getDescription());
			return this.productrepo.save(updateProduct);
		}
		else {
			throw new ResourceNotFoundException("Record not found" + product.getId());
		}
		
		
	}

	@Override
	public List<Product> getAllProduct() {
		return this.productrepo.findAll();
	}

	@Override
	public Product getProductById(long productId) {
		
		Optional<Product> productDb=productrepo.findById(productId);
		
		if(productDb.isPresent()) {
			return productDb.get();
		}
		else {
			throw new ResourceNotFoundException("Record not found" + productId);
		}
	}

	@Override
	public void deleteProduct(long id) {
		
		Optional<Product> productDb=productrepo.findById(id);
		
		if(productDb.isPresent()) {
			this.productrepo.delete(productDb.get());
		}
		else {
			throw new ResourceNotFoundException("Record not found" + id);
		}
	}

	
}
