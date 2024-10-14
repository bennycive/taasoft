package com.tanzania.taasoft.controller;

import com.tanzania.taasoft.model.Product;
import com.tanzania.taasoft.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

     @Autowired
     ProductService service;

     @GetMapping("/products")
    public List<Product> getProducts()
    {

         return   service.getProducts();

    }

    @GetMapping("/products/{prodId}")
    public  Product getProductById(@PathVariable int prodId){
        return  service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod)
    {

         System.out.println(prod);
         service.addProducts(prod);
    }



}
