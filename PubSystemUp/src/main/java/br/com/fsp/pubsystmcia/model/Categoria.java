/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "tb_categoria")
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_categoria")
    @JoinColumn(foreignKey = @ForeignKey(name = "cd_categoria"), referencedColumnName = "cd_categoria")
    private Long codigo;
    @Column(name = "nomeCategoria", length = 40, nullable = false)
    private String nome;
    @Column(name = "estoqueControlado", length = 1, nullable = false)
    private String controlado;

    @OneToMany(mappedBy = "categoria")
    @JoinColumn(name = "cd_categoria")
    private List<Produto> produtos;

    public Categoria(Long codigo, String nome, String controlado) {
        this.codigo = codigo;
        this.nome = nome;
        this.controlado = controlado;
    }

    public Categoria() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getControlado() {
        return controlado;
    }

    public void setControlado(String controlado) {
        this.controlado = controlado;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
