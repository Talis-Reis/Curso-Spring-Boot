package com.santander.curso.Curso.service;

import com.santander.curso.Curso.dto.Request.AlunoRequest;
import com.santander.curso.Curso.dto.Response.AlunoResponse;
import com.santander.curso.Curso.model.Aluno;

import java.util.List;

public interface AlunoService {

    List<Aluno> getAll();
    AlunoResponse create(AlunoRequest usuarioRequest);

}
