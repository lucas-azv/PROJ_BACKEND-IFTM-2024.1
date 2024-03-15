package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.domain.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria,Long> {
    
}