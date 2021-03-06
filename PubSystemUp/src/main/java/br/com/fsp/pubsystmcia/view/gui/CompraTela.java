/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.view.gui;

import br.com.fsp.pubsystmcia.controller.CompraController;
import br.com.fsp.pubsystmcia.controller.FornecedorController;
import br.com.fsp.pubsystmcia.dao.FornecedorDao;
import br.com.fsp.pubsystmcia.model.Compra;
import br.com.fsp.pubsystmcia.model.Fornecedor;
import br.com.fsp.pubsystmcia.modelcombo.FornecedoresCellRenderer;
import br.com.fsp.pubsystmcia.modelcombo.FornecedoresComboModel;
import br.com.fsp.pubsystmcia.modeltable.FornecedorTableModel;
import br.com.fsp.pubsystmcia.view.IViewSimplesCRUD;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Frederico
 */
public class CompraTela extends ViewGuiSimples implements IViewSimplesCRUD<Compra> {

    private static final CompraController controller = null;
    private static final CompraTela tela =null;
    private final FornecedorDao fornecedorDao = new FornecedorDao();
    private final FornecedorController fornecedorController = new FornecedorController();
    private final FornecedoresComboModel modelFornecedores = new FornecedoresComboModel();
    private final FornecedorTableModel fornecedorModel;
    private List<Fornecedor> listaFornecedores;
    
    private boolean retornoOk;

    public boolean isRetornoOk() {
        return retornoOk;
    }
    
    /**
     * Creates new form ViewGuiCadastroCompra
     */
    public CompraTela(java.awt.Frame parent, boolean modal, FornecedorTableModel fornecedorModel) {
        super(parent, modal);
        this.fornecedorModel = fornecedorModel;
        initComponents();
        this.cbxFornecedor.setRenderer(new FornecedoresCellRenderer());
    }
    
    public void setListaFornecedores(List<Fornecedor> listaFornecedores) {
        this.listaFornecedores = listaFornecedores;
    }

//    public static CompraTela GetInstance(java.awt.Frame parent, boolean modal) {
//        if (tela == null) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CompraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CompraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CompraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CompraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//            return new CompraTela(parent, modal);
//        } else {
//            return tela;
//        }
//
//    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();
        lblFornecedor = new javax.swing.JLabel();
        cbxFornecedor = new javax.swing.JComboBox<>();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduto = new javax.swing.JTable();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitulo.setFont(new java.awt.Font("Nimbus Mono L", 1, 18)); // NOI18N
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Cadastro de Compra");
        lTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblFornecedor.setText("Fornecedor:");

        cbxFornecedor.setModel(this.modelFornecedores);
        cbxFornecedor.setSelectedItem(this.modelFornecedores);

        lblData.setText("Data:");

        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        tableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Produto", "Categoria", "Validade"
            }
        ));
        jScrollPane1.setViewportView(tableProduto);

        btnOk.setText("Cadastrar");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(lblFornecedor)
                        .addGap(25, 25, 25)
                        .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(lblData)
                        .addGap(25, 25, 25)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(20, 20, 20)
                .addComponent(btnOk)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornecedor)
                    .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData)
                    .addComponent(txtData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnOk))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        retornoOk = true;
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        retornoOk = false;
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<Fornecedor> cbxFornecedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JTable tableProduto;
    private javax.swing.JFormattedTextField txtData;
    // End of variables declaration//GEN-END:variables

    @Override
    public Compra criar() {
//        this.limpaTela();
        
        Compra compra = null;
        cbxFornecedor.setModel(new DefaultComboBoxModel(listaFornecedores.toArray()));
        this.setVisible(true);
        if (retornoOk) {
            compra = this.getScreenObject();

        }
        return compra;
    }

    @Override
    public void mostrar(Compra type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compra editar(Compra salvar) {
        this.setVisible(true);
        if(retornoOk){
            //salvar.setFornecedor( (Fornecedor) cbxFornecedor.getSelectedItem());
            //salvar.setDataCompra(txtData.getText());
        }
        return salvar;
    }

    @Override
    public boolean excluir(Compra deletar) {
        this.preencherTela(deletar);
        this.setVisible(true);
        return true;
    }

    @Override
    public void listar(List<Compra> listas) {
        String lista = "";
        for (Compra compra : listas) {
            if (compra != null) {
                lista += compra.toString() + "\n";
            }
        }
        this.showMessage(lista);
    }

    @Override
    public void read(Compra Type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compra getScreenObject() {
        Compra novo = new Compra();
        novo.setFornecedor( (Fornecedor) cbxFornecedor.getSelectedItem());
        //novo.setDataCompra(txtData.getText());
        return novo;
    }

    @Override
    public void preencherTela(Compra preencha) {
        
    }

    @Override
    public void limpaTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
