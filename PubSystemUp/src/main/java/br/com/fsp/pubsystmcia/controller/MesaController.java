/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.controller;

import br.com.fsp.pubsystmcia.dao.MesaDao;
import br.com.fsp.pubsystmcia.model.Mesa;
import br.com.fsp.pubsystmcia.modeltable.MesaTableModel;
import br.com.fsp.pubsystmcia.view.gui.MesaGrid;
import br.com.fsp.pubsystmcia.view.gui.MesaTela;
import java.util.List;

/**
 *
 * @author Sóstenes
 */
public class MesaController extends AbstractControleSimples<Mesa> {

    protected MesaGrid grid;
    private final MesaTela tela;
    private final MesaTableModel model;

    public MesaController() {
        dao = new MesaDao();

        model = new MesaTableModel(dao.findAll());
        //Cria CRUD
        grid = MesaGrid.getInstance(null, true, this, model);

        tela = new MesaTela(null, true);
    }

    @Override
    public void showInicialScreen() {
        this.grid.setVisible(true);
    }

    @Override
    public Mesa create() {
        Mesa mesa = tela.criar();

            if(tela.isConfirmado()== false){
                //categoria = null;

                return null;
                
            }    
            else{

                mesa = tela.getScreenObject();
                dao.create(mesa);
            }
        
//        Mesa criar = tela.criar();
//        Mesa create = dao.create(criar);

        model.add(mesa);
        return mesa;
    }

    @Override
    public void read(Mesa objeto) {
        List<Mesa> lista = dao.findAll();
        tela.listar(lista);
    }

    @Override
    public Mesa update(Mesa objeto) {
        Mesa editar = tela.editar(objeto);
        Mesa update = dao.update(editar);
        this.model.update(editar, update);
        return update;
    }

    @Override
    public boolean delete(Mesa objeto) {
        Mesa findById = dao.findById(objeto.getCodigo());
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
