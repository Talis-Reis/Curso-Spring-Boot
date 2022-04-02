package com.santander.curso.Curso.repository;

import com.santander.curso.Curso.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
