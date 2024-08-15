package com.aos.aula01.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aos.aula01.demo.model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{
    public List<Autor> findByIdade(Short idade);
    public Autor findByCPF(String cpf);
    public Autor findByNome(String nome);
}
