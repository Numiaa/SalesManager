package ru.ivanov.salesmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ivanov.salesmarket.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}

