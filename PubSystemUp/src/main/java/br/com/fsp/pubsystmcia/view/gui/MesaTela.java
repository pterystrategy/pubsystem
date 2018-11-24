/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.view.gui;

import br.com.fsp.pubsystmcia.model.Mesa;
import br.com.fsp.pubsystmcia.view.IViewSimplesCRUD;
import java.util.List;

/**
 *
 * @author Frederico
 */
public class MesaTela extends ViewGuiSimples implements IViewSimplesCRUD<Mesa> {

    /**
     * Creates new form ViewGuiMesaCadastro
     */
    public MesaTela(java.awt.Frame parent, boolean modal) {
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
        lblNumeroMesa = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        txtNumeroMesa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitulo.setFont(new java.awt.Font("Nimbus Mono L", 1, 18)); // NOI18N
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Cadastro de Mesa");
        lTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNumeroMesa.setText("Numero da Mesa:");

        btnLimpar.setText("Limpar");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnOk.setText("Cadastrar");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        txtNumeroMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeroMesa))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpar)
                        .addGap(20, 20, 20)
                        .addComponent(btnCancelar)
                        .addGap(20, 20, 20)
                        .addComponent(btnOk)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroMesa)
                    .addComponent(txtNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnCancelar)
                    .addComponent(btnOk))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroMesaActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        confirmado = true;
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        confirmado = false;
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lblNumeroMesa;
    private javax.swing.JTextField txtNumeroMesa;
    // End of variables declaration//GEN-END:variables
    private boolean confirmado = false;

    @Override
    public Mesa criar() {
        this.preparaCriar();
        this.setVisible(true);
        Mesa screenObject;
        if (confirmado) {
            screenObject = this.getScreenObject();
        }
        return this.getScreenObject();
    }

    @Override
    public void mostrar(Mesa type) {
        lTitulo.setText("Dados da Mesa");

        txtNumeroMesa.setText(Integer.toString(type.getNumero()));
        txtNumeroMesa.setEditable(false);
        txtNumeroMesa.setEnabled(false);

        btnCancelar.setVisible(false);
        this.setVisible(true);
    }

    @Override
    public Mesa editar(Mesa salvar) {

        this.setVisible(true);
        if (confirmado) {
            txtNumeroMesa.setText(Integer.toString(salvar.getNumero()));
            txtNumeroMesa.setEditable(false);
            txtNumeroMesa.setEnabled(false);
        } else if (confirmado == false) {
            showMessage("CANCELADO PELO USUÁRIO!");
        } else if (salvar == null) {
            showMessage("NÃO ENCONTRADO!");
        } else {
            showMessage("ALTERADO COM SUCESSO!");
        }
        return salvar;
    }

    @Override
    public boolean excluir(Mesa deletar) {
        this.preencherTela(deletar);
        this.setVisible(true);
        return true;
    }

    @Override
    public void listar(List<Mesa> listas) {
        String lista = "";
        for (Mesa mesa : listas) {
            if (mesa != null) {
                lista += mesa.toString() + "\n";
            }
        }
        showMessage(lista);
    }

    @Override
    public void read(Mesa Type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mesa getScreenObject() {
        this.limpaTela();
        if (txtNumeroMesa.getText().equals("")) {
            txtNumeroMesa.setText("0000");
        }
        Mesa retorno = new Mesa();
        retorno.setNumero(Integer.parseInt(txtNumeroMesa.getText()));
        return retorno;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    @Override
    public void preencherTela(Mesa preencha) {
        txtNumeroMesa.setText(Integer.toString(preencha.getNumero()));
        txtNumeroMesa.setEditable(true);
        txtNumeroMesa.setEnabled(true);
    }

    @Override
    public void limpaTela() {
        txtNumeroMesa.setText("");
    }
    
    private void preparaCriar(){
        lTitulo.setText("Cadastro de Mesa");
        txtNumeroMesa.setText("");
        txtNumeroMesa.setEditable(true);
        txtNumeroMesa.setEnabled(true);
        
        btnOk.setText("Salvar");
        btnOk.setVisible(true);
        
        btnCancelar.setVisible(true);
    }
}