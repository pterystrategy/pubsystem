/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.controller;

import java.util.List;

/**
 *
 * @author Frederico
 */
public interface IControleSimples<T> {
    public void showInicialScreen();

    public T        create();
    public void     read(T objeto);
    public T        update(T objeto);    
    public boolean  delete(T objeto);
    
    public void print(); 
    
    //A serem usados com integração com Grid
    public List<T> getAll();
    
    public boolean  filter(String column, String valor);
    public T        getAObject(); 
}
