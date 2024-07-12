package com.fiap.gereciamentoPedidos.estoque.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Estoque {
    private Integer idProduct;
    private String nameProduct;
    private BigDecimal quantity;

}
