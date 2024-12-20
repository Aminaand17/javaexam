package com.exam.repository;

import java.util.List;

import com.exam.core.repository.Repository;
import com.exam.entities.Cours;

public interface CoursRepository extends Repository<Cours> {
    List<Cours> findByNiveau(String niveau);
    List<Cours> findByClasse(String classe);
    List<Cours> findByProfesseur(String professeur);
}
