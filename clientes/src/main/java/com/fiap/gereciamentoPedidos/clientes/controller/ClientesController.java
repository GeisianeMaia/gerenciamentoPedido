package com.fiap.gereciamentoPedidos.clientes.controller;

import com.fiap.gereciamentoPedidos.clientes.model.Clientes;
import com.fiap.gereciamentoPedidos.clientes.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clients")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @GetMapping
    public List<Clientes> getListClients(){
        return clientesService.getListClients();
    }

    @GetMapping("/{id}")
    public Optional<Clientes> getClientId(@PathVariable Integer id){
        return clientesService.getClientId(id);
    }

    @PostMapping("/registerClients")
    public ResponseEntity<Clientes> registerClient(@RequestBody Clientes clientes){
        Clientes savedClient = clientesService.registerClient(clientes);

        return savedClient != null ?
                ResponseEntity.ok(savedClient) :
                ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clientes> updateClient(@PathVariable Integer id, @RequestBody Clientes clientes) {
        try {
            clientes = clientesService.updateRegisterClient(id, clientes);
            return ResponseEntity.ok(clientes);
        }  catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Integer id) {
        try {
            clientesService.deleteClient(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
