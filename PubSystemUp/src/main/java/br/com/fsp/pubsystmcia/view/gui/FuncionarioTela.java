/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.view.gui;

import br.com.fsp.pubsystmcia.model.Funcionario;
import br.com.fsp.pubsystmcia.view.IViewSimplesCRUD;
import java.util.List;
import br.com.fsp.pubsystmcia.model.validacoes.LimiteDigitosLetras;
import br.com.fsp.pubsystmcia.model.validacoes.LimiteDigitosLetrasNumeros;
import br.com.fsp.pubsystmcia.model.validacoes.ValidaCPF;
import br.com.fsp.pubsystmcia.model.validacoes.ValidaEmail;

/**
 *
 * @author aluno
 */
public class FuncionarioTela extends ViewGuiSimples implements IViewSimplesCRUD<Funcionario> {

    private static FuncionarioTela tela;
    private boolean retornoOk;

    public boolean isRetornoOk() {
        return retornoOk;
    }

    public FuncionarioTela(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtNome.setDocument(new LimiteDigitosLetras(20));
        txtSenha.setDocument(new LimiteDigitosLetrasNumeros(15));
        txtLogin.setDocument(new LimiteDigitosLetrasNumeros((15)));
    }

    public static FuncionarioTela GetInstance(java.awt.Frame parent, boolean modal) {
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
                java.util.logging.Logger.getLogger(FuncionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(FuncionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(FuncionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(FuncionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            return new FuncionarioTela(parent, modal);
        } else {
            return tela;
        }

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
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        lblConfSenha = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        txtCpf = new javax.swing.JFormattedTextField();
        txtConfSenha = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitulo.setFont(new java.awt.Font("Nimbus Mono L", 1, 18)); // NOI18N
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Cadastro de Funcionário");
        lTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNome.setText("Nome:");

        lblCpf.setText("CPF:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblEmail.setText("E-mail:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblLogin.setText("Login:");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        lblSenha.setText("Senha:");

        lblConfSenha.setText("Confirmação de Senha:");

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
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        txtConfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfSenhaActionPerformed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblConfSenha)
                                    .addComponent(lblEmail)
                                    .addComponent(lblCpf)
                                    .addComponent(lblNome)
                                    .addComponent(lblLogin)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblSenha)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtConfSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(124, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnOk)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfSenha)
                    .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnCancelar)
                    .addComponent(btnOk))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        String senha = txtSenha.getText();
        String confSenha = txtConfSenha.getText();

        if (txtNome.getText().isEmpty() || txtCpf.getText().isEmpty()
                || txtEmail.getText().isEmpty() || txtLogin.getText().isEmpty()
                || txtSenha.getText().isEmpty() || txtConfSenha.getText().isEmpty()) {
            this.showErrorMessage("Campo vazio!");
//        } else if (txtNome.getText().length() < 3) {
//            this.showErrorMessage("O Nome deve conter no mínimo 3 caracteres!");
//        } else if (txtSenha.getText().length() < 6) {
//            this.showErrorMessage("A Senha deve conter no mínimo 6 caracteres!");
//        } else if (txtLogin.getText().length() < 4) {
//            this.showErrorMessage("Login deve conter no mínimo 4 caracteres!");
//        } else if (ValidaCPF.isCPF(String.valueOf(txtCpf.getText())) == false) {
//            this.showErrorMessage("CPF é invalido!");
//        } else if (ValidaEmail.validaEmail(txtEmail.getText()) == false) {
//            this.showErrorMessage("O Email informado é invalido!");
//        } else if (senha.equals(confSenha) == false) {
//            this.showMessage("Senha errada");
        } else {
            retornoOk = true;
            this.dispose();
        }
    }//GEN-LAST:event_btnOkActionPerformed

//     Scanner ler = new Scanner(System.in);
//
//            String CPF;
//
//            System.out.printf("Informe um CPF: ");
//            CPF = ler.next();
//
//            System.out.printf("\nResultado: ");
//                // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
//            if (ValidaCPF.isCPF(CPF) == true)
//               System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
//            else System.out.printf("Erro, CPF invalido !!!\n");
//            }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        retornoOk = false;
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.limpaTela();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtConfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfSenhaActionPerformed

    }//GEN-LAST:event_txtConfSenhaActionPerformed

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfFocusLost

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
            java.util.logging.Logger.getLogger(FuncionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FuncionarioTela dialog = new FuncionarioTela(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lblConfSenha;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    @Override
    public Funcionario criar() {
        this.limpaTela();
        this.setVisible(true);
        Funcionario funcionario = null;
        if (retornoOk) {
            funcionario = this.getScreenObject();
        }
        return funcionario;
    }

    @Override
    public Funcionario getScreenObject() {

        Funcionario novo = new Funcionario();
        novo.setNome(txtNome.getText());
        boolean valido;

//        do{
//            this.showMessage("Forneça o Cpf do Cliente: (Somente Digitos)");
//            //valido = temp.setCpf(entrada.next());
//            valido = novo.setCpf(txtCpf.getText());
//        }while(!valido);
        //novo.setCpf(txtCpf.getText());
        novo.setCpf(txtCpf.getText());
        novo.setEmail(txtEmail.getText());
        novo.setLogin(txtLogin.getText());
        novo.setSenha(txtSenha.getText());
        return novo;
    }

    public void limpaTela() {

        txtNome.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtLogin.setText("");
        txtSenha.setText("");
        txtConfSenha.setText("");
    }

    @Override
    public void preencherTela(Funcionario preencha) {
        txtNome.setText(preencha.getNome());
        txtCpf.setText(String.valueOf(preencha.getCpf()));
        txtEmail.setText(preencha.getEmail());
        txtLogin.setText(preencha.getLogin());
        txtSenha.setText(preencha.getSenha());
        txtConfSenha.setText("");
        txtSenha.setVisible(false);
        txtConfSenha.setVisible(false);
        
    }

    @Override
    public void listar(List<Funcionario> listas) {
        String lista = "";
        for (Funcionario funcionario : listas) {
            if (funcionario != null) {
                lista += funcionario.toString() + "\n";
            }
        }
        showMessage(lista);
    }

    @Override
    public void mostrar(Funcionario type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionario editar(Funcionario funcionario) {
        this.preencherTela(funcionario);
        
        this.setVisible(true);
        if (retornoOk) {
            funcionario.setNome(txtNome.getText());
            funcionario.setCpf(txtCpf.getText());
            funcionario.setEmail(txtEmail.getText());
//            funcionario.setLogin(txtLogin.getText());
//            funcionario.setSenha(txtSenha.getText());
        } else if (retornoOk == false) {
            showMessage("CANCELADO PELO USUÁRIO!");
        } else if (funcionario == null) {
            showMessage("NÃO ENCONTRADO!");
        } else {
            showMessage("ALTERADO COM SUCESSO!");
        }
        return funcionario;
    }

    @Override
    public boolean excluir(Funcionario deletar) {
        this.preencherTela(deletar);
        this.setVisible(true);
        return true;
    }
    //Este abaixo comentado é o DELETAR que estava no meu, como não entedi o que o alessio fez no dele não mexi com esse ainda.

//    public Funcionario delete(Funcionario remover) {
//        String id = "";
//        Funcionario funcionario = null;
//        askForLong(id);
//
//        for (Funcionario funcio : findAllList()) {
//            if (funcio.getCodigo().equals(id)) {
//                funcionario = funcio;
//            }
//        }
//        if (funcionario == null) {
//            showMessage("NÃO ENCONTRADO!");
//        }
//        else{
//            showMessage("ALTERADO COM SUCESSO!");
//        }
//
//        return funcionario;
//    }
    @Override
    public void read(Funcionario Type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
