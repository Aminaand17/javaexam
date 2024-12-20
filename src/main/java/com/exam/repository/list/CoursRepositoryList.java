package com.exam.repository.list;


import java.util.List;
import java.util.stream.Collectors;

import com.exam.entities.Cours;
import com.exam.repository.CoursRepository;

public class CoursRepositoryList extends RepositoryListImpl<Cours> implements CoursRepository {

    @Override
    public List<Cours> findByNiveau(String niveau) {
        return list.stream()
                .filter(cours -> cours.getClasses().stream()
                        .anyMatch(classe -> classe.getNiveau().equals(niveau)))
                .collect(Collectors.toList());
    }

    @Override
    public List<Cours> findByClasse(String classe) {
        return list.stream()
                .filter(cours -> cours.getClasses().stream()
                        .anyMatch(c -> c.getNom().equals(classe)))
                .collect(Collectors.toList());
    }

    @Override
    public List<Cours> findByProfesseur(String professeur) {
        return list.stream()
                .filter(cours -> cours.getProfesseur().getNom().equals(professeur))
                .collect(Collectors.toList());
    }
}

