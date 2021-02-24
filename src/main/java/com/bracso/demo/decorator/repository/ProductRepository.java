package com.bracso.demo.decorator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bracso.demo.decorator.donain.Product;


/**
 * @author Capgemini
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
