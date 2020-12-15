package com.rodrigo.mccourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigo.mccourse.domain.Category;

@Repository //nesse tipo de Engenharia de Software, o repository é responsável por acessar os dados dentro do Banco de Dados.
public interface CategoryRepository extends JpaRepository<Category, Integer>{
}
