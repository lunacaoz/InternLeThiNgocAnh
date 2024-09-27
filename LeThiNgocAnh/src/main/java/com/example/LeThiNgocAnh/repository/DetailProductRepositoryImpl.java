package com.example.LeThiNgocAnh.repository;

import com.example.LeThiNgocAnh.entity.ProductAttribute;
import com.example.LeThiNgocAnh.entity.ProductImage;
import com.example.LeThiNgocAnh.entity.Products;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DetailProductRepositoryImpl implements DetailProductRepository{
    private EntityManager entityManager;
    @Autowired
    public DetailProductRepositoryImpl(EntityManager TheEntityManager){
        entityManager=TheEntityManager;
    }
    @Override
    public Products findbyId(int id) {
        try {
            return entityManager.createQuery("SELECT p FROM Products p WHERE p.id = :productId", Products.class)
                    .setParameter("productId", id)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<ProductImage> GetlistImage(int id) {
        try {
            return entityManager.createQuery("SELECT p FROM ProductImage p WHERE p.product_id = :productId", ProductImage.class)
                    .setParameter("productId", id)
                    .getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<ProductAttribute> GetProductAttribute(int id) {
        try {
            Products temp = findbyId(id);
            return entityManager.createQuery("SELECT p FROM ProductAttribute p WHERE p.products = :productId", ProductAttribute.class)
                    .setParameter("productId", temp)
                    .getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }


}
