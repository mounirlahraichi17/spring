package com.example.tp.repository;

import com.example.tp.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository  extends JpaRepository<Product, Long> {
}
