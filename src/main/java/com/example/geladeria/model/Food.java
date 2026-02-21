package com.example.geladeria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter @Setter
@Entity
@Table
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private LocalDateTime expirationDate ;
    private Integer quantity;

    public Food() {

    }

    public Food(long id, String name, String description, LocalDateTime expirationDate, Integer quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
    }
}
