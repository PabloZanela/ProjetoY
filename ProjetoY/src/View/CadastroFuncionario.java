package View;

import Model.Funcionario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroFuncionario extends javax.swing.JFrame {

   private Funcionario objfuncionario;// cria o v�nculo com o Funcionario.java
   
    public CadastroFuncionario() {
        initComponents();
        setLocationRelativeTo(null);
        this.objfuncionario = new Funcionario();// carrega objeto vazio de funcionario
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c_CEP = new javax.swing.JTextField();
        b_cadastrar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_idade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c_cargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Funcionarios");
        setResizable(false);

        c_CEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_CEPActionPerformed(evt);
            }
        });

        b_cadastrar.setText("Cadastrar");
        b_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarActionPerformed(evt);
            }
        });

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Idade: ");

        jLabel3.setText("Cargo: ");

        c_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cargoActionPerformed(evt);
            }
        });

        jLabel4.setText("CEP:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_nome)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(b_cadastrar))
                    .addComponent(c_cargo)
                    .addComponent(c_CEP)
                    .addComponent(c_idade))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar)
                    .addComponent(b_cadastrar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_CEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_CEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_CEPActionPerformed

    private void b_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarActionPerformed

        try {
            // recebendo e validando dados da interface gr�fica.
            String nome = "";
            int idade = 0;
            String cargo = "";
            String CEP = "";

            if (this.c_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.c_nome.getText();
            }

            if (this.c_idade.getText().length() <= 0) {
                throw new Mensagens("Idade deve ser n�mero e maior que zero.");
            } else {
                idade = Integer.parseInt(this.c_idade.getText());
            }

            if (this.c_cargo.getText().length() < 2) {
                throw new Mensagens("Curso deve conter ao menos 2 caracteres.");
            } else {
                cargo = this.c_cargo.getText();
            }

            if (this.c_CEP.getText().length() <= 0) {
                throw new Mensagens("CEP deve ser n�mero e maior que zero.");
            } else {
                CEP = this.c_CEP.getText();
            }

            // envia os dados para o Controlador cadastrar
            if (this.objfuncionario.InsertFuncionarioBD(cargo, CEP, nome, idade)) {
                JOptionPane.showMessageDialog(rootPane, "Funcionario Cadastrado com Sucesso!");

                // limpa campos da interface
                this.c_nome.setText("");
                this.c_idade.setText("");
                this.c_cargo.setText("");
                this.c_CEP.setText("");

            }

            System.out.println(this.objfuncionario.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um n�mero.");
        }

    }//GEN-LAST:event_b_cadastrarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    private void c_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cargoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cadastrar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JTextField c_CEP;
    private javax.swing.JTextField c_cargo;
    private javax.swing.JTextField c_idade;
    private javax.swing.JTextField c_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}