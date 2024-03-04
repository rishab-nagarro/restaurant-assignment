package com.restaurant.order.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "menu")
@Data
@NoArgsConstructor
public class Menu {
    @Id
    private int id;
    private String name;
    private String category;
    private double price;
}
