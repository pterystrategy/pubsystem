/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.controller;

import br.com.fsp.pubsystmcia.view.gui.TelaPrincipal;

/**
 *
 * @author Sóstenes
 */
public class PrincipalControle {

    private TelaPrincipal tela;
    private final FuncionarioController funControle;
    private final MesaController mesaController;
    private final FornecedorController fornecedorController;
    private final ProdutoController produtoController;

    public PrincipalControle() {
        funControle = new FuncionarioController();
        mesaController = new MesaController();
        fornecedorController = new FornecedorController();
        produtoController = new ProdutoController(fornecedorController);

    }

    public void iniciaFuncionarioControle() {
        funControle.showInicialScreen();
    }

    public void iniciaProdutoControle() {
        produtoController.showInicialScreen();
    }

    public void iniciaMesaControle() {
        mesaController.showInicialScreen();
    }

    public void iniciar() {
        tela = TelaPrincipal.getInstance(this);
        tela.setVisible(true);
    }

    public void iniciaFornecedorControle() {
        fornecedorController.showInicialScreen();
    }

    public void iniciaComandaControle() {

    }
}
