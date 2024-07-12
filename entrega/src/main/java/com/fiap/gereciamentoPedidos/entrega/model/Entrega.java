package com.fiap.gereciamentoPedidos.entrega.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Entrega {
    @Id
    private Integer id;
    private String nameClient;
    private String addressClient;
    private String infoProduct;
}
