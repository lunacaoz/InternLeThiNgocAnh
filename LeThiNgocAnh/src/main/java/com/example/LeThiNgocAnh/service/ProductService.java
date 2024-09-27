package com.example.LeThiNgocAnh.service;
import com.example.LeThiNgocAnh.DTO.ProductDTO;
import com.example.LeThiNgocAnh.entity.Products;

import java.util.List;

public interface ProductService {
    List<ProductDTO> findProductDetailsByColorId(int colorId);
    List<ProductDTO> findProductDetailsBySizeId(int colorId);
    List<ProductDTO> findProductAttribute(int id_color, int  id_size);
    List<ProductDTO> findall_product();

}
