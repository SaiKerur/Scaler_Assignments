package com.scaler.ecommerce_demo.service;

import com.scaler.ecommerce_demo.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO getProductById(Long id);

    List<ProductDTO> getAllProducts();

    ProductDTO createProduct(ProductDTO productDTO);

    ProductDTO updateProduct(Long id, ProductDTO productDTO);

    boolean deleteProduct(Long id);

}