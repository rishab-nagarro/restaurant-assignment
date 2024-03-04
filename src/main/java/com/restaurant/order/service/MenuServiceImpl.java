package com.restaurant.order.service;

import com.restaurant.order.exception.OrderException;
import com.restaurant.order.model.Menu;
import com.restaurant.order.repository.MenuRepository;
import com.restaurant.order.util.AppConstant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{

    private final MenuRepository menuRepository;
    public List<Menu> getMenuItemsByCategory(String category) throws OrderException {
        try {
            if (AppConstant.FOOD.equals(category) || AppConstant.ALCOHOLIC.equals(category) || AppConstant.NON_ALCOHOLIC.equals(category)) {
                return menuRepository.findByCategory(category);
            } else {
                throw new OrderException(AppConstant.INVALID_VALUE);
            }
        }catch (Exception ex){
            throw new OrderException(ex.getMessage());
        }
    }
}
