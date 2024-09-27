package com.example.LeThiNgocAnh.service;

import com.example.LeThiNgocAnh.DTO.DetailProductDTO;
import com.example.LeThiNgocAnh.DTO.ImageDTO;
import com.example.LeThiNgocAnh.DTO.ProductAtrributeDTO;
import com.example.LeThiNgocAnh.DTO.ProductDTO;
import com.example.LeThiNgocAnh.entity.ProductAttribute;
import com.example.LeThiNgocAnh.entity.ProductImage;
import com.example.LeThiNgocAnh.entity.Products;
import com.example.LeThiNgocAnh.repository.DetailProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DetailProductServiceImpl implements DetailProductService{
    private DetailProductRepository detailProductRepository;
    @Autowired
    public DetailProductServiceImpl(DetailProductRepository theProductRepository) {
        detailProductRepository = theProductRepository;
    }
    @Override
    public DetailProductDTO findbyId(int id) {
        DetailProductDTO productDTO = new DetailProductDTO();
        Products singleProduct = detailProductRepository.findbyId(id);
        List<ProductImage> listImage= detailProductRepository.GetlistImage(id);
        List<ProductAttribute> listAttribute = detailProductRepository.GetProductAttribute(id);
        if(singleProduct !=null){
            productDTO.setId(singleProduct.getId());
            productDTO.setName(singleProduct.getName());
            productDTO.setPrice(singleProduct.getDiscountPrice());
            productDTO.setDiscountPrice(singleProduct.getDiscountPrice());
            productDTO.setDescription(singleProduct.getDescription());
            productDTO.setRating(singleProduct.getRating());
            productDTO.setReviewsCount(singleProduct.getReviewsCount());
            productDTO.setURLImage(singleProduct.getImageUrl());
            productDTO.setExpiryDate(singleProduct.getExpiryDate());
            productDTO.setCreatedAt(singleProduct.getCreatedAt());
            if(listImage!=null){
                List<ImageDTO> productImageList= new ArrayList<>();
                for (ProductImage result : listImage) {
                    ImageDTO productImages = new ImageDTO();
                    productImages.setURL((result.getImageUrl()));
                    productImageList.add(productImages);
                }
                productDTO.setImages(productImageList);
            }
            else productDTO.setImages((null));
            if(listAttribute!=null){
                List<ProductAtrributeDTO> productAttributes = new ArrayList<>();
                for(ProductAttribute result :listAttribute){
                    ProductAtrributeDTO temp = new ProductAtrributeDTO();
                    temp.setId_color(result.getColor());
                    temp.setId_size(result.getSize());
                    temp.setQuantity(result.getQuantity());
                    productAttributes.add(temp);
                }
                productDTO.setAttributes(productAttributes);
            }
            else  productDTO.setAttributes(null);
        }
        else productDTO.setAttributes(null);
        return productDTO;
    }
}
