package com.springcloud.feignservice.common;

import com.springcloud.feignservice.domain.Product;
import com.springcloud.feignservice.service.FeignService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FeignHystrix implements FeignService {

    @Override
    public List<Product> listProducts() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(0,"数据微服务不可用",0));
        return result;
    }
}
