package com.example.tp.controller;

import com.example.tp.entites.Product;
import com.example.tp.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    Productservice productservice;


    @GetMapping("/Product")
    public List<Product> getall(){
        return  productservice.getAllProduct();

    }
    @GetMapping("/Product/{id}")
    public Product getbyid(@PathVariable long id ){
        return  productservice.getproduct(id);


    }
    @PostMapping("/Product")
    public void AddProduct(@RequestBody Product p ){
        productservice.AjouterProduit(p);

    }
    @PutMapping("/Product/{id}")
    public void Modifier(@RequestBody Product p,@PathVariable long id ){
        productservice.ModifierProduit(p,id);

    }


}
