package com.aos.aula01.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aos.aula01.demo.model.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Long, Editora> {
    public void deleteByCNPJ(String cnpj);
    public Editora findByNome(String nome);
    public void deleteByNome(String nome);
}
