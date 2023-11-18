package com.sb.crud.repository;

import com.sb.crud.model.Product;
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

    @Query("select p from Product p WHERE LOWER(p.pname) LIKE :letter%")
    List<Product> findByNameStartingWithDynamicLetter(@Param("letter") String LETTER);


    // The difference in syntax between using @Param and not using it does not affect the behavior of the method.
    /*
     @Query("select p from Product p WHERE LOWER(p.pname) LIKE :letter%")
    List<Product> findByNameStartingWithDynamicLetter(@Param("letter") String LETTER);  // @Param("letter") and :letter should be same
     */
//    @Query("SELECT p FROM Product p WHERE LOWER(p.pname) LIKE :letter%")
//    List<Product> findByNameStartingWithDynamicLetter(String letter);


    @Query("SELECT p FROM Product p WHERE LOWER(p.pname) LIKE :LETTER")
    List<Product> findByNameContainingLetterS(@Param("LETTER") String letter);

}


