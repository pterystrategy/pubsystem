/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.controller;

import br.com.fsp.pubsystmcia.dao.CategoriaDao;
import br.com.fsp.pubsystmcia.model.Categoria;
import br.com.fsp.pubsystmcia.modeltable.CategoriaTableModel;
import br.com.fsp.pubsystmcia.view.gui.CategoriaGrid;
import br.com.fsp.pubsystmcia.view.gui.CategoriaTela;
import java.util.List;

/**
 *
 * @author Sóstenes
 */
public class CategoriaController extends AbstractControleSimples<Categoria>{

    protected CategoriaGrid grid;
    private final CategoriaTela tela;
    private CategoriaTableModel model;

    public CategoriaController() {
        dao = new CategoriaDao();
        model = new CategoriaTableModel(dao.findAll());
        grid = new CategoriaGrid(null, true, this, model);
        grid.setControle(this);
        tela = new CategoriaTela(null, true);
    }
    
    @Override
    public void showInicialScreen() {
        grid.setVisible(true);
    }

    @Override
    public Categoria create() {
         Categoria categoria = tela.criar();

            if(tela.isRetornoOk() == false){
                //categoria = null;

                return null;
                
            }    
            else{

                categoria = tela.getScreenObject();
                dao.create(categoria);
            }

        
        model.add(categoria);
        return categoria;
    }

    @Override
    public void read(Categoria objeto) {
        List<Categoria> lista = dao.findAll();
        tela.listar(lista);

    }

    @Override
    public Categoria update(Categoria objeto) {
        Categoria cat = tela.editar(objeto);
        Categoria cat2 = dao.update(cat);
        model.update(cat, cat2);
        return cat2;
    }

    @Override
    public boolean delete(Categoria objeto) {
        dao.delete(objeto);
        model.remove(objeto);
        return true;
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
