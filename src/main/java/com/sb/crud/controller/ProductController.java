package com.sb.crud.controller;

import com.sb.crud.model.Product;
import com.sb.crud.repository.ProductRepo;
import com.sb.crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public ResponseEntity<String> saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
        return ResponseEntity.ok("Product saved successfully");
    }

    @GetMapping("/getProduct")
    public Product getProduct(@RequestParam String s) {
        return productRepo.findByPname(s);
    }

    @GetMapping("getProductsByK")
    public List<Product> getProductsStartingWithK() {
        return productService.getProductsStartingWithK();
    }

    @GetMapping("getProductsByR")
    public List<Product> getProductsStartingWithR() {
        return productService.getProductsStartingWithR();
    }

    @GetMapping("getProductsByD")
    public List<Product> getProductsStartingWithD() {
        return productService.getProductsStartingWithD();
    }

    @GetMapping("/getProductsByDynamicLetter/{LETTER}")
    public List<Product> getProductsStartingWithDynamicLetter(@PathVariable("LETTER") String letter) {
        return productService.getProductsStartingWithDynamicLetter(letter);
    }


    @GetMapping("/getProductsContaingLetter/{LETTER}")
    public List<Product> getProductsContaingLetter(@PathVariable("LETTER") String letter) {
        return productService.getProductsContaingLetter(letter);
    }

}
