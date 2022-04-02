package com.santander.curso.Curso.dto.Request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlunoRequest {

    private String nome;
    private String sobrenome;
    private Integer idade;
    private String email;

}
