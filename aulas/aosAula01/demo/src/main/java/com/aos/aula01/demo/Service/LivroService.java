package com.aos.aula01.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aos.aula01.demo.model.Livro;
import com.aos.aula01.demo.repository.LivroRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public void insertLivro(Livro l){
        livroRepository.save(l);
    }
    public void deleteByIdLivro(Long id){
        Optional<Livro> opLivro = livroRepository.findById(id);
        if(opLivro.isPresent()){
            livroRepository.deleteById(id);
        }
    }
        public void updateByIdLivro(String novoTitulo, Long id){
            Optional<Livro> opLivro = livroRepository.findById(id);
            if(opLivro.isPresent()){
                Livro l = opLivro.get();
                l.setTitulo(novoTitulo);

                livroRepository.save(l);
            }
        }
        public Livro getByIdLivro(Long id){
            Optional<Livro> opLivro = livroRepository.findById(id);
            if(opLivro.isPresent()){
                return opLivro.get();
            }
            return null;
        }
        public List<Livro> getAllLivro(){
            return livroRepository.findAll();
        }
        public void deleteByGenero(String genero){
            livroRepository.deleteByGenero(genero);
        }
        public List<Livro> findByGenero(String genero){
            return livroRepository.findByGenero(genero);
        }
        public Livro findByTitulo(String titulo){
            return livroRepository.findByTitulo(titulo);
        }
}

