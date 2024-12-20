package com.exam.entities;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode()

public class Cours {
    private String nom;
    private Professeur professeur;
    private List<Classe> classes;
    private String module;

    public Cours(String nom, Professeur professeur, List<Classe> classes, String module) {
        this.nom = nom;
        this.professeur = professeur;
        this.classes = classes;
        this.module = module;
    }

   
}
