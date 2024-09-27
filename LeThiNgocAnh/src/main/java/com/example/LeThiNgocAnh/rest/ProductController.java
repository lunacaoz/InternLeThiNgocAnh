package com.example.LeThiNgocAnh.rest;

import com.example.LeThiNgocAnh.DTO.DetailProductDTO;
import com.example.LeThiNgocAnh.DTO.ProductDTO;
import com.example.LeThiNgocAnh.entity.Products;
import com.example.LeThiNgocAnh.service.DetailProductService;
import com.example.LeThiNgocAnh.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private ProductService products;
    private DetailProductService detailProductService;
    public ProductController(ProductService theProducts, DetailProductService TheDetailProductService){
        products = theProducts;
        detailProductService = TheDetailProductService;
    }
    @GetMapping("/products")
    public List<ProductDTO> findAll(@RequestParam(required = false, defaultValue = "0") int id_color,
                                    @RequestParam(required = false, defaultValue = "0") int id_size)  {
        if(id_color != 0 ||  id_size != 0){
            if(id_color != 0 && id_size != 0)
            {
                return products.findProductAttribute(id_color,id_size);
            }
            else if(id_color!=0){
                return products.findProductDetailsByColorId(id_color);
            }
            else
            return products.findProductDetailsBySizeId(id_size);
    }
        return products.findall_product();
    }
    @GetMapping("/products/{id}")
    public DetailProductDTO findById(@PathVariable int id) {
        return detailProductService.findbyId(id);
    }
}
