package org.company.store_tutorial.repositories;

import org.company.store_tutorial.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
