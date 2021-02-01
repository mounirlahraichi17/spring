package com.example.tp.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Collections;
@Data
@AllArgsConstructor@NoArgsConstructor
@Entity
public class Product  {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id;
    private String desc;
    private Double prix;

}
