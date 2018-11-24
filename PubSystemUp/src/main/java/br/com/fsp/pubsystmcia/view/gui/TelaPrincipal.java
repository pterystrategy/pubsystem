/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.view.gui;

import br.com.fsp.pubsystmcia.controller.PrincipalControle;

/**
 *
 * @author Sóstenes
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private static TelaPrincipal tela;
    private PrincipalControle controle;

    /**
     * Creates new form TelaPrincipal
     */
    private TelaPrincipal() {
        initComponents();
    }

    /**
     * @param args the command line arguments
     */
    public static TelaPrincipal getInstance(PrincipalControle controle) {

        if (tela == null) {
            tela = new TelaPrincipal();
        }
        tela.controle = controle;
        return tela;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        imnFuncionario = new javax.swing.JMenuItem();
        imnMesa = new javax.swing.JMenuItem();
        imnFornecedor = new javax.swing.JMenuItem();
        imnProduto = new javax.swing.JMenuItem();
        imnCategoria = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastros");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        imnFuncionario.setText("Cadastro funcionario ");
        imnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(imnFuncionario);

        imnMesa.setText("Cadastro Mesa");
        imnMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnMesaActionPerformed(evt);
            }
        });
        jMenu1.add(imnMesa);

        imnFornecedor.setText("Cadastro Fornecedor");
        imnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(imnFornecedor);

        imnProduto.setText("Cadastro Produto");
        imnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(imnProduto);

        imnCategoria.setText("Cadastro Categoria");
        imnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCategoriaActionPerformed(evt);
            }
        });
        jMenu1.add(imnCategoria);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void imnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnFuncionarioActionPerformed
        controle.iniciaFuncionarioControle();
    }//GEN-LAST:event_imnFuncionarioActionPerformed

    private void imnMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnMesaActionPerformed
        this.controle.iniciaMesaControle();
    }//GEN-LAST:event_imnMesaActionPerformed

    private void imnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnFornecedorActionPerformed
        this.controle.iniciaFornecedorControle();
    }//GEN-LAST:event_imnFornecedorActionPerformed

    private void imnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnProdutoActionPerformed
        this.controle.iniciaProdutoControle();
    }//GEN-LAST:event_imnProdutoActionPerformed

    private void imnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnCategoriaActionPerformed
        this.controle.iniciaCategoriaControle();
    }//GEN-LAST:event_imnCategoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem imnCategoria;
    private javax.swing.JMenuItem imnFornecedor;
    private javax.swing.JMenuItem imnFuncionario;
    private javax.swing.JMenuItem imnMesa;
    private javax.swing.JMenuItem imnProduto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
