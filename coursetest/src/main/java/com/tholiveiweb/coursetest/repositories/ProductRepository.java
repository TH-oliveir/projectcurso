package com.tholiveiweb.coursetest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tholiveiweb.coursetest.entities.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
