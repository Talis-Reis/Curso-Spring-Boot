package com.santander.curso.Curso.model;

import com.santander.curso.Curso.dto.Request.AlunoRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Table(name = "aluno")
@Entity
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "idade")
    private Integer idade;

    @Column(name = "email")
    private String email;

    public Aluno(AlunoRequest alunoRequest){
        this.nome = alunoRequest.getNome();
        this.sobrenome = alunoRequest.getSobrenome();
        this.idade = alunoRequest.getIdade();
        this.email = alunoRequest.getEmail();
    }

}
