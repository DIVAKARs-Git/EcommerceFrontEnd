package com.lat.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lat.entity.Category;
import com.lat.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findByCategory(Category category);

}
