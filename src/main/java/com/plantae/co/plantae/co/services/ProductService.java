package com.plantae.co.plantae.co.services;

import com.plantae.co.plantae.co.entities.Product;
import com.plantae.co.plantae.co.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> getAllProducts () {
		return productRepository.findAll();
	}

	public List<Product> getAllByCategoryId(Long categoryId){
		return productRepository.findByCategoryId(categoryId);
	}
}
