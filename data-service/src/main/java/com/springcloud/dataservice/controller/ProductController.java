package com.springcloud.dataservice.controller;

import com.springcloud.dataservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public Object products(){
        return productService.listProduct();
    }

}
