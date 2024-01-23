package mk.ukim.finki.wp.exam.example.repository;

import mk.ukim.finki.wp.exam.example.model.Category;
import mk.ukim.finki.wp.exam.example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findByNameLikeAndCategoriesContaining(String name, Category categories);
    List<Product> findByCategoriesContaining(Category categories);
    List<Product> findByNameLike(String name);

}
