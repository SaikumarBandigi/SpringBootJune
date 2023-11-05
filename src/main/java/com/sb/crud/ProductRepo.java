package com.sb.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    Product findByPname(String s);

    @Query(name = "Product.findByNameStartingWithK")
    List<Product> findByNameStartingWithK();

    @Query("SELECT p FROM Product p WHERE LOWER(p.pname) LIKE 'r%'")
    List<Product> findByNameStartingWithR();

    @Query(value = "SELECT * FROM Product WHERE LOWER(pname) LIKE 'd%'", nativeQuery = true)
    List<Product> findByNameStartingWithD();

    @Query("SELECT p FROM Product p WHERE LOWER(p.pname) LIKE :letter%")
    List<Product> findByNameStartingWithDynamicLetter(@Param("letter") String letter);


}
