package com.restaurant.order.controller;


import com.restaurant.order.exception.OrderException;
import com.restaurant.order.model.*;
import com.restaurant.order.service.MenuService;
import com.restaurant.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final MenuService menuService;

    @PostMapping("/calculate/bill")
    public ResponseEntity<BillResponse> calculateBill(@Validated @RequestBody Order order) throws OrderException {
        Discount discount = new Discount();
        if (order.isFirstOrder()) {
             discount = orderService.calculateFirstOrderDiscount(order);
        } else {
             discount = orderService.calculateHappyDiscount(order);
        }
        BillResponse bill = orderService.calculateTotalBill(order, discount.getDiscount());
        return ResponseEntity.ok(bill);
    }

    @GetMapping("/get/menu/{category}")
    public ResponseEntity<List<Menu>> getFoodItems(@PathVariable String category) throws OrderException {
        List<Menu> foodItems = menuService.getMenuItemsByCategory(category);
        return ResponseEntity.ok(foodItems);
    }

}
