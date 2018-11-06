/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.modelcombo;

import br.com.fsp.pubsystmcia.model.Fornecedor;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author prorodrigues
 */
public class FornecedoresCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<? extends Object> list,
            Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        if (value instanceof Fornecedor) {
            Fornecedor fornecedor = (Fornecedor) value;
            setText(fornecedor.getNome());
        }
        return this;
    }
}
