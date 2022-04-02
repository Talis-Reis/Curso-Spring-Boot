package com.santander.curso.Curso.dto.Response;

import com.santander.curso.Curso.model.Aluno;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class AlunoResponse {

    private Integer id;
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String email;

    public AlunoResponse(Aluno aluno){
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.sobrenome = aluno.getSobrenome();
        this.idade = aluno.getIdade();
        this.email = aluno.getEmail();
    }

    public static List<AlunoResponse> toResponse(List<Aluno> alunos){
        return  alunos.stream().map(AlunoResponse::new).collect(Collectors.toList());
    }


}
