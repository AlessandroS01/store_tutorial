package org.company.store_tutorial.entities;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "The name is required")
    private String name;

    private String description;

    private String category;

    @NotNull(message = "The price is required")
    @Column(nullable = false)
    @DecimalMin(value = "0.00", inclusive = false, message = "The price must be greater than 0.")
    private BigDecimal price;

    @NotNull(message = "The stock is required")
    @Column(name = "stock_quantity", nullable = false)
    @Min(value = 0, message = "The stock must be greater than or equal to 0.")
    private Integer stockQuantity;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems;
}
