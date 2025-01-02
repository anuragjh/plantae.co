package com.plantae.co.plantae.co.services;

import com.plantae.co.plantae.co.entities.Category;
import com.plantae.co.plantae.co.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

	private final CategoryRepository categoryRepository;

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}
}
