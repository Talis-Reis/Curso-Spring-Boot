package com.santander.curso.Curso.controller;

import com.santander.curso.Curso.dto.Request.AlunoRequest;
import com.santander.curso.Curso.dto.Response.AlunoResponse;
import com.santander.curso.Curso.model.Aluno;
import com.santander.curso.Curso.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @GetMapping
    public List<Aluno> getAll() {
        return alunoService.getAll();
    }

    @PostMapping
    public AlunoResponse create(@RequestBody AlunoRequest alunoRequest) {
        return alunoService.create(alunoRequest);
    }
}
