package com.pixelplay.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.pixelplay.lojadegames.model.Categorias;

public interface CategoriasRepository extends JpaRepository<Categorias, Long> {

   public List<Categorias> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}