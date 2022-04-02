package com.santander.curso.Curso.dto.Response;

import com.santander.curso.Curso.model.Curso;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class CursoResponse {

    private Integer id;
    private String nome;
    private Integer cargaHoraria;

    public CursoResponse(Curso curso){
        this.id = curso.getId();
        this.nome = curso.getNome();
        this.cargaHoraria = curso.getCargaHoraria();
    }

    public static List<CursoResponse> toResponse(List<Curso> cursos){
        return  cursos.stream().map(CursoResponse::new).collect(Collectors.toList());
    }


}
