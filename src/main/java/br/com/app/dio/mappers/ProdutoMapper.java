package br.com.app.dio.mappers;

import br.com.app.dio.dtos.ProdutoDTO;
import br.com.app.dio.entities.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProdutoMapper {

    ProdutoMapper ProductMapper = Mappers.getMapper(ProdutoMapper.class);

    @Mapping(target = "name", source = "name")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "id", ignore = true)
    public Produto toProduto(ProdutoDTO produtoDTO);


    public ProdutoDTO toProdutoDTO(Produto produto);
}
