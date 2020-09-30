package com.example.crud.service;

import java.util.List;

import com.example.crud.model.Product;

public interface ProductService {

	List<Product> getProducts();

	Product addProducts(Product product);

	Product updateProducts(Product product);

	void deleteProducts(int id);

}
