package com.lat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lat.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long>{

}
