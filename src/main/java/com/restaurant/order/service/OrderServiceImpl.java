package com.restaurant.order.service;

import com.restaurant.order.exception.OrderException;
import com.restaurant.order.model.BillResponse;
import com.restaurant.order.model.Discount;
import com.restaurant.order.model.MenuItem;
import com.restaurant.order.model.Order;
import com.restaurant.order.util.AppConstant;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    public Discount calculateFirstOrderDiscount(Order order) throws OrderException {
        try {
            Discount discount = new Discount();
            double foodDiscount = 0.3;
            double liquorDiscount = 0.1;
            double totalDiscount = 0;
            double foodTotal = 0;
            double liqourTotal = 0;
            for (MenuItem item : order.getItems()) {
                if (AppConstant.FOOD.equals(item.getCategory())) {
                    foodTotal += item.getPrice() * item.getQuantity();
                } else if (AppConstant.LIQUOR.equals(item.getCategory())) {
                    liqourTotal += item.getPrice() * item.getQuantity();
                }
            }
            totalDiscount = (foodTotal * foodDiscount) + (liqourTotal * liquorDiscount);
            discount.setDiscount(totalDiscount);
            discount.setMessage(AppConstant.SUCCESS);
            return discount;
        } catch (Exception ex) {
            throw new OrderException(ex.getMessage());
        }
    }

    public Discount calculateHappyDiscount(Order order) throws OrderException {
        try {
            Discount discount = new Discount();
            double foodDiscount = 0.2;
            double totalDiscount = 0;
            double foodTotal = 0;
            for (MenuItem item : order.getItems()) {
                if (AppConstant.FOOD.equals(item.getCategory())) {
                    foodTotal += item.getPrice() * item.getQuantity();
                }
            }
            totalDiscount = foodTotal * foodDiscount;
            discount.setDiscount(totalDiscount);
            discount.setMessage(AppConstant.SUCCESS);
            return discount;
        } catch (Exception ex) {
            throw new OrderException(ex.getMessage());
        }
    }

    public BillResponse calculateTotalBill(Order order, double discount) throws OrderException {
        try {
            double totalBill = 0;
            for (MenuItem item : order.getItems()) {
                totalBill += item.getPrice() * item.getQuantity();
            }
            BillResponse bill = new BillResponse();
            bill.setTotalAmount(totalBill - discount);
            return bill;

        } catch (Exception ex) {
            throw new OrderException(ex.getMessage());
        }
    }

}
