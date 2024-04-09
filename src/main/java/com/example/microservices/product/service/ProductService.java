/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.microservices.product.service;

import com.example.microservices.product.dto.ProductRequest;
import com.example.microservices.product.dto.ProductResponse;
import com.example.microservices.product.model.Product;
import java.util.List;

/**
 *
 * @author Yerkebulan
 */
public interface ProductService {
    public ProductResponse createProduct(ProductRequest productRequest);

    public List<ProductResponse> getAllProducts();
}
