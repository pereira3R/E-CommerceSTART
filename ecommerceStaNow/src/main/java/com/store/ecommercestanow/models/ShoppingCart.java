package com.store.ecommercestanow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = ShoppingCart.TABLE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ShoppingCart {

    public static final String TABLE_NAME = "ShoppingCart";
    public interface createChooseClientProduct{}

    private long id;

    private int quantity;

    private double value;
}
