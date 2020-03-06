/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cadastromodelotabela;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class FormCadastroPessoas extends javax.swing.JFrame {
    
    Conexao conexaoBanco;
    ModeloTabelaPessoa modeloTabelaPessoa;
    String codigoLinha;
    ResultSet resultSetAux;
    boolean novo=true;
    /**
     * Creates new form FormCadastroPessoas
     */
    public FormCadastroPessoas() {
        initComponents();
        desabilitarCampos();
        try{
            conexaoBanco = new Conexao();
            conexaoBanco.conecta();
            conexaoBanco.executeSQL("Select * from pessoa");
            modeloTabelaPessoa = new ModeloTabelaPessoa(conexaoBanco.resultset);
            jTable1.setModel(modeloTabelaPessoa);
        } catch(SQLException erro){
            System.out.println("Erro: " + erro);
        }
    }
    
    private JTextField[] camposPessoa(){
        JTextField[] textField = {tfCodigo, tfNome, tfFone, tfEmail};
        return textField;
    }
    
    private void desabilitarCampos(){     
        //JTextField[] textField = camposPessoa();       
        for(int i = 0; i < camposPessoa().length; i++ ){
          camposPessoa()[i].setEnabled(false);
        }    
    }
    
    private void habilitarCampos(){     
        //JTextField[] textField = camposPessoa();       
        for(int i = 0; i < camposPessoa().length; i++ ){
          camposPessoa()[i].setEnabled(true);
        }    
    }
    
    private void limparCampos(){     
        //JTextField[] textField = camposPessoa();       
        for(int i = 0; i < camposPessoa().length; i++ ){
          camposPessoa()[i].setText("");
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

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfFone = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Pessoas");

        jTabbedPane1.setToolTipText("");

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista de Pessoas", jPanel1);

        jLabel2.setText("Codigo.:");

        jLabel3.setText("Nome.:");

        jLabel4.setText("E-mail.:");

        jLabel5.setText("Fone.:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFone, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados da Pessoa", jPanel2);

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btGravar.setText("Gravar");
        btGravar.setEnabled(false);
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btGravar)
                    .addComponent(btExcluir))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        novo = true;
        habilitarCampos();
        tfCodigo.requestFocus();
        btGravar.setEnabled(true);
    }//GEN-LAST:event_btNovoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        btExcluir.setEnabled(true);
        codigoLinha = (String) modeloTabelaPessoa.getValueAt(jTable1.getSelectedRow(), 0);
        
        if (evt.getClickCount() == 2) {
            btGravar.setEnabled(true);
            novo = false;
            jTabbedPane1.setSelectedIndex(1);
            habilitarCampos();
            JTextField[] textField = camposPessoa();
            String sql = "select * from pessoa where pesCodigo = " + codigoLinha;
            try{
                conexaoBanco.executeSQL(sql);
                conexaoBanco.resultset.next();
                for(int i=0; i < textField.length; i++){
                    textField[i].setText(conexaoBanco.resultset.getString(i+1));
                }
                tfCodigo.requestFocus();
            }catch(SQLException erro){

            }
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        int opcaoEscolhida = JOptionPane.showConfirmDialog(
                this, 
                "Exclusão",
                "Excluir registro? ", 
                JOptionPane.YES_NO_OPTION
        );
        if(opcaoEscolhida == JOptionPane.YES_OPTION){
            String sql = "Delete from pessoa where pesCodigo = " + codigoLinha;
            try {
                conexaoBanco.statement.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                modeloTabelaPessoa.deletarLinha(jTable1.getSelectedRow());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir");
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        // TODO add your handling code here:
         //gravaNovoRegistro();
         if (novo){
            gravaNovoRegistro1();
         } else {
            alteraRegistro();
         }
         
    }//GEN-LAST:event_btGravarActionPerformed
    
    public void gravaNovoRegistro(){
        try{
            String sql = "insert into pessoa values " + "(?,?,?,?)";
            PreparedStatement ps = conexaoBanco.connection.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(tfCodigo.getText()));
            ps.setString(2, tfNome.getText());
            ps.setString(3, tfFone.getText());
            ps.setString(4, tfEmail.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Gravado com sucesso");
            conexaoBanco.executeSQL("select * from pessoa");
            modeloTabelaPessoa.setResult(conexaoBanco.resultset);
            jTabbedPane1.setSelectedIndex(0);
            desabilitarCampos();
            btExcluir.setEnabled(false);
            btGravar.setEnabled(false);
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, erro);
        }
    }
    
    public void gravaNovoRegistro1(){
        JTextField[] tf = camposPessoa();
        try{
            String sql = "insert into pessoa values " + "(?,?,?,?)";
            PreparedStatement ps = conexaoBanco.connection.prepareStatement(sql);
            for (int i=0; i<tf.length;i++)
                ps.setString(i+1, tf[i].getText());           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Gravado com sucesso");
            conexaoBanco.executeSQL("select * from pessoa");
            modeloTabelaPessoa.setResult(conexaoBanco.resultset);
            jTabbedPane1.setSelectedIndex(0);
            desabilitarCampos();
            btExcluir.setEnabled(false);
            btGravar.setEnabled(false);
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, erro);
        }
    }
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
            java.util.logging.Logger.getLogger(FormCadastroPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroPessoas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFone;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    private void alteraRegistro() {
        
        try{
            String sql = "update pessoa set "
                    + "pesNome=?, pesFone=?, pesEmail=? where pesCodigo=?";
            JOptionPane.showMessageDialog(null, sql);
            PreparedStatement ps = conexaoBanco.connection.prepareStatement(sql);
            
            ps.setString(1, tfNome.getText());
            ps.setString(2, tfFone.getText());
            ps.setString(3, tfEmail.getText());
            ps.setInt(4, Integer.parseInt(tfCodigo.getText()));
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
             conexaoBanco.executeSQL("select * from pessoa");
            modeloTabelaPessoa.setResult(conexaoBanco.resultset);
            jTabbedPane1.setSelectedIndex(0);
            desabilitarCampos();
            btExcluir.setEnabled(false);
            btGravar.setEnabled(false);
            novo=true;
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, " Erro: " + erro);          
        }
    }
}
