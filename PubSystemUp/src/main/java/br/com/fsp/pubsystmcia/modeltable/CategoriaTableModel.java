/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.modeltable;

import br.com.fsp.pubsystmcia.model.Categoria;
import java.util.List;

/**
 *
 * @author Frederico
 */
public class CategoriaTableModel extends UtilTableModel<Categoria> {
    
    public CategoriaTableModel() {
    }

    public CategoriaTableModel(List<Categoria> lista) {
        super(lista);
        columnNames = new String[]{"ID", "Categoria", "Controlado"};
        classes = new Class[]{Integer.class,
                              String.class,
                              String.class,};        
              
    }
    
    
    

    @Override
    public void filter(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Categoria categoria = lista.get(rowIndex);
        switch(columnIndex){
            case 0:
                return categoria.getCodigo();
            case 1:
                return categoria.getNome();
            case 2:
                return categoria.getControlado();
            default:
                return null;
        }
    }
    
}
