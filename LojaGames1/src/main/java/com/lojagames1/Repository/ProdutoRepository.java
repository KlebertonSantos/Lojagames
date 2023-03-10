package com.lojagames1.Repository;

import com.lojagames1.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);
}
