package com.scaler.ecommerce_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
//@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {
    private String message;
    private Object data;

    public ResponseTemplate(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    // Getters and setters
}

