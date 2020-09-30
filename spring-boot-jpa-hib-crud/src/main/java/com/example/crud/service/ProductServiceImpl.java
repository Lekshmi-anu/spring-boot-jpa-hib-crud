package com.example.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Product;
import com.example.crud.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repository;
	

	@Override
	public List<Product> getProducts() {
		return repository.findAll();
	}

    @Override
	public Product addProducts(Product product) {
		return repository.save(product);
	}

	@Override
	public Product updateProducts(Product product) {
		return repository.save(product);
	}

	@Override
	public void deleteProducts(int id) {
		repository.delete(id);
	}

}
