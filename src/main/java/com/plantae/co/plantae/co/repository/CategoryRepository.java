package com.plantae.co.plantae.co.repository;

import com.plantae.co.plantae.co.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  CategoryRepository extends JpaRepository<Category, Long> {
}
