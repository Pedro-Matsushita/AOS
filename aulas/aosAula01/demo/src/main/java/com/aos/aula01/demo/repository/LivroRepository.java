package com.aos.aula01.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aos.aula01.demo.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    public void deleteByGenero(String genero);
    public List<Livro> findByGenero(String genero);
    public Livro findByTitulo(String titulo);
}
