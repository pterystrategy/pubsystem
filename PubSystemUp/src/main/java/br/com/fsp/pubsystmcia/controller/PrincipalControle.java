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
    private FuncionarioController funControle;

    public PrincipalControle() {
        funControle = new FuncionarioController();
    }

    public void iniciaFuncionarioControle() {
        funControle.showInicialScreen();
    }
    
    public void iniciar() {
        tela = TelaPrincipal.getInstance(this);
        tela.setVisible(true);
    } 

    public void iniciaComandaControle() {
        
    }
}
