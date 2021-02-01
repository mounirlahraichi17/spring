package com.example.tp.service;

import com.example.tp.entites.Product;
import com.example.tp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
public class Productservice {
    @Autowired
     ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return  productRepository.findAll();

    }
    public Product getproduct(long id){
        Optional<Product> p=productRepository.findById(id);
        if(p.isPresent()){
            return p.get();

        }

    return null;
    }
    public Product AjouterProduit(Product p){
        return productRepository.save(p);
    }
    public void ModifierProduit(Product nouveau_produit, long id ){
        Optional<Product> p=productRepository.findById(id);

        if(p.isPresent()){
            p.get().setDesc(nouveau_produit.getDesc());
            p.get().setPrix(nouveau_produit.getPrix());
            Product c= productRepository.save(p.get());

        }

    }
    public void SupprimerProduit( long id ){
        Optional<Product> p=productRepository.findById(id);

        if(p.isPresent()){
              productRepository.delete(p.get());

        }

    }
}
