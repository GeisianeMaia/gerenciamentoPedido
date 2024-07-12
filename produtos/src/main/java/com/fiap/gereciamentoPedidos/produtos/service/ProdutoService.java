package com.fiap.gereciamentoPedidos.produtos.service;

import com.fiap.gereciamentoPedidos.produtos.model.Produto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProdutoService {
    public List<Produto> getListProduct();

    public Produto getProductId(Integer id);

    public ResponseEntity<?> createProduct(Produto produto);


}
