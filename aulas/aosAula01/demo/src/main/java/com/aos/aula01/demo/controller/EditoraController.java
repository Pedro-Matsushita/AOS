package com.aos.aula01.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aos.aula01.demo.model.Editora;
import com.aos.aula01.demo.service.EditoraService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/api/v1/editora/")
@RestController
public class EditoraController {
    
    @Autowired
    public EditoraService editoraService;

    @PostMapping
    public Editora insertEditora(@RequestBody Editora editora){
        return editoraService.insertEditora(editora);
    }
    @GetMapping
    public List<Editora> getAllEditora(){
        return editoraService.getAllEditora();
    }
    @GetMapping
    @RequestMapping("nome/{nome}")
    public Editora findByNome(@PathVariable String nome){
        return editoraService.findByNome(nome);
    }
}
