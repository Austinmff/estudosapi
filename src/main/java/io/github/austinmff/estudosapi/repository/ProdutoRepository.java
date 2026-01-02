package io.github.austinmff.estudosapi.repository;

import io.github.austinmff.estudosapi.model.Produto;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,String> {

    List<Produto> findByNome(String nome);

    List<Produto> findByNomeContainingIgnoreCase(String nome);
}
