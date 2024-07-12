package com.fiap.gereciamentoPedidos.clientes.service;

import com.fiap.gereciamentoPedidos.clientes.model.Clientes;

import java.util.List;
import java.util.Optional;

public interface ClientesService {
    public List<Clientes> getListClients();

    public Optional<Clientes> getClientId(Integer id);

    public Clientes registerClient(Clientes clientes);

    public Clientes updateRegisterClient(Integer id, Clientes clientes);

    public void deleteClient (Integer id);
}
