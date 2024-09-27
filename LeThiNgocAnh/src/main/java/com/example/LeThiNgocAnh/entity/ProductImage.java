package com.example.LeThiNgocAnh.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product_images")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "product_id")
    private int product_id;
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    private Products productId;
    @Column(name = "image_url")
    private String imageUrl;

    // Constructors, Getters, and Setters
    public ProductImage() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Products getProductId() {
//        return productId;
//    }
//
//    public void setProductId(Products productId) {
//        this.productId = productId;
//    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

//    public ProductImage(Products productId, String imageUrl) {
//        this.productId = productId;
//        this.imageUrl = imageUrl;
//    }
//
//    @Override
//    public String toString() {
//        return "ProductImage{" +
//                "id=" + id +
//                ", productId=" + productId +
//                ", imageUrl='" + imageUrl + '\'' +
//                '}';
//    }
}
