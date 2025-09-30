package com.senai.infob.Biblioteca.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conta")
public class Historico {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_")
    private int id;

    private int alunoId;
    private int professorId;
    private int emprestimoId;
    private LocalDateTime ultimaAtualizacao;
    public Historico() {
    }
    public Historico(int id, int alunoId, int professorId, int emprestimoId, LocalDateTime ultimaAtualizacao) {
        this.id = id;
        this.alunoId = alunoId;
        this.professorId = professorId;
        this.emprestimoId = emprestimoId;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAlunoId() {
        return alunoId;
    }
    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }
    public int getProfessorId() {
        return professorId;
    }
    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }
    public int getEmprestimoId() {
        return emprestimoId;
    }
    public void setEmprestimoId(int emprestimoId) {
        this.emprestimoId = emprestimoId;
    }
    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }
    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    
    
}
