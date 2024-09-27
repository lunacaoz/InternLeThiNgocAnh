package com.example.LeThiNgocAnh.repository;
import com.example.LeThiNgocAnh.entity.Products;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private EntityManager entityManager;
    @Autowired
    public ProductRepositoryImpl(EntityManager TheEntityManager){
        entityManager=TheEntityManager;
    }
    @Override
    public List<Products> findall_product() {
        TypedQuery<Products> theQuery = entityManager.createQuery("from Products",Products.class);
        List<Products> Products = theQuery.getResultList();
        return Products;
    }
    @Override
    public List<Object[]> findProductDetailsByColorId(int id_color) {
        List<Object[]> temp = entityManager.createQuery(
                        "SELECT DISTINCT p.name, p.price, p.discountPrice, p.rating, p.reviewsCount, p.imageUrl " +
                                "FROM ProductAttribute pa " +
                                "JOIN pa.products p " +
                                "JOIN pa.color c " +
                                "WHERE c.id = :colorId", Object[].class)
                .setParameter("colorId", id_color)
                .getResultList();

        return temp.isEmpty() ? null : temp;
    }

    @Override
    public List<Object[]> findbyAttributes(int id_color, int  id_size) {
        List<Object[]> temp = entityManager.createQuery(
                        "SELECT DISTINCT p.name, p.price, p.discountPrice, p.rating, p.reviewsCount, p.imageUrl " +
                                "FROM ProductAttribute pa " +
                                "JOIN pa.products p " +
                                "JOIN pa.color c " +
                                "JOIN pa.size s " +
                                "WHERE c.id = :id_color AND s.id = :id_size", Object[].class)
                .setParameter("id_color", id_color)
                .setParameter("id_size", id_size)
                .getResultList();
        return temp.isEmpty() ? null : temp;
    }

    @Override
    public List<Object[]> findbySize(int id_size) {
        List<Object[]> temp = entityManager.createQuery(
                        "SELECT DISTINCT p.name, p.price, p.discountPrice, p.rating, p.reviewsCount, p.imageUrl " +
                                "FROM ProductAttribute pa " +
                                "JOIN pa.products p " +
                                "JOIN pa.size c " +
                                "WHERE c.id = :id_size", Object[].class)
                .setParameter("id_size", id_size)
                .getResultList();

        return temp.isEmpty() ? null : temp;
    }
}
