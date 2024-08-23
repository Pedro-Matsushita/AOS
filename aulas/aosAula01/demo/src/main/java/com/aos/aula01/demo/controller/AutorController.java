package com.aos.aula01.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aos.aula01.demo.model.Autor;
import com.aos.aula01.demo.service.AutorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/api/v1/autor/")
@RestController
public class AutorController{
    
    @Autowired
    public AutorService autorService;

    @PostMapping
    public Autor insertAutor(@RequestBody Autor autor){
       return autorService.insertAutor(autor);
    }
    @GetMapping
    public List<Autor> getAllAutor(){
        return autorService.getAllAutor();
    }
    @GetMapping
    @RequestMapping("CPF/{cpf}")
    public Autor findByCPF(@PathVariable String cpf){
        return autorService.findByCPF(cpf);
    }
}