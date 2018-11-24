/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.modelcombo;

import br.com.fsp.pubsystmcia.model.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Frederico
 */
public class CategoriaComboModel extends AbstractListModel<Categoria> implements ComboBoxModel<Categoria> {
    
    private List<Categoria> listCategoria;
    private Categoria selectedCategoria;
    private final static int FIRSTINDEX = 0;
 
    public CategoriaComboModel() {
        this.listCategoria = new ArrayList<Categoria>();
    }
     
    public CategoriaComboModel(List<Categoria> listCategoria) {
        this();
        this.listCategoria.addAll(listCategoria);
        if (getSize() > 0) {
            setSelectedItem(this.listCategoria.get(FIRSTINDEX));
        }
    }
     
    @Override
    public Categoria getElementAt(int index) {
        return listCategoria.get(index);
    }
 
    @Override
    public int getSize() {
        return listCategoria.size();
    }
 
    @Override
    public Object getSelectedItem() {
        return this.selectedCategoria;
    }
 
    @Override
    public void setSelectedItem(Object anItem) {
        selectedCategoria = (Categoria) anItem;
    }
     
    public void addCategoria(Categoria categoria) {
        listCategoria.add(categoria);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(listCategoria.get(getSize() - 1));
    }
     
    public void addListCategoria(List<Categoria> categorias) {
        int primeiraLinha = getSize();
        listCategoria.addAll(categorias);
        fireIntervalAdded(this, primeiraLinha, primeiraLinha  + categorias.size());
        setSelectedItem(listCategoria.get(getSize() - 1));
    }
     
    public void removeCategoria() {
        listCategoria.remove((Categoria)getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(listCategoria.get(FIRSTINDEX));
    }
     
    public void clear() {
        listCategoria.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }
    
}
