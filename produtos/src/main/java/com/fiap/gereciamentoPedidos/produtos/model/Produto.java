package com.fiap.gereciamentoPedidos.produtos.model;
import jakarta.persistence.Entity;
import lombok.Data;


@Data
@Entity
public class Produto {
    private Integer id;
    private String name;
    private String description;
    private int quantity;
    private int price;
}
