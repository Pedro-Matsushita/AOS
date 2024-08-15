package com.aos.aula01.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

import com.aos.aula01.demo.model.Autor;
import com.aos.aula01.demo.repository.AutorRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AutorService {
    
    @Autowired
    private AutorRepository autorRepository;

    public void insertAutor(Autor a){
        autorRepository.save(a);
    }
    public void deleteByIdAutor(Long id){
        Optional<Autor> opAutor = autorRepository.findById(id);
        if(opAutor.isPresent()){
            autorRepository.deleteById(id);
        }
    }
        public void updateByIdAutor(String novoNome, Long id){
            Optional<Autor> opAutor = autorRepository.findById(id);
            if(opAutor.isPresent()){
                Autor a = opAutor.get();
                a.setNome(novoNome);

                autorRepository.save(a);
            }
        }
        public Autor getByIdAutor(Long id){
            Optional<Autor> opAutor = autorRepository.findById(id);
            if(opAutor.isPresent()){
                return opAutor.get();
            }
        }
        public List<Autor> getAllAutor(){
            return autorRepository.findAll();
        }
        public List<Autor> findByIdade(Short idade){
            
        }
    //     public List<Autor> findByIdade(Short idade);
    // public Autor findByCPF(String cpf);
    // public Autor findByNome(String nome);
}
