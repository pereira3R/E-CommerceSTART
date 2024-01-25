package com.store.ecommercestanow.models;

import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Entity
@Table(name = Client.TABLE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client {

    public static final String TABLE_NAME = "Client";
    public interface createClient{}
    public interface updateClient{}

    //Functional Request
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Functional Request
    @Column(name = "username", nullable = false, unique = false)
    @NotNull(groups = createClient.class)
    @NotEmpty(groups = createClient.class)
    private String username;

    //Functional Request
    @Column(name = "phone", length = 15, nullable = false, unique = false)
    @NotNull(groups = createClient.class)
    @NotEmpty(groups = createClient.class)
    @Size(min = 12, max = 15)
    private String phone;

    //Not Functional Request
    @Column(name = "password", length = 60, nullable = false, unique = false)
    @JsonProperty(access = Access.WRITE_ONLY)
    @NotNull(groups = {createClient.class, updateClient.class})
    @NotEmpty(groups = {createClient.class, updateClient.class})
    @Size(groups = {createClient.class, updateClient.class}, min = 8, max = 60)
    private long password;

    //Functional Request
    @Column(name = "cep", length = 9, nullable = false, unique = false)
    @NotNull(groups = createClient.class)
    @NotEmpty(groups = createClient.class)
    private String cep;

    //Functional Request
    @Column(name = "cpf", length = 11, nullable = false, unique = true)
    @NotNull(groups = createClient.class)
    @NotEmpty(groups = createClient.class)
    private String cpf;

    //Not Functional Request
    @Column(name = "payment", nullable = false, unique = false)
    @NotNull(groups = createClient.class)
    @NotEmpty(groups = createClient.class)
    private List<String> payment;

}
