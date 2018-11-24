/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.controller;

import br.com.fsp.pubsystmcia.dao.FornecedorDao;
import br.com.fsp.pubsystmcia.model.Fornecedor;
import br.com.fsp.pubsystmcia.modeltable.FornecedorTableModel;
import br.com.fsp.pubsystmcia.view.gui.FornecedorGrid;
import br.com.fsp.pubsystmcia.view.gui.FornecedorTela;
import java.util.List;

/**
 *
 * @author Sóstenes
 */
public class FornecedorController extends AbstractControleSimples<Fornecedor> {

    protected FornecedorGrid grid;
    private final FornecedorTela tela;
    private final FornecedorTableModel model;

    public FornecedorController() {
        dao = new FornecedorDao();

        model = new FornecedorTableModel(dao.findAll());
        //Cria CRUD
        grid = FornecedorGrid.getInstance(null, true, this, model);

        tela = new FornecedorTela(null, true);
    }

    @Override
    public void showInicialScreen() {
        grid.setVisible(true);
    }

    @Override
    public Fornecedor create() {
        Fornecedor criar = tela.criar();
        Fornecedor create = dao.create(criar);

        model.add(create);
        return create;
    }

    @Override
    public void read(Fornecedor objeto) {
        List<Fornecedor> lista = dao.findAll();
        tela.listar(lista);
    }

    @Override
    public Fornecedor update(Fornecedor objeto) {
        Fornecedor editar = tela.editar(objeto);
        Fornecedor update = dao.update(editar);
        this.model.update(editar, update);
        return update;
    }

    @Override
    public boolean delete(Fornecedor objeto) {

        Fornecedor findById = dao.findById(objeto.getCodigo());
        this.tela.preencherTela(objeto);
        boolean delete = this.tela.excluir(findById);
        if (delete) {
            this.model.remove(findById);
            return this.dao.delete(findById);
        }
        return false;
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
    public List<Fornecedor> getAll() {
        return dao.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

}
