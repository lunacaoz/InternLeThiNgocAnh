package com.example.LeThiNgocAnh.DTO;

import com.example.LeThiNgocAnh.entity.ProductAttribute;
import com.example.LeThiNgocAnh.entity.ProductImage;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class DetailProductDTO {
    private int id;
    private String name;
    private double price;
    private Double discountPrice;
    private String description;
    private float rating;
    private int reviewsCount;
    private String URLImage;
    private List<ImageDTO> images;
    private List<ProductAtrributeDTO> attributes;
    private Date expiryDate;
    private Date createdAt;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(int reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public String getURLImage() {
        return URLImage;
    }

    public void setURLImage(String URLImage) {
        this.URLImage = URLImage;
    }

    public List<ImageDTO> getImages() {
        return images;
    }

    public void setImages(List<ImageDTO> images) {
        this.images = images;
    }

    public List<ProductAtrributeDTO> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ProductAtrributeDTO> attributes) {
        this.attributes = attributes;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public DetailProductDTO(){}
    public DetailProductDTO(String name, double price, Double discountPrice, String description, float rating, int reviewsCount, String URLImage, List<ImageDTO> images, List<ProductAtrributeDTO> attributes, Date expiryDate, Date createdAt) {
        this.name = name;
        this.price = price;
        this.discountPrice = discountPrice;
        this.description = description;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.URLImage = URLImage;
        this.images = images;
        this.attributes = attributes;
        this.expiryDate = expiryDate;
        this.createdAt = createdAt;
    }
}
