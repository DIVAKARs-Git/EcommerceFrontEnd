package com.lat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lat.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
