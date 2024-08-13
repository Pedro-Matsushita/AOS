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
public class Autor {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String nome;

    @NonNull
    private String cpf;

    @NonNull
    private Short idade;

    @OneToMany(mappedBy = "autor")
    @JsonIgnore
    private List<Livro> livros;

}
