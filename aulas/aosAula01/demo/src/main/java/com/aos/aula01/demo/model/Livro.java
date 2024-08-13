package com.aos.aula01.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Livro {
    
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String titulo;
    
    @NonNull
    private String genero;
    
    @NonNull
    private Integer pagina;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="autor_id")
    private Autor autor;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="editora_id")
    private Editora editora;

}
