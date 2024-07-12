package com.fiap.gereciamentoPedidos.pedidos.repository;

import com.fiap.gereciamentoPedidos.pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
