package com.codekul.Java16SeptSpring.manytomany.domain;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String address;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "customer_product",
            joinColumns = {@JoinColumn(name = "customer_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id",referencedColumnName = "id")})
    private List<Product> products;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
