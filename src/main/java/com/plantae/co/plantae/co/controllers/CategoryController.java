package com.plantae.co.plantae.co.controllers;

import com.plantae.co.plantae.co.entities.Category;
import com.plantae.co.plantae.co.services.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")

@CrossOrigin(origins = "http://localhost:5173")
public class CategoryController {
	private final CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}


	@GetMapping
	public List<Category> getAllCategories() {
		return categoryService.getAllCategories();
	}
}
