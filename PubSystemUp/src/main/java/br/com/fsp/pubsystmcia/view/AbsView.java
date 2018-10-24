/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.view;

import java.util.Scanner;
import static java.lang.System.out;

/**
 *
 * @author linuxlite
 */
public abstract class AbsView implements IView{

    private final Scanner scanner;

    public AbsView() {
        this.scanner = new Scanner(System.in);
    }
    
    @Override
    public void showMessage(String msg) {
        out.print(msg);
    }

    @Override
    public int askForInt(String question) {
        this.showMessage(question);
        int inteiro = scanner.nextInt();
        return inteiro;
    }

    @Override
    public double askForDouble(String question) {
        this.showMessage(question);
        double pontoflutuante = scanner.nextDouble();
        return pontoflutuante;
    }

    @Override
    public String askForString(String question) {
        this.showMessage(question);
        String string = scanner.next();
        return string;
    }

    @Override
    public Long askForLong(String question) {
        this.showMessage(question);
        Long inteiro = scanner.nextLong();
        return inteiro;
    }
    
}