package com.fiap.gereciamentoPedidos.clientes.repository;

import com.fiap.gereciamentoPedidos.clientes.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository <Clientes, Integer> {
}
