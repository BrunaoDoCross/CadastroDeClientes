/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Tela;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.HibernateUtil;

/**
 *
 * @author NOTE
 */
public class Tela extends javax.swing.JDialog {

    /**
     * Creates new form Tela
     */
    public Tela(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        montaTabela();
        validacao("inicio");
    }
    Cliente c;
    char controle = 'c';
    List<Cliente> lista, teste = new ArrayList<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sair = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        novo = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusCycleRoot(false);
        setIconImage(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Estado");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setFocusable(false);
        jLabel2.setPreferredSize(null);
        jLabel2.setRequestFocusEnabled(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Nome");
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setFocusable(false);
        jLabel3.setPreferredSize(null);
        jLabel3.setRequestFocusEnabled(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("CPF");
        jLabel4.setAlignmentY(0.0F);
        jLabel4.setFocusable(false);
        jLabel4.setPreferredSize(null);
        jLabel4.setRequestFocusEnabled(false);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 30, 15));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Cidade");
        jLabel5.setAlignmentY(0.0F);
        jLabel5.setFocusable(false);
        jLabel5.setPreferredSize(null);
        jLabel5.setRequestFocusEnabled(false);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/output-onlinepngtools.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setFocusable(false);
        jLabel7.setRequestFocusEnabled(false);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 160, 140));

        nome.setAlignmentX(0.0F);
        nome.setAlignmentY(0.0F);
        nome.setNextFocusableComponent(cpf);
        nome.setPreferredSize(null);
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 160, -1));

        cpf.setAlignmentX(0.0F);
        cpf.setAlignmentY(0.0F);
        cpf.setNextFocusableComponent(cidade);
        cpf.setPreferredSize(null);
        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });
        getContentPane().add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, -1));

        cidade.setAlignmentX(0.0F);
        cidade.setAlignmentY(0.0F);
        cidade.setNextFocusableComponent(estado);
        cidade.setPreferredSize(null);
        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });
        getContentPane().add(cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 160, -1));

        estado.setAlignmentX(0.0F);
        estado.setAlignmentY(0.0F);
        estado.setNextFocusableComponent(nome);
        estado.setPreferredSize(null);
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 160, -1));

        jScrollPane1.setFocusable(false);
        jScrollPane1.setRequestFocusEnabled(false);

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setFocusable(false);
        jTable1.setPreferredSize(null);
        jTable1.setRequestFocusEnabled(false);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 292, 650, 260));

        sair.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        sair.setText("Sair");
        sair.setAlignmentY(0.0F);
        sair.setFocusable(false);
        sair.setRequestFocusEnabled(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        confirmar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.setAlignmentY(0.0F);
        confirmar.setFocusable(false);
        confirmar.setRequestFocusEnabled(false);
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        novo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        novo.setText("Cadastrar Cliente");
        novo.setAlignmentY(0.0F);
        novo.setRequestFocusEnabled(false);
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });
        getContentPane().add(novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        cancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setAlignmentY(0.0F);
        cancelar.setRequestFocusEnabled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        excluir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        excluir.setText("Excluir Cliente");
        excluir.setRequestFocusEnabled(false);
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        getContentPane().add(excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void montaTabela() {

        lista = HibernateUtil.getSession().createQuery("from Cliente").list();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Cidade");
        modelo.addColumn("Estado");

        for (Cliente c : lista) {
            modelo.addRow(new Object[]{c.getNome(), c.getCpf(), c.getCidade(), c.getEstado()});
        }

        jTable1.setModel(modelo);
    }

    public void validacao(String texto) {
        if (texto == "inicio") {
            nome.setEnabled(false);
            cpf.setEnabled(false);
            cidade.setEnabled(false);
            estado.setEnabled(false);
            novo.setEnabled(true);
            excluir.setEnabled(true);
            confirmar.setEnabled(false);
            cancelar.setEnabled(false);
            sair.setEnabled(true);
            jTable1.setEnabled(false);
        } else if (texto == "novo") {
            nome.setEnabled(true);
            cpf.setEnabled(true);
            cidade.setEnabled(true);
            estado.setEnabled(true);
            novo.setEnabled(false);
            excluir.setEnabled(false);
            confirmar.setEnabled(true);
            cancelar.setEnabled(true);
            sair.setEnabled(false);
            jTable1.setEnabled(false);
        } else if (texto == "excluir") {
            nome.setEnabled(false);
            cpf.setEnabled(false);
            cidade.setEnabled(false);
            estado.setEnabled(false);
            novo.setEnabled(false);
            excluir.setEnabled(false);
            confirmar.setEnabled(true);
            cancelar.setEnabled(true);
            sair.setEnabled(false);
            jTable1.setEnabled(true);
        }
    }

    public void limpaTela() {
        nome.setText("");
        cidade.setText("");
        cpf.setText("");
        estado.setText("");
    }

    private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed

    }//GEN-LAST:event_nomeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        c = lista.get(jTable1.getSelectedRow());
        nome.setText(c.getNome());
        estado.setText(c.getEstado());
        cpf.setText(c.getCpf());
        cidade.setText(c.getCidade());

    }//GEN-LAST:event_jTable1MouseClicked

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if (controle == 'c') {

            if (nome.getText().equals("") || cpf.getText().equals("") || estado.getText().equals("") || cidade.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite em todos os campos...");
            } else {

                c = new Cliente(nome.getText(), cidade.getText(), estado.getText(), cpf.getText());
                HibernateUtil.beginTransaction();
                HibernateUtil.getSession().merge(c);
                HibernateUtil.commitTransaction();
                HibernateUtil.closeSession();
                montaTabela();
                limpaTela();
                validacao("inicio");
    }//GEN-LAST:event_confirmarActionPerformed
        } else if (controle == 'e') {
            HibernateUtil.beginTransaction();
            HibernateUtil.getSession().delete(c);
            HibernateUtil.commitTransaction();
            HibernateUtil.closeSession();

            limpaTela();
            montaTabela();
            validacao("inicio");
        }
    }
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        montaTabela();
        limpaTela();
        validacao("inicio");
    }//GEN-LAST:event_cancelarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        montaTabela();
        limpaTela();
        validacao("novo");
        controle = 'c';
    }//GEN-LAST:event_novoActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        teste = HibernateUtil.getSession().createQuery("from Cliente").list();
        if (teste.size() <= 0) {
            JOptionPane.showMessageDialog(null, "A lista está vazia. Você não pode excluir nenhum cliente...");
        } else {
            montaTabela();
            limpaTela();
            validacao("excluir");
            controle = 'e';
    }//GEN-LAST:event_excluirActionPerformed
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
            java.util.logging.Logger.getLogger(Tela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tela dialog = new Tela(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cidade;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField estado;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nome;
    private javax.swing.JButton novo;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
