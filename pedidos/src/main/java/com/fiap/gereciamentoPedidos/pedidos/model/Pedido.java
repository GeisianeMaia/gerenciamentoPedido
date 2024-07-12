package com.fiap.gereciamentoPedidos.pedidos.model;

import jakarta.persistence.Entity;
import lombok.Data;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Pedido {
    private UUID id;
    private UUID idClient;
    private List<AbstractReadWriteAccess.Item> itens;
}
