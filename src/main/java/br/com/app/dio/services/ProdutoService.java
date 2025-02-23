package br.com.app.dio.services;

import br.com.app.dio.dtos.ProdutoDTO;
import br.com.app.dio.entities.Produto;
import br.com.app.dio.mappers.ProdutoMapper;
import br.com.app.dio.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final ProdutoMapper produtoMapper;

    public ProdutoDTO saveProduct(Produto produto) {
        Produto produtoEntity = produtoRepository.save(produto);
        return produtoMapper.toProdutoDTO(produtoEntity);
    }

    public List<ProdutoDTO> findAll() {
        List<Produto> produtos = produtoRepository.findAll();

        return produtos.stream().map(produtoMapper::toProdutoDTO).toList();
    }
}
