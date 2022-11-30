package br.com.mfsdevsys.apiproduct.entity;


import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name="produto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private BigDecimal valor;

    @Column
    private String descricao;

    public Product() {
    }

    public Product(Long id, String nome, BigDecimal valor, String descricao) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
