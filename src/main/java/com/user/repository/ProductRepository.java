package com.user.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query methods (if needed) can go here
}
