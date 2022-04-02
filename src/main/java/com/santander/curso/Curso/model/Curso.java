package com.santander.curso.Curso.model;

import com.santander.curso.Curso.dto.Request.CursoRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Table(name = "curso")
@Entity
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "carga_horaria")
    private Integer cargaHoraria;

    public Curso(CursoRequest cursoRequest){
        this.nome = cursoRequest.getNome();
        this.cargaHoraria = cursoRequest.getCargaHoraria();
    }
}
