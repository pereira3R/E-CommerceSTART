package com.store.ecommercestanow.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = Product.TABLE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

    public static final String TABLE_NAME = "Product";
    public interface createProduct{}

    //Functional Request
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Functional Request
    @Column(name = "name", nullable = false, unique = false)
    @NotEmpty(groups = createProduct.class)
    @NotNull(groups = createProduct.class)
    private String name;

    //Functional Request
    @Column(name = "name", nullable = false, unique = false)
    @NotEmpty(groups = createProduct.class)
    @NotNull(groups = createProduct.class)
    private double cost;

    //Functional Request
    @Column(name = "rebate", nullable = false, unique = false)
    @NotEmpty(groups = createProduct.class)
    @NotNull(groups = createProduct.class)
    private double rebate;

}
