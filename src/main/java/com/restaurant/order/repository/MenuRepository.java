package com.restaurant.order.repository;

import com.restaurant.order.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    public List<Menu> findByCategory(String category);
}
