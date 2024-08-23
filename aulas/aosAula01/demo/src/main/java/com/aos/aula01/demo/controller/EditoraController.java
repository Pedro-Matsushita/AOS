package com.aos.aula01.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aos.aula01.demo.model.Editora;
import com.aos.aula01.demo.service.EditoraService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    @DeleteMapping("id/{id}")
    public void deleteById(@RequestBody Long id){
        editoraService.deleteByIdEditora(id);
    }
    @PutMapping("id/{id}")
    public void updateById(@PathVariable Long id, @RequestBody String novoNome){
        editoraService.updateByIdEditora(null, id);
    }
    @GetMapping("id/{id}")
    public Editora findById(@PathVariable Long id){
        return editoraService.getByIdEditora(id);
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
    @DeleteMapping("cnpj/{cnpj}")
    public void deleteByCNPJ(@PathVariable String cnpj){
        editoraService.deleteByCNPJ(cnpj);
    }
    @DeleteMapping("nome/{nome}")
    public void deleteByNome(@PathVariable String nome){
        editoraService.deleteByNome(nome);
    }
}
