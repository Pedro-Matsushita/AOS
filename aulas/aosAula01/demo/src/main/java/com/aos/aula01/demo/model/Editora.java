package com.aos.aula01.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Editora {
    
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String cnpj;
    
    @NonNull
    private String nome;

    @OneToMany(mappedBy = "editora")
    @JsonIgnore
    private List<Livro> livros;
}
