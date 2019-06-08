package com.springcloud.dataservice.service;

import com.springcloud.dataservice.domain.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Value("${server.port}")
    String port;

    public List<Product> listProduct(){
        //查询数据
        List<Product> list = new ArrayList<>();

        list.add(new Product(1, "1端口："+ port, 10));
        list.add(new Product(2, "2端口："+ port, 15));
        list.add(new Product(3, "3端口："+ port, 20));
        return list;
    }
}
