package com.springcloud.feignservice.controller;

import com.springcloud.feignservice.domain.Product;
import com.springcloud.feignservice.service.FeignService;
import com.springcloud.feignservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RefreshScope
public class ProductController {
    @Value("${version}")
    String version;

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public Object products(Model m) {
        List<Product> ps = productService.getProducts();
        m.addAttribute("ps", ps);
        m.addAttribute("version",version);
        return "products";
    }

}
