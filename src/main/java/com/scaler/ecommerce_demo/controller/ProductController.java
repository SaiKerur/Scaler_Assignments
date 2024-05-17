package com.scaler.ecommerce_demo.controller;

import com.scaler.ecommerce_demo.dto.ProductDTO;
import com.scaler.ecommerce_demo.dto.ResponseTemplate;
import com.scaler.ecommerce_demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;


    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {
        ProductDTO productDTO = productService.getProductById(id);
        if (productDTO != null) {
            return ResponseEntity.ok(productDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<ProductDTO> productDTOs = productService.getAllProducts();
        return ResponseEntity.ok(productDTOs);
    }

    @PostMapping("/")
    public ResponseEntity<ResponseTemplate> createProduct(@RequestBody ProductDTO productDTO) {
        ProductDTO createdProductDTO = productService.createProduct(productDTO);
        ResponseTemplate response = new ResponseTemplate("Product created successfully", createdProductDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseTemplate> updateProduct(@PathVariable Long id, @RequestBody ProductDTO productDTO) {
        ProductDTO updatedProductDTO = productService.updateProduct(id, productDTO);
        if (updatedProductDTO != null) {
            ResponseTemplate response = new ResponseTemplate("Product updated successfully", updatedProductDTO);
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseTemplate> deleteProduct(@PathVariable Long id) {
        boolean deleted = productService.deleteProduct(id);
        if (deleted) {
            ResponseTemplate response = new ResponseTemplate("Product deleted successfully", null);
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

