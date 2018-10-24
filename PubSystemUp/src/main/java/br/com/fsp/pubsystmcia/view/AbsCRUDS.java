/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.view;

/**
 *
 * @author linuxlite
 * @param <T>
 */
public abstract class AbsCRUDS<T> extends AbsView implements IViewSimplesCRUD<T> {

   
    public void listar(T[] listas) {
        for (T lista : listas) {
            if (lista != null) {
                this.showMessage(lista.toString());
            }
        }
    }

    @Override
    public void read(T type) {
        this.showMessage(type.toString());
    }
}
