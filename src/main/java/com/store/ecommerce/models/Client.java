package com.store.ecommerce.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = Client.TABLE_NAME)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    public static final String TABLE_NAME = "client";
    public interface CreateClient{}
    public interface UpdateClient{}

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "old", nullable = false, unique = false)
    @NotNull(groups = CreateClient.class)
    @NotEmpty(groups = CreateClient.class)
    private long old;

    @Column(name = "name", nullable = false, unique = false)
    @NotNull(groups = CreateClient.class)
    @NotEmpty(groups = CreateClient.class)
    private String name;

    @Column(name = "cpf", nullable = false, unique = true)
    @NotNull(groups = CreateClient.class)
    @NotEmpty(groups = CreateClient.class)
    private String cpf;

    @Column(name = "password", nullable = false, unique = true)
    @NotNull(groups = {CreateClient.class, UpdateClient.class})
    @NotEmpty(groups = {CreateClient.class, UpdateClient.class})
    @Size(groups = {CreateClient.class, UpdateClient.class}, min = 8, max = 60)
    private String password;

    @Column(name = "cart", nullable = false, unique = false)
    @NotNull(groups = {CreateClient.class, UpdateClient.class})
    @NotEmpty(groups = {CreateClient.class, UpdateClient.class})
    private ShoppingCart clientCart;
}