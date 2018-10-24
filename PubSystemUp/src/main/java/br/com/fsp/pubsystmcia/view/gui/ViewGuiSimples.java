/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.view.gui;

import br.com.fsp.pubsystmcia.view.IView;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author linuxlite
 */
public class ViewGuiSimples extends javax.swing.JDialog implements IView {

    /**
     * Creates new form ViewGuiSimples
     * @param parent
     * @param modal
     */
    public ViewGuiSimples(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitulo.setFont(new java.awt.Font("Nimbus Mono L", 1, 18)); // NOI18N
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Titulo");
        lTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void showMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public int askForInt(String question) {
        String resposta = this.askForString(question);
        int inteiro;
        try {
            inteiro = Integer.parseInt(resposta);
        } catch (NumberFormatException e) {
            this.showErrorMessage("O Valor fornecido não é Inteiro:" + resposta);
            inteiro = 0;
        }
        return inteiro;
    }

    @Override
    public double askForDouble(String question) {
        String resposta = this.askForString(question);
        double numero;
        try {
            numero = Double.parseDouble(resposta);
        } catch (NumberFormatException e) {
            this.showErrorMessage("O Valor fornecido não é um Double:" + resposta);
            numero = 0;
        }
        return numero;

    }

    @Override
    public String askForString(String question) {
        String resposta = JOptionPane.showInputDialog(question);
        return resposta;
    }

    @Override
    public Long askForLong(String question) {
        String resposta = this.askForString(question);
        long numerolong;
        try {
            numerolong = Long.parseLong(resposta);
        } catch (NumberFormatException e) {
            this.showErrorMessage("O Valor fornecido não é um Long:" + resposta);
            numerolong = 0;
        }
        return numerolong;
    }

    public void showErrorMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables

    public JLabel getlTitulo() {
        return lTitulo;
    }

    public void setlTitulo(JLabel lTitulo) {
        this.lTitulo = lTitulo;
    }
}
