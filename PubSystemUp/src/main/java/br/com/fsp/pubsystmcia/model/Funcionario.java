/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "tb_funcionario")
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_funcionario")
    private Long codigo;
    @Column(name = "nmfuncionario", length = 40, nullable = true)
    private String nome;
    @Column(name = "emailFuncionario", length = 50, nullable = true)
    private String email;
    @Column(name = "cpfFuncionario", length = 14, nullable = true)
    private String cpf;
    @Column(name = "loginFuncionario", length = 40, nullable = false)
    private String login;
    @Column(name = "senhaFuncionario", length = 60, nullable = false)
    private String senha;

    //Remover OBS do MER
    public Funcionario(String nome, String email, String cpf, String login, String senha) {
        this(nome, email, login, senha);
        this.cpf = cpf;
    }

    public Funcionario(String nome, String email, String login, String senha) {
        this(login, senha);
        this.email = email;
        this.nome = nome;
    }

    public Funcionario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Funcionario() {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo + ", nome=" + nome + ", login=" + login + ", senha=" + senha + '}';
    }

}
