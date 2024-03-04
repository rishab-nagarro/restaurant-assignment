package com.restaurant.order.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Order {
    @NotEmpty(message = "MenuItem can't be null")
    private List<MenuItem> items;
    @NotNull
    @JsonProperty(value = "isFirstOrder")
    private boolean isFirstOrder;
}
