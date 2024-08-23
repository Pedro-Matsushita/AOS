package com.aos.aula01.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aos.aula01.demo.model.Livro;
import com.aos.aula01.demo.service.LivroService;

@RequestMapping("/api/v1/livro/")
@RestController
public class LivroController {
    
    @Autowired
    public LivroService livroService;

    @PostMapping
    public Livro insertLivro(@RequestBody Livro livro){
        return livroService.insertLivro(null);
    }
    @GetMapping
    public List<Livro> getAllLivro(){
        return livroService.getAllLivro();
    }
    @GetMapping
    @RequestMapping("titulo/{titulo}")
    public Livro findByTitulo(@PathVariable String titulo){
        return livroService.findByTitulo(titulo);
    }
}
                                                                                                                  