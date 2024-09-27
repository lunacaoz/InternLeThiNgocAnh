package com.example.LeThiNgocAnh.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private double price;
    @Column(name = "discount_price")
    private Double discountPrice;
    @Column(name = "description")
    private String description;
    @Column(name = "categoryId")
    private int categoryId;
    @Column(name = "rating")
    private float rating;
    @Column(name = "reviews_count")
    private int reviewsCount;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "expiry_date")
    private Date expiryDate;
    @Column(name = "created_at")
    private Date createdAt;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public float getRating() {
        return rating;
    }

    public int getReviewsCount() {
        return reviewsCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setReviewsCount(int reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Products(){}
    public Products(String name, double price, Double discountPrice, String description, int categoryId, float rating, int reviewsCount, String imageUrl, Date expiryDate, Date createdAt) {
        this.name = name;
        this.price = price;
        this.discountPrice = discountPrice;
        this.description = description;
        this.categoryId = categoryId;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.imageUrl = imageUrl;
        this.expiryDate = expiryDate;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discountPrice=" + discountPrice +
                ", description='" + description + '\'' +
                ", categoryId=" + categoryId +
                ", rating=" + rating +
                ", reviewsCount=" + reviewsCount +
                ", imageUrl='" + imageUrl + '\'' +
                ", expiryDate=" + expiryDate +
                ", createdAt=" + createdAt +
                '}';
    }
}
