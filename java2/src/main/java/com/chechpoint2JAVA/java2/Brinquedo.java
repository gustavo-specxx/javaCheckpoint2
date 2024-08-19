package com.chechpoint2JAVA.java2;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "TDS_TB_BRINQUEDOS")
@SequenceGenerator(name = "brinquedo_sequence", sequenceName = "BRINQUEDO_SEQ", allocationSize = 1)
@Data
@NoArgsConstructor
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
}
