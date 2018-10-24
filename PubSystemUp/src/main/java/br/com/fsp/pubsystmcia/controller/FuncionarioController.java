/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.controller;

import br.com.fsp.pubsystmcia.dao.FuncionarioDao;
import br.com.fsp.pubsystmcia.model.Funcionario;
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

    public FuncionarioController() {
        dao = new FuncionarioDao();
        //Cria CRUD
        grid = new FuncionarioGrid(null, true, this);

        tela = new ViewGuiCadastroFuncionario(null, true);
    }

    @Override
    public void showInicialScreen() {
        grid.setVisible(true);
    }

    @Override
    public Funcionario create() {
        Funcionario f = tela.criar();
        //List<Funcionario> lista = dao.findAll();

        dao.create(f);

        return f;
    }

    @Override
    public void read(Funcionario objeto) {
        List<Funcionario> lista = dao.findAll();
        tela.listar(lista);
    }

    @Override
    public Funcionario update(Funcionario objeto) {
        this.read(null);
        int id = tela.askForInt("Digite o código do funcionário a editar");
        Funcionario f = dao.findById(id);
        Funcionario f2 = tela.editar(f);
        dao.update(f2);
        return f2;
    }

    @Override
    public boolean delete(Funcionario objeto) {
        this.read(null);

        int id = tela.askForInt("Insira o código do funcionário a remover");
        Funcionario f = dao.findById(id);

        boolean resposta = dao.delete(f);

        if (resposta == false) {
            tela.showMessage("Funcionário não encontrado");
        } else {
            tela.showMessage("Funcionário excluído com êxito");
        }
        return resposta;
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
