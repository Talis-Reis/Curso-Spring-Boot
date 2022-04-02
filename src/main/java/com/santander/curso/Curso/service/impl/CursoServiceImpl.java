package com.santander.curso.Curso.service.impl;

import com.santander.curso.Curso.dto.Request.CursoRequest;
import com.santander.curso.Curso.dto.Response.CursoResponse;
import com.santander.curso.Curso.model.Curso;
import com.santander.curso.Curso.repository.CursoRepository;
import com.santander.curso.Curso.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    CursoRepository cursoRepository;

    @Override
    public List<Curso> getAll() {
        return cursoRepository.findAll();
    }

    @Override
    public CursoResponse create(CursoRequest cursoRequest) {
        Curso curso = new Curso(cursoRequest);
        cursoRepository.save(curso);

        return new CursoResponse(curso);
    }
}
