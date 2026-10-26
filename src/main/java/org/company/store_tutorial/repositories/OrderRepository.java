package org.company.store_tutorial.repositories;

import org.company.store_tutorial.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
