/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.modeltable;

import br.com.fsp.pubsystmcia.model.Compra;
import java.util.List;

/**
 *
 * @author Frederico
 */
public class CompraTableModel extends UtilTableModel<Compra> {
    
    public CompraTableModel(List<Compra> listanova) {
        super(listanova);
        this.columnNames = new String[]{"ID", " Data"};
        this.classes = new Class[]{Long.class, String.class};
    }

    @Override
    public void filter(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Compra get = lista.get(i);
        switch (i1) {
            case 0:
                return get.getCodigo();
            case 1:
                return get.getDataCompra();
            default:
                return null;
        }
    }
    
}
