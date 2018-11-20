/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
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
@Table(name = "tb_fornecedor")
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @JoinColumn(foreignKey = @ForeignKey(name = "cd_fornecedor"),
            referencedColumnName = "cd_fornecedor")
    @Column(name = "cd_fornecedor")
    private Long codigo;
    @Column(name = "nomeFornecedor", length = 40, nullable = false)
    private String nome;
    @Column(name = "razaoSocial", length = 50, nullable = true)
    private String razaoSocial;

    @OneToMany(mappedBy = "fornecedor", cascade ={ CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Telefone> telefones;

    @OneToMany(mappedBy = "fornecedor", cascade ={ CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Endereco> enderecos = new ArrayList<>();

    @OneToMany(mappedBy = "fornecedor")
    private List<Produto> produtos;

    public Fornecedor(String nome, List<Telefone> telefones) {
        this.nome = nome;
        this.telefones = telefones;
    }

    public Fornecedor(String nome, String razaoSocial,
            List<Telefone> telefones) {
        this(nome, telefones);
        this.razaoSocial = razaoSocial;
    }

    public Fornecedor(String nome, String razaoSocial,
            List<Telefone> telefones, List<Produto> produtos) {
        this(nome, razaoSocial, telefones);
        this.produtos = produtos;
    }

    public Fornecedor(String nome, String razaoSocial,
            List<Telefone> telefones,
            List<Endereco> enderecos, List<Produto> produtos) {
        this(nome, razaoSocial, telefones, produtos);
        this.enderecos = enderecos;
    }

    /**
     * Criar as tabelas de telefone e endereço no MER
     */
    public Fornecedor() {

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

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
//    public List getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(List endereco) {
//        this.endereco = endereco;
//    }

    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

}
