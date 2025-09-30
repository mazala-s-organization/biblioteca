package com.senai.infob.Biblioteca.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conta")
public class Emprestimo {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_")
    private int id;

    private LocalDate dataRetirada;
    private LocalDate dataPrevista;
    private LocalDate dataDevolucao;
    private Boolean ativo;
}
