package com.springcloud.feignservice.service;

import com.springcloud.feignservice.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired FeignService feignService;

    public List<Product> getProducts(){
        return feignService.listProducts();
    }
}
