package com.santander.curso.Curso.service;

import com.santander.curso.Curso.dto.Request.CursoRequest;
import com.santander.curso.Curso.dto.Response.CursoResponse;
import com.santander.curso.Curso.model.Curso;

import java.util.List;
public interface CursoService {

    List<Curso> getAll();
    CursoResponse create(CursoRequest curso);

}
