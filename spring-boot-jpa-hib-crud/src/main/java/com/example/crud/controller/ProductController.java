package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Product;
import com.example.crud.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/get-products")
	public List<Product> getProducts() {
		return service.getProducts();		
	}
	
	@PostMapping("/add-products")
	public Product addProducts(@RequestBody final Product product) {
		return service.addProducts(product);
	}
	
	@PutMapping("/update-products")
	public Product updateProducts(@RequestBody final Product product) {
		return service.updateProducts(product);
	}
	
	@DeleteMapping("/delete-products")
	public void deleteProducts(@PathVariable final int id) {
		service.deleteProducts(id);
	}

}
