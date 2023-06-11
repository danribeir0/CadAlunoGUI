/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import beans.Aluno;
import dao.AlunoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Daniel
 */
public class FormCadAluno extends javax.swing.JFrame {

    public void preencheTabela() {
        AlunoDAO alunoDAO = new AlunoDAO();
        List<Aluno> listaAlunos = alunoDAO.getAlunos();
        for (Aluno aluno : listaAlunos) {
            addAlunoTabela(aluno);
        }
    }

    public void addAlunoTabela(Aluno aluno) {
        Object[] novoAluno = new Object[]{
            aluno.getId(),
            aluno.getNome(),
            aluno.getNota1(),
            aluno.getNota2(),
            aluno.getNota3(),
            aluno.situacao()
        };
        DefaultTableModel tabela = (DefaultTableModel) tblAlunos.getModel();
        tabela.addRow(novoAluno);
    }

    /**
     * Creates new form FormCadAluno
     */
    public FormCadAluno() {
        initComponents();
        centralizarTextoTabela();
        preencheTabela();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txfNome = new javax.swing.JTextField();
        txfNota1 = new javax.swing.JTextField();
        txfNota2 = new javax.swing.JTextField();
        txfNota3 = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Aluno");
        setName("frameCadAluno"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(this);
        jLabel1.setText("Cadastro de alunos e notas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nota 1:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nota 2:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nota 3:");

        txfNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txfNota1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txfNota2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txfNota3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvar.setMaximumSize(new java.awt.Dimension(100, 31));
        btnSalvar.setMinimumSize(new java.awt.Dimension(100, 31));
        btnSalvar.setPreferredSize(new java.awt.Dimension(100, 31));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setMaximumSize(new java.awt.Dimension(100, 31));
        btnExcluir.setMinimumSize(new java.awt.Dimension(100, 31));
        btnExcluir.setPreferredSize(new java.awt.Dimension(100, 31));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tblAlunos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Aluno", "Nota 1", "Nota 2", "Nota 3", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAlunos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tblAlunosMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlunos);
        if (tblAlunos.getColumnModel().getColumnCount() > 0) {
            tblAlunos.getColumnModel().getColumn(0).setMinWidth(40);
            tblAlunos.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblAlunos.getColumnModel().getColumn(0).setMaxWidth(50);
            tblAlunos.getColumnModel().getColumn(1).setMinWidth(200);
            tblAlunos.getColumnModel().getColumn(2).setMinWidth(60);
            tblAlunos.getColumnModel().getColumn(2).setPreferredWidth(70);
            tblAlunos.getColumnModel().getColumn(2).setMaxWidth(80);
            tblAlunos.getColumnModel().getColumn(3).setMinWidth(60);
            tblAlunos.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblAlunos.getColumnModel().getColumn(3).setMaxWidth(80);
            tblAlunos.getColumnModel().getColumn(4).setMinWidth(60);
            tblAlunos.getColumnModel().getColumn(4).setPreferredWidth(70);
            tblAlunos.getColumnModel().getColumn(4).setMaxWidth(80);
            tblAlunos.getColumnModel().getColumn(5).setMinWidth(100);
            tblAlunos.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(251, 251, 251))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txfNome.getText().isEmpty()
                || txfNota1.getText().isEmpty()
                || txfNota2.getText().isEmpty()
                || txfNota3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos.");
            return;
        }

        Aluno aluno = new Aluno(
                txfNome.getText().toUpperCase(),
                Double.parseDouble(txfNota1.getText()),
                Double.parseDouble(txfNota2.getText()),
                Double.parseDouble(txfNota3.getText()));

        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.inserir(aluno);
        aluno.setId(alunoDAO.getId());

        addAlunoTabela(aluno);

        limpaCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int rowSelcted = tblAlunos.getSelectedRow();
        if (rowSelcted == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha");
        } else {
            String nome = (String) tblAlunos.getValueAt(rowSelcted, 0);
            if (JOptionPane.showConfirmDialog(rootPane, "Confirma exclusão do aluno: " + nome) == 0) {
                DefaultTableModel tabela = (DefaultTableModel) tblAlunos.getModel();
                tabela.removeRow(rowSelcted);
                JOptionPane.showMessageDialog(rootPane, "Aluno excluído com sucesso!");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblAlunosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlunosMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAlunosMouseMoved

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
            java.util.logging.Logger.getLogger(FormCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadAluno().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTextField txfNome;
    private javax.swing.JTextField txfNota1;
    private javax.swing.JTextField txfNota2;
    private javax.swing.JTextField txfNota3;
    // End of variables declaration//GEN-END:variables

    private void centralizarTextoTabela() {
        JTableHeader header = tblAlunos.getTableHeader();

        DefaultTableCellRenderer headerRender = new DefaultTableCellRenderer();
        headerRender.setHorizontalAlignment(SwingConstants.LEFT);
        tblAlunos.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(headerRender);
        tblAlunos.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer(headerRender);

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 2; i <= 5; i++) {
            tblAlunos.getTableHeader().getColumnModel().getColumn(i).setHeaderRenderer(cellRenderer);
            tblAlunos.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
    }

    public void limpaCampos() {
        txfNome.setText("");
        txfNota1.setText("");
        txfNota2.setText("");
        txfNota3.setText("");
    }
}