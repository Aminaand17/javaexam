package com.exam.services;

import java.util.List;

import com.exam.entities.Cours;

public interface CoursService {
    void ajouterCours(Cours cours);
    void supprimerCours(Cours cours);
    List<Cours> afficherCours();
    List<Cours> afficherCoursParNiveau(String niveau);
    List<Cours> afficherCoursParClasse(String classe);
    List<Cours> afficherCoursParProfesseur(String professeur);
}
