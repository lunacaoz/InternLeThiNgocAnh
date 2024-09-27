package com.example.LeThiNgocAnh.service;
import com.example.LeThiNgocAnh.DTO.ProductDTO;
import com.example.LeThiNgocAnh.entity.Products;
import com.example.LeThiNgocAnh.repository.DetailProductRepository;
import com.example.LeThiNgocAnh.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository;
    @Autowired
    public ProductServiceImpl(ProductRepository theProductRepository) {
        productRepository = theProductRepository;
    }
    @Override
    public List<ProductDTO> findProductDetailsByColorId(int colorId) {
        List<Object[]> results = productRepository.findProductDetailsByColorId(colorId);
        List<ProductDTO> products = new ArrayList<>();
        for (Object[] result : results) {
            ProductDTO product = new ProductDTO();
            product.setName((String) result[0]);
            product.setPrice((Double) result[1]);
            product.setDiscountPrice((Double) result[2]);
            product.setRating((Float) result[3]);
            product.setReviewsCount((Integer) result[4]);
            product.setImageUrl((String) result[5]);
            products.add(product);
        }
        return products;
    }

    @Override
    public List<ProductDTO> findProductDetailsBySizeId(int colorId) {
        List<Object[]> results = productRepository.findbySize(colorId);
        List<ProductDTO> products = new ArrayList<>();
        for (Object[] result : results) {
            ProductDTO product = new ProductDTO();
            product.setName((String) result[0]);
            product.setPrice((Double) result[1]);
            product.setDiscountPrice((Double) result[2]);
            product.setRating((Float) result[3]);
            product.setReviewsCount((Integer) result[4]);
            product.setImageUrl((String) result[5]);
            products.add(product);
        }
        return products;
    }

    @Override
    public List<ProductDTO> findProductAttribute(int id_color, int id_size) {
        List<Object[]> results = productRepository.findbyAttributes(id_color,id_size);
        List<ProductDTO> products = new ArrayList<>();
        if (results != null && !results.isEmpty()) {
            for (Object[] result : results) {
                ProductDTO product = new ProductDTO();
                product.setName((String) result[0]);
                product.setPrice((Double) result[1]);
                product.setDiscountPrice((Double) result[2]);
                product.setRating((Float) result[3]);
                product.setReviewsCount((Integer) result[4]);
                product.setImageUrl((String) result[5]);
                products.add(product);
            }
        }
        return products.isEmpty() ? Collections.emptyList() : products;
    }
    @Override
    public List<ProductDTO> findall_product() {
        List<Products> results = productRepository.findall_product();
        List<ProductDTO> products = new ArrayList<>();
        for (Products result:results) {
            ProductDTO product = new ProductDTO();
            product.setName(result.getName());
            product.setPrice(result.getPrice());
            product.setDiscountPrice(result.getDiscountPrice());
            product.setRating(result.getRating());
            product.setReviewsCount(result.getReviewsCount());
            product.setImageUrl(result.getImageUrl());
            products.add(product);
        }
        return products;
    }

}
