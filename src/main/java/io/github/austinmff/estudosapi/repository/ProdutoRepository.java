package io.github.austinmff.estudosapi.repository;

import io.github.austinmff.estudosapi.model.Produto;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,String> {
}
