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
@Table(name = "tb_mesa")
public class Mesa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_mesa")
    @JoinColumn(foreignKey = @ForeignKey(name = "cd_mesa"), referencedColumnName = "cd_mesa")
    private Long codigo;
    @Column(name = "numeroMesa", length = 10, nullable = false)
    private Integer numero;

    @OneToMany(mappedBy = "mesa")
    private List<Comanda> comandas;

    public Mesa(Long codigo, Integer numero) {
        this.codigo = codigo;
        this.numero = numero;
    }

    public Mesa() {

    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<Comanda> getComandas() {
        return comandas;
    }

    public void setComandas(List<Comanda> comandas) {
        this.comandas = comandas;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "| Numero: " + numero;
    }
    
    

}
