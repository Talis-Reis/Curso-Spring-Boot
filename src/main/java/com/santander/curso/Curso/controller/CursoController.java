package com.santander.curso.Curso.controller;

import com.santander.curso.Curso.dto.Request.CursoRequest;
import com.santander.curso.Curso.dto.Response.CursoResponse;
import com.santander.curso.Curso.model.Curso;
import com.santander.curso.Curso.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    CursoService cursoService;

    @GetMapping
    public List<Curso> getAll() {
        return cursoService.getAll();
    }

    @PostMapping
    public CursoResponse create(@RequestBody CursoRequest cursoRequest) {
        return cursoService.create(cursoRequest);
    }


}
