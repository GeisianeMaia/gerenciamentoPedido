package com.fiap.gereciamentoPedidos.clientes.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Clientes {
    private Integer id;
    private String fullName;
    private String address;
    private String email;
    private String phone;
    private String cpf;
}
