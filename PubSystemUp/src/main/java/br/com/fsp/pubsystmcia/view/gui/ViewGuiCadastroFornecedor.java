/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.view.gui;

import br.com.fsp.pubsystmcia.model.Endereco;
import br.com.fsp.pubsystmcia.model.Fornecedor;
import br.com.fsp.pubsystmcia.view.IViewSimplesCRUD;
import java.util.List;

/**
 *
 * @author Frederico
 */
public class ViewGuiCadastroFornecedor extends ViewGuiSimples implements IViewSimplesCRUD<Fornecedor> {

    private static ViewGuiCadastroFornecedor tela;
    private boolean retornoOk;

    public boolean isRetornoOk() {
        return retornoOk;
    }

    public static ViewGuiCadastroFornecedor GetInstance(java.awt.Frame parent, boolean modal) {
        if (tela == null) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
             */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(ViewGuiCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(ViewGuiCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(ViewGuiCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(ViewGuiCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            return new ViewGuiCadastroFornecedor(parent, modal);
        } else {
            return tela;
        }

    }

    public ViewGuiCadastroFornecedor(java.awt.Frame parent, boolean modal) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        txtEndereco = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblRazaoSocial = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefoneFixo = new javax.swing.JFormattedTextField();
        lblTelefoneFixo = new javax.swing.JLabel();
        lTitulo = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        txtTelefone = new javax.swing.JFormattedTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jTree1);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNome.setText("Nome:");

        lblRazaoSocial.setText("Razão Social:");

        lblTelefone.setText("Telefone:");

        try {
            txtTelefoneFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblTelefoneFixo.setText("Telefone fixo:");

        lTitulo.setFont(new java.awt.Font("Nimbus Mono L", 1, 18)); // NOI18N
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Cadastro de Fornecedor");
        lTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblEndereco.setText("Endereço:");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

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

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTelefoneFixo)
                            .addComponent(lblRazaoSocial)
                            .addComponent(lblNome)
                            .addComponent(lblTelefone)
                            .addComponent(lblEndereco))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefoneFixo)
                            .addComponent(txtEndereco)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE))
                    .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnOk)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazaoSocial)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneFixo)
                    .addComponent(txtTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnCancelar)
                    .addComponent(btnOk))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.limpaTela();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        retornoOk = false;
        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (txtNome.getText().isEmpty() || txtRazaoSocial.getText().isEmpty()) {
            this.showErrorMessage("Campo vazio!");
        } else {
            retornoOk = true;
            this.dispose();
        }
    }//GEN-LAST:event_btnOkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewGuiCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewGuiCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewGuiCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGuiCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            ViewGuiCadastroFornecedor dialog = new ViewGuiCadastroFornecedor(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnOk;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRazaoSocial;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefoneFixo;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JFormattedTextField txtTelefoneFixo;
    // End of variables declaration//GEN-END:variables

    @Override
    public Fornecedor criar() {
        this.limpaTela();
        this.setVisible(true);
        Fornecedor fornecedor = null;
        if (retornoOk) {
            fornecedor = this.getScreenObject();

        }
        return fornecedor;

    }

    @Override
    public Fornecedor getScreenObject() {

        Fornecedor novo = new Fornecedor();
        novo.setNome(txtNome.getText());
        //novo.setEndereco(txtEndereco.getText());
//        Endereco endereco = new Endereco();
//        String[] enderecoSeparado;
//        enderecoSeparado = txtRazaoSocial.getText().split(";");
//
//        endereco.setLogradouro(enderecoSeparado[0]);
//        endereco.setBairro(enderecoSeparado[1]);
//        endereco.setLocalidade(enderecoSeparado[2]);
//
//        endereco.setFornecedor(novo);
//
//        novo.addEndereco(endereco);
        novo.setRazaoSocial(txtRazaoSocial.getText());

        return novo;
    }

    @Override
    public void limpaTela() {

        txtNome.setText("");
        txtEndereco.setText("");
        txtRazaoSocial.setText("");
        txtTelefone.setText("");
        txtTelefoneFixo.setText("");
    }

    @Override
    public void preencherTela(Fornecedor preencha) {
        txtNome.setText(preencha.getNome());
        Endereco get = preencha.getEnderecos().get(0);
        String endereco = get.getLogradouro() + ";" + get.getLocalidade() + ";" + get.getBairro() + ";" + get.getCep();
        txtEndereco.setText(endereco);
        txtRazaoSocial.setText(preencha.getRazaoSocial());
        //txtTelefone.setText(preencha.getTelefones());
        //txtTelefoneFixo.setText(preencha.getTelefones());
    }

    @Override
    public void mostrar(Fornecedor type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Fornecedor editar(Fornecedor fornecedor) {
        this.setVisible(true);
        if (retornoOk) {
            fornecedor.setNome(txtNome.getText());
            //novo.setEndereco(txtEndereco.getText());
            fornecedor.setRazaoSocial(txtRazaoSocial.getText());
        } else if (retornoOk == false) {
            showMessage("CANCELADO PELO USUÁRIO!");
        } else if (fornecedor == null) {
            showMessage("NÃO ENCONTRADO!");
        } else {
            showMessage("ALTERADO COM SUCESSO!");
        }
        return fornecedor;
    }

    @Override
    public boolean excluir(Fornecedor deletar) {
        this.preencherTela(deletar);
        this.setVisible(true);
        return true;
    }

    @Override
    public void listar(List<Fornecedor> listas) {
        String lista = "";
        for (Fornecedor fornecedor : listas) {
            if (fornecedor != null) {
                lista += fornecedor.toString() + "\n";
            }
            showMessage(lista);
        }
    }

    @Override
    public void read(Fornecedor Type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
