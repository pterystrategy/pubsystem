/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.controller;

import br.com.fsp.pubsystmcia.dao.FuncionarioDao;
import br.com.fsp.pubsystmcia.dao.IDAO;
import br.com.fsp.pubsystmcia.model.Funcionario;
import br.com.fsp.pubsystmcia.modeltable.FuncionarioTableModel;
import br.com.fsp.pubsystmcia.view.gui.FuncionarioGrid;
import br.com.fsp.pubsystmcia.view.gui.ViewGuiCadastroFuncionario;
import java.util.List;

/**
 *
 * @author Sóstenes
 */
public class FuncionarioController extends AbstractControleSimples<Funcionario> {

    protected FuncionarioGrid grid;
    private final ViewGuiCadastroFuncionario tela;
    private final FuncionarioTableModel model;

    public FuncionarioController() {
        dao = new FuncionarioDao();

        model = new FuncionarioTableModel(dao.findAll());
        //Cria CRUD
        grid = FuncionarioGrid.getInstance(null, true, this, model);

        tela = new ViewGuiCadastroFuncionario(null, true);
    }

    @Override
    public void showInicialScreen() {
        grid.setVisible(true);
    }

    @Override
    public Funcionario create() {
        Funcionario criar = tela.criar();
        //List<Funcionario> lista = dao.findAll();
        Funcionario create = dao.create(criar);

        model.add(create);
        return create;
    }

    @Override
    public void read(Funcionario objeto) {
        List<Funcionario> lista = dao.findAll();
        tela.listar(lista);
    }

    @Override
    public Funcionario update(Funcionario objeto) {
        Funcionario editar = tela.editar(objeto);
        Funcionario update = dao.update(editar);
        this.model.update(editar, update);
        return update;
    }

    @Override
    public boolean delete(Funcionario objeto) {

        Funcionario findById = dao.findById(objeto.getCodigo());
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

}
