package com.springcloud.feignservice.service;

import com.springcloud.feignservice.common.FeignHystrix;
import com.springcloud.feignservice.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

// 通过 注解方式 访问数据DATA-SERVICE
@FeignClient(value = "DATA-SERVICE", fallback = FeignHystrix.class)
public interface FeignService {

    @GetMapping("/products")
    public List<Product> listProducts();
}
