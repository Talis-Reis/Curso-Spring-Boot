package com.santander.curso.Curso.service.impl;

import com.santander.curso.Curso.dto.Request.AlunoRequest;
import com.santander.curso.Curso.dto.Response.AlunoResponse;
import com.santander.curso.Curso.model.Aluno;
import com.santander.curso.Curso.repository.AlunoRepository;
import com.santander.curso.Curso.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public List<Aluno> getAll() {
        return alunoRepository.findAll();
    }

    @Override
    public AlunoResponse create(AlunoRequest usuarioRequest) {
        Aluno aluno = new Aluno(usuarioRequest);
        alunoRepository.save(aluno);

        return new AlunoResponse(aluno);
    }

}
