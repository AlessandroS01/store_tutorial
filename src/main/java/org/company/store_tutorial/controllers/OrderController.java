package org.company.store_tutorial.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.company.store_tutorial.dto.OrderRequest;
import org.company.store_tutorial.entities.Order;
import org.company.store_tutorial.services.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public Order createOrder(@Valid @RequestBody OrderRequest orderRequest) {
        return orderService.createOrder(orderRequest);
    }
}
