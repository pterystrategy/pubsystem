/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "tb_produto")
@SecondaryTables({
    @SecondaryTable(name = "tb_produto_compra")
    ,
    @SecondaryTable(name = "tb_produto_comanda")
})
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_produto")
    private Long codigo;
    @Column(name = "nomeProduto", length = 45, nullable = false)
    private String nome;
    @Column(name = "marcaProduto", length = 15)
    private String marca;
    @Column(name = "validadeProduto", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date validade;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "cd_categoria")
    private Categoria categoria;
    @Column(name = "precoCompra", columnDefinition = "DECIMAL(10,2)",
            precision = 10, scale = 2)
    private Double precoCompra;
    @Column(name = "precoVenda", columnDefinition = "DECIMAL(10,2)",
            nullable = false, precision = 10, scale = 2)
    private Double precoVenda;
    @Column(name = "qtdAtual", length = 10, nullable = false)
    private Integer quantidadeAtual;

    @ManyToMany
    @JoinTable(name = "tb_produto_comanda",
            joinColumns = @JoinColumn(name = "cd_produto",
                    referencedColumnName = "cd_produto"))
    private List<Comanda> comandas;

    @Column(table = "tb_produto_comanda", name = "total_item", nullable = false,
            precision = 10, scale = 2, columnDefinition = "DECIMAL(10,2)")
    private Double totalItem;

    @ManyToMany
    @JoinTable(name = "tb_produto_compra",
            joinColumns = @JoinColumn(name = "cd_produto",
                    referencedColumnName = "cd_produto"))
    private List<Compra> compras;

    @Column(table = "tb_produto_compra", name = "item_total", nullable = false,
            precision = 10, scale = 2, columnDefinition = "DECIMAL(10,2)")
    private Double itemTotal;

    @Column(table = "tb_produto_compra", name = "qtd", nullable = false,
            columnDefinition = "INTEGER")
    private Integer quatidade;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "cd_fornecedor")
    private Fornecedor fornecedor;

    public Produto(String nome, String marca, Date validade, Double precoCompra,
            Double precoVenda, Integer quantidadeAtual,
            Categoria categoria, Fornecedor fornecedor) {
        this.nome = nome;
        this.marca = marca;
        this.validade = validade;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.quantidadeAtual = quantidadeAtual;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    public Produto() {
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

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Integer getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(Integer quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public List<Comanda> getComandas() {
        return comandas;
    }

    public void setComandas(List<Comanda> comandas) {
        this.comandas = comandas;
    }

    public Double getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(Double totalItem) {
        this.totalItem = totalItem;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public Double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(Double itemTotal) {
        this.itemTotal = itemTotal;
    }

    public Integer getQuatidade() {
        return quatidade;
    }

    public void setQuatidade(Integer quatidade) {
        this.quatidade = quatidade;
    }

}
