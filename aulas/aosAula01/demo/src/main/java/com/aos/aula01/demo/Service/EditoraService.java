package com.aos.aula01.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aos.aula01.demo.model.Autor;
import com.aos.aula01.demo.model.Editora;
import com.aos.aula01.demo.repository.EditoraRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EditoraService {
        @Autowired
    private EditoraRepository editoraRepository;

    public void insertEditora(Editora e){
        editoraRepository.save(e);
    }
    public void deleteByIdEditora(Long id){
        Optional<Editora> opEditora = editoraRepository.findById(id);
        if(opEditora.isPresent()){
            editoraRepository.deleteById(id);
        }
    }
        public void updateByIdEditora(String novoNome, Long id){
            Optional<Editora> opEditora = editoraRepository.findById(id);
            if(opEditora.isPresent()){
                Editora e = opEditora.get();
                e.setNome(novoNome);

                editoraRepository.save(e);
            }
        }
        public Editora getByIdEditora(Long id){
            Optional<Editora> opEditora = editoraRepository.findById(id);
            if(opEditora.isPresent()){
                return opEditora.get();
            }
            return null;
        }
        public List<Editora> getAllEditora(){
            return editoraRepository.findAll();
        }
        public void deleteByCNPJ(String cnpj){
            Optional<Editora> opEditora = editoraRepository.findByCNPJ(cnpj);
            if(opEditora.isPresent()){
                editoraRepository.deleteByCNPJ(cnpj);
            }
        }
        public void findByNome(String nome){
            Optional<Editora> opEditora = editoraRepository.findByNome(nome);
            if(opEditora.isPresent()){
                System.out.println(opEditora.get());
            }
        }
        public void deleteByNome(String nome){
            editoraRepository.deleteByNome(nome);
        }
}
