package com.plantae.co.plantae.co.repository;

import com.plantae.co.plantae.co.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByCategoryId(Long categoryId);
}
