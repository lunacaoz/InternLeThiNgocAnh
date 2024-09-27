package com.example.LeThiNgocAnh.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product_attributes")
public class ProductAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "product_id")  // Foreign key for the Color relationship
    private Products products;
    @ManyToOne
    @JoinColumn(name = "color_id")  // Foreign key for the Color relationship
    private Color color;
    @ManyToOne
    @JoinColumn(name = "size_id")
    private Size size;
    @Column(name = "quantity")
    private int quantity;
    // Constructors, Getters, and Setters
    public ProductAttribute() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size sizeId) {
        this.size = sizeId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
