package com.exam.services.impl;

import java.util.List;

import com.exam.entities.Cours;
import com.exam.repository.CoursRepository;
import com.exam.services.CoursService;

public class CoursServiceImpl implements CoursService {
    private final CoursRepository coursRepository;

    public CoursServiceImpl(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }

    @Override
    public void ajouterCours(Cours cours) {
        coursRepository.insert(cours);
    }

    @Override
    public List<Cours> afficherCours() {
        return coursRepository.selectAll();
    }

    @Override
    public List<Cours> afficherCoursParNiveau(String niveau) {
        return coursRepository.findByNiveau(niveau);
    }

    @Override
    public List<Cours> afficherCoursParClasse(String classe) {
        return coursRepository.findByClasse(classe);
    }

    @Override
    public List<Cours> afficherCoursParProfesseur(String professeur) {
        return coursRepository.findByProfesseur(professeur);
    }

    @Override
    public void supprimerCours(Cours cours) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'supprimerCours'");
    }
}
