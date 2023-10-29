package com.api.be_db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.api.be_db.products.Product;

@RestController // Set a base path for this controller
public class ProductController {

    @Autowired
    public ProductService productService;

    @GetMapping("/products")
    public ResponseEntity < List < Product >> getAllProduct() {
        return ResponseEntity.ok().body(productService.getAllProduct());
    }

    @GetMapping("/products/{id}") // Use path variable directly in mapping
    public ResponseEntity<Product> getProductById(@PathVariable long id) {
        return ResponseEntity.ok().body(productService.getProductById(id));
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok().body(productService.createProduct(product));
    }

    @PutMapping("/products/{id}") // Use path variable directly in mapping
    public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody Product product) {
        product.setId(id);
        return ResponseEntity.ok().body(productService.updateProduct(product));
    }

    @DeleteMapping("/products/{id}") // Use path variable directly in mapping
    public HttpStatus deleteProduct(@PathVariable long id) {
        this.productService.deleteProduct(id);
        return HttpStatus.OK;
    }
}
