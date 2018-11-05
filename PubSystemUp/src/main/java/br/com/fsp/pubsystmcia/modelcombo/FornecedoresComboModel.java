/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.modelcombo;

import br.com.fsp.pubsystmcia.model.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author prorodrigues
 */
public final class FornecedoresComboModel extends AbstractListModel<Fornecedor> implements ComboBoxModel<Fornecedor> {

    private final List<Fornecedor> listFornecedores;
    private Fornecedor selectedFornecedor;
    private final static int FIRSTINDEX = 0;

    public FornecedoresComboModel(List<Fornecedor> listFornecedores) {
        this();
        this.listFornecedores.addAll(listFornecedores);
        if (this.getSize() > 0) {
            setSelectedItem(this.listFornecedores.get(FornecedoresComboModel.FIRSTINDEX));
        }
    }

    public FornecedoresComboModel() {
        this.listFornecedores = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return this.listFornecedores.size();
    }

    @Override
    public Fornecedor getElementAt(int index) {
        return this.listFornecedores.get(index);
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selectedFornecedor = (Fornecedor) o;
    }

    @Override
    public Object getSelectedItem() {
        return this.selectedFornecedor;
    }

    public void addFornecedor(Fornecedor fornecedor) {
        this.listFornecedores.add(fornecedor);
        fireIntervalAdded(this, this.getSize() - 1, this.getSize() - 1);
        setSelectedItem(this.listFornecedores.get(this.getSize() - 1));
    }

    public void addListFornecedor(List<Fornecedor> fornecedores) {
        int primeiraLinha = getSize();
        listFornecedores.addAll(fornecedores);
        fireIntervalAdded(this, primeiraLinha, primeiraLinha + fornecedores.size());
        setSelectedItem(this.listFornecedores.get(getSize() - 1));
    }

    public boolean removeFornecedor() {
        boolean remove;
        remove = listFornecedores.remove((Fornecedor) getSelectedItem());
        fireIntervalRemoved(this, FornecedoresComboModel.FIRSTINDEX, getSize() - 1);
        setSelectedItem(listFornecedores.get(FornecedoresComboModel.FIRSTINDEX));
        return remove;
    }

    public void clear() {
        this.listFornecedores.clear();
        fireContentsChanged(this, FornecedoresComboModel.FIRSTINDEX, getSize() - 1);
    }
}
