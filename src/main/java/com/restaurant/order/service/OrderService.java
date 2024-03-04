package com.restaurant.order.service;

import com.restaurant.order.exception.OrderException;
import com.restaurant.order.model.BillResponse;
import com.restaurant.order.model.Discount;
import com.restaurant.order.model.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    public Discount calculateFirstOrderDiscount(Order order) throws OrderException;
    public Discount calculateHappyDiscount(Order order) throws OrderException;
    public BillResponse calculateTotalBill(Order order, double discount) throws OrderException;
}
