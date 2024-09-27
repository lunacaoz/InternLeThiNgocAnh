package com.example.LeThiNgocAnh.repository;

import com.example.LeThiNgocAnh.entity.Products;

import java.util.List;

public interface ProductRepository {
    List<Products> findall_product();
    List<Object[]> findProductDetailsByColorId(int colorId);
    List<Object[]> findbySize(int id);
    List<Object[]> findbyAttributes(int id_color, int  id_size);

}
