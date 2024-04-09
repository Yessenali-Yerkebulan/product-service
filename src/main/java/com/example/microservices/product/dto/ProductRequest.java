/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.microservices.product.dto;

import java.math.BigDecimal;

/**
 *
 * @author Yerkebulan
 */
public record ProductRequest(String id, String name, String description, BigDecimal price) {
    
}
