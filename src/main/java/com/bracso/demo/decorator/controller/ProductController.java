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
 * @author <a href="mailto:oscarbma@ext.inditex.com">Óscar Burgos Martín</a>
 */
@Validated
@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Resource
    private ProductRepository productRepository;

    @GetMapping("/insert/{name}")
    @Transactional
    public List<Product> insert(@PathVariable String name)
            throws SQLException {
        Product newproduct = new Product();
        newproduct.setName(name);
        this.productRepository.saveAndFlush(newproduct);
        return this.findAll();
    }


    @GetMapping("list")
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

}
