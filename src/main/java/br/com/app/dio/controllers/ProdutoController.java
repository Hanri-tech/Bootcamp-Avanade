package br.com.app.dio.controllers;

import br.com.app.dio.dtos.ProdutoDTO;
import br.com.app.dio.entities.Produto;
import br.com.app.dio.services.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("api/v1/produto/")
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping("save")
    public ResponseEntity<ProdutoDTO> save(Produto produto) {
        return ResponseEntity.ok(produtoService.saveProduct(produto));
    }

    @GetMapping("get-all")
    public ResponseEntity<List<ProdutoDTO>> getAll() {
        return ResponseEntity.ok(produtoService.findAll());
    }
}
