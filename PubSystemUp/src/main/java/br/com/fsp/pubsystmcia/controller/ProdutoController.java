/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.controller;

import br.com.fsp.pubsystmcia.dao.ProdutoDao;
import br.com.fsp.pubsystmcia.model.Fornecedor;
import br.com.fsp.pubsystmcia.model.Produto;
import br.com.fsp.pubsystmcia.modeltable.ProdutoTableModel;
import br.com.fsp.pubsystmcia.view.gui.ProdutoGrid;
import br.com.fsp.pubsystmcia.view.gui.ProdutoTela;
import java.util.List;

/**
 *
 * @author Frederico
 */
public class ProdutoController extends AbstractControleSimples<Produto> {

    protected ProdutoGrid grid;
    private final ProdutoTela tela;
    private final ProdutoTableModel model;
    private FornecedorController fornecedorController;

    public ProdutoController() {
        dao = new ProdutoDao();

        model = new ProdutoTableModel(dao.findAll());
        //Cria CRUD
        grid = ProdutoGrid.getInstance(null, true, this, model);

        tela = new ProdutoTela(null, true);
    }

    public ProdutoController(FornecedorController fornecedorController) {
        this();
        this.fornecedorController = fornecedorController;
    }

    @Override
    public void showInicialScreen() {
        this.grid.setVisible(true);
    }

    @Override
    public Produto create() {
        List<Fornecedor> all = this.fornecedorController.getAll();
        tela.setListaFornecedores(all);
        Produto criar = tela.criar();
        Produto create = dao.create(criar);

        model.add(create);
        return create;
    }

    @Override
    public void read(Produto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto update(Produto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Produto objeto) {
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
    public List<Produto> getAll() {
        return dao.findAll(); //To change body of generated methods, choose Tools | Templates.
    }
}
