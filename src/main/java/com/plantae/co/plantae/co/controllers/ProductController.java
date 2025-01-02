package com.plantae.co.plantae.co.controllers;

import com.plantae.co.plantae.co.entities.Product;
import com.plantae.co.plantae.co.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")

@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {
	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/all")
	private List<Product> getAllProduct(){
		return productService.getAllProducts();
	}

	@GetMapping("/category/{categoryId}")
	private List<Product> getAllProductsById(@PathVariable Long categoryId){
		return productService.getAllByCategoryId(categoryId);
	}
}
