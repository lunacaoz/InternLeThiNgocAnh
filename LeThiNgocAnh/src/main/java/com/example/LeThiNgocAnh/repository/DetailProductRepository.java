package com.example.LeThiNgocAnh.repository;

import com.example.LeThiNgocAnh.entity.ProductAttribute;
import com.example.LeThiNgocAnh.entity.ProductImage;
import com.example.LeThiNgocAnh.entity.Products;

import java.awt.*;
import java.util.List;

public interface DetailProductRepository {
    Products findbyId(int id);
    List<ProductImage> GetlistImage(int id);
    List<ProductAttribute> GetProductAttribute(int id);

}
