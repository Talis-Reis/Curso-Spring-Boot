package com.santander.curso.Curso.repository;

import com.santander.curso.Curso.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
