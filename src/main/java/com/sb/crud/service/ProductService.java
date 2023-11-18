package com.sb.crud.service;

import com.sb.crud.model.Product;
import com.sb.crud.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Transactional
    public List<Product> getProductsStartingWithK() {
        return productRepo.findByNameStartingWithK();
    }

    @Transactional
    public List<Product> getProductsStartingWithR() {
        return productRepo.findByNameStartingWithR();
    }

    @Transactional
    public List<Product> getProductsStartingWithD() {
        return productRepo.findByNameStartingWithD();
    }

    public List<Product> getProductsStartingWithDynamicLetter(String letter) {
        return productRepo.findByNameStartingWithDynamicLetter(letter);
    }

    public List<Product> getProductsContaingLetter(String letter) {
        return productRepo.findByNameContainingLetterS("%" + letter.toLowerCase() + "%");
    }


}
