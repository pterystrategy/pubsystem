/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.controller;

import br.com.fsp.pubsystmcia.dao.CompraDao;
import br.com.fsp.pubsystmcia.model.Compra;
import br.com.fsp.pubsystmcia.modeltable.CompraTableModel;
import br.com.fsp.pubsystmcia.view.gui.CompraGrid;
import br.com.fsp.pubsystmcia.view.gui.CompraTela;
import java.util.List;

/**
 *
 * @author Frederico
 */
public class CompraController extends AbstractControleSimples<Compra> {

    protected CompraGrid grid;
    private final CompraTela tela;
    private final CompraTableModel model;
    //private FornecedorController fornecedorController; 
    
    public CompraController() {
        dao = new CompraDao();

        model = new CompraTableModel(dao.findAll());
        //Cria CRUD
        grid = CompraGrid.getInstance(null, true, this, model);

        tela = new CompraTela(null, true);
    }
    
    
    @Override
    public void showInicialScreen() {
        this.grid.setVisible(true);
    }

    @Override
    public Compra create() {
        
        return null;
    }

    @Override
    public void read(Compra objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compra update(Compra objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Compra objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean filter(String column, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Compra> getAll() {
        return dao.findAll(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
