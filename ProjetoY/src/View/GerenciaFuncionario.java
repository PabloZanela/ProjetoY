package View;

import Model.Funcionario;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciaFuncionario extends javax.swing.JFrame {

    private Funcionario objfuncionario;// cria o v�nculo com o objfuncionario

    public GerenciaFuncionario() {
        initComponents();
        this.objfuncionario = new Funcionario();
        this.carregaTabela();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        c_nome = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        c_idade = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        c_cargo = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        c_cep = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b_cancelar = new javax.swing.JButton();
        b_alterar = new javax.swing.JButton();
        b_apagar = new javax.swing.JButton();

        jRadioButton4.setText("Feminino");

        jRadioButton5.setText("Masculino");

        jLabel5.setText("Sexo:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Funcionarios");

        jTableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Cargo", "CEP"
            }
        ));
        jTableFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFuncionarios);
        if (jTableFuncionarios.getColumnModel().getColumnCount() > 0) {
            jTableFuncionarios.getColumnModel().getColumn(1).setMinWidth(200);
            jTableFuncionarios.getColumnModel().getColumn(3).setMinWidth(100);
        }

        jScrollPane2.setViewportView(c_nome);

        jScrollPane3.setViewportView(c_idade);

        jScrollPane4.setViewportView(c_cargo);

        jScrollPane5.setViewportView(c_cep);

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        jLabel3.setText("Cargo:");

        jLabel4.setText("CEP:");

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });

        b_apagar.setText("Apagar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(b_cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b_alterar)
                                        .addGap(22, 22, 22)
                                        .addComponent(b_apagar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                            .addComponent(jScrollPane5))))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b_alterar)
                        .addComponent(b_apagar))
                    .addComponent(b_cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed
        try {
            // recebendo e validando dados da interface gr�fica.
            int id = 0;
            String nome = "";
            int idade = 0;
            String cargo = "";
            String cep = "";

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
                throw new Mensagens("Cargo deve conter ao menos 2 caracteres.");
            } else {
                cargo = this.c_cargo.getText();
            }
            if (this.c_cep.getText().length() <= 0) {
                throw new Mensagens("CEP deve ser maior que zero.");
            } else {
                cep = this.c_cep.getText();
            }
            if (this.jTableFuncionarios.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro selecione um funcionario para alterar.");
            } else {
                id = Integer.parseInt(this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 0).toString());
            }

            // envia os dados para o funcionarios processar
            if (this.objfuncionario.UpdateFuncionarioBD(cargo, cep, id, nome, idade)) {
                this.c_nome.setText("");
                this.c_idade.setText("");
                this.c_cargo.setText("");
                this.c_cep.setText("");
                JOptionPane.showMessageDialog(rootPane, "Funcionario Alterado com Sucesso!");
            }

            System.out.println(this.objfuncionario.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, objfuncionario.getMinhaLista().toString());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "informe um numero;");
        } finally {
            carregaTabela();// atualiza a tabela.

        }

    }//GEN-LAST:event_b_alterarActionPerformed

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarActionPerformed
        try {
            // validando dados da interface gr�fica.
            int id = 0;
            if (this.jTableFuncionarios.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Aluno para APAGAR");
            } else {
                id = Integer.parseInt(this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro bot�o | 1 -> segundo bot�o | 2 -> terceiro bot�o
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Funcionario ?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Funcionario processar
                if (this.objfuncionario.DeleteAlunoBD(id)) {

                    // limpa os campos
                    this.c_nome.setText("");
                    this.c_idade.setText("");
                    this.c_cargo.setText("");
                    this.c_cep.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Funcionario Apagado com Sucesso!");

                }

            }

            System.out.println(this.objfuncionario.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_b_apagarActionPerformed

    private void jTableFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionariosMouseClicked
        if (this.jTableFuncionarios.getSelectedRow() != -1) {

            String nome = this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 1).toString();
            String idade = this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 2).toString();
            String curso = this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 3).toString();
            String fase = this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 4).toString();

            this.c_nome.setText(nome);
            this.c_idade.setText(idade);
            this.c_cargo.setText(curso);
            this.c_cep.setText(fase);

        }
    }//GEN-LAST:event_jTableFuncionariosMouseClicked
    @SuppressWarnings("unchecked")
    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableFuncionarios.getModel();
        modelo.setNumRows(0);

        ArrayList<Funcionario> minhalista = new ArrayList<>();
        minhalista = objfuncionario.getMinhaLista();

        for (Funcionario a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getIdade(),
                a.getCargo(),
                a.getCEP()
            });
        }

    }

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
            java.util.logging.Logger.getLogger(GerenciaFuncionario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaFuncionario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaFuncionario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaFuncionario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JTextPane c_cargo;
    private javax.swing.JTextPane c_cep;
    private javax.swing.JTextPane c_idade;
    private javax.swing.JTextPane c_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableFuncionarios;
    // End of variables declaration//GEN-END:variables
}
