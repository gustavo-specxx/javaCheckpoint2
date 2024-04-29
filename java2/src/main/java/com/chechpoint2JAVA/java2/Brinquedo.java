package com.chechpoint2JAVA.java2;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "TDS_TB_BRINQUEDOS")
@SequenceGenerator(name = "brinquedo_sequence", sequenceName = "BRINQUEDO_SEQ", allocationSize = 1)
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brinquedo_sequence")
    @Column(name = "ID")
    private Long id;
    @Column(name = "NOME")
    private String nome;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "CLASSIFICACAO")
    private String classificacao;

    @Column(name = "TAMANHO")
    private String tamanho;

    @Column(name = "PRECO")
    private BigDecimal preco;

    // Construtor padrão
    public Brinquedo() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}