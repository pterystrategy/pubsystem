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
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Fred Gay
 */
@Entity
@Table(name = "tb_comanda")
public class Comanda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_comanda")
    private Long codigo;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "cd_mesa")
    private Mesa mesa;
    @Column(name = "totalGeral", columnDefinition = "NUMERIC(10,2)", nullable = false)
    private Double totalGeral;
    @Column(name = "statusMesa", length = 40, nullable = false)
    private String situacao;
    @Column(name = "dataComanda", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    @ManyToMany(mappedBy = "comandas", fetch = FetchType.LAZY)
    @JoinTable(foreignKey = @ForeignKey(ConstraintMode.PROVIDER_DEFAULT),
            name = "tb_produto_comanda", joinColumns = @JoinColumn(name = "cd_comanda"))
    private List<Produto> produtos;

    public Comanda(Mesa mesa, Double totalGeral, String situacao, Date data, List<Produto> produtos) {
        this.mesa = mesa;
        this.totalGeral = totalGeral;
        this.situacao = situacao;
        this.data = data;
        this.produtos = produtos;
    }

    public Comanda() {

    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Double getTotalGeral() {
        return totalGeral;
    }

    public void setTotalGeral(Double totalGeral) {
        this.totalGeral = totalGeral;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
