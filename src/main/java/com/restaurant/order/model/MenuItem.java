package com.restaurant.order.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MenuItem {
    private String name;
    private String category;
    private double price;
    private int quantity;
}
