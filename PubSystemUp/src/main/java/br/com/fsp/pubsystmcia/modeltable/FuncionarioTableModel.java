/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.modeltable;

import br.com.fsp.pubsystmcia.model.Funcionario;
import java.util.List;

/**
 *
 * @author prorodrigues
 */
public class FuncionarioTableModel extends UtilTableModel<Funcionario> {

    protected List<Funcionario> listaoriginal;

    public FuncionarioTableModel(List<Funcionario> listanova) {
        super(listanova);
        this.columnNames = new String[]{"ID", "Nome", "CPF"};
        this.classes = new Class[]{Long.class, String.class, String.class};
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario get = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return get.getCodigo();
            case 1:
                return get.getNome();
            case 2:
                return get.getCpf();
            default:
                return null;
        }
    }

    @Override
    public void filter(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
