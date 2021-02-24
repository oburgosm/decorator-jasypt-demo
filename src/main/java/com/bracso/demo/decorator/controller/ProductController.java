package com.bracso.demo.decorator.controller;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bracso.demo.decorator.donain.Product;
import com.bracso.demo.decorator.repository.ProductRepository;

/**
 * @author Capgemini
 */
@Validated
@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Resource
    private ProductRepository productRepository;

    /**
     * Inserta dos productos en el ds1
     *
     * @param name
     * @param name
     * @return
     * @throws SQLException
     */
    @GetMapping("/insert/{name}")
    @Transactional
    public List<Product> insert(@PathVariable String name)
            throws SQLException {
        Product newproduct = new Product();
        newproduct.setName(name);
        this.productRepository.saveAndFlush(newproduct);
        return this.findAll();
    }

    /**
     * Lista el repository1
     *
     * @return
     */
    @GetMapping("list")
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

}
