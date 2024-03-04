package com.restaurant.order.service;

import com.restaurant.order.exception.OrderException;
import com.restaurant.order.model.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuService {
    public List<Menu> getMenuItemsByCategory(String category) throws OrderException;
}
