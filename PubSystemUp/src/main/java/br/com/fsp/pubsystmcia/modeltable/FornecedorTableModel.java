/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.modeltable;

import br.com.fsp.pubsystmcia.model.Fornecedor;
import br.com.fsp.pubsystmcia.model.Mesa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prorodrigues
 */
public class FornecedorTableModel extends UtilTableModel<Fornecedor> {

    public FornecedorTableModel(){
        this(new ArrayList<Fornecedor>());
    }
    
    //protected List<Fornecedor> listaoriginal;

    public FornecedorTableModel(List<Fornecedor> listanova) {
        super(listanova);
        this.columnNames = new String[]{"ID", "Nome Do Fornecedor"};
        this.classes = new Class[]{Long.class, String.class};
    }

    @Override
    public void filter(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Fornecedor get = lista.get(i);
        switch (i1) {
            case 0:
                return get.getCodigo();
            case 1:
                return get.getNome();
            default:
                return null;
        }
    }

}
