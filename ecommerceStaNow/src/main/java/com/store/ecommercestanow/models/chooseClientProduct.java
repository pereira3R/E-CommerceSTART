package com.store.ecommercestanow.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = chooseClientProduct.TABLE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class chooseClientProduct {

    public static final String TABLE_NAME = "chooseClientProduct";
    public interface createChooseClientProduct{}

    @ManyToOne
    @JoinColumn(name = "client_id") //Terminar
    private long idClient;

    @ManyToOne
    @JoinColumn(name = "client_id")//Terminar
    private long idProduct;


}
