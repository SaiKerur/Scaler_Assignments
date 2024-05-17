package com.scaler.ecommerce_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private String category;

    // Constructors, getters, and setters
}
