/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.associacao;

import views.StartView;
import java.time.LocalDate;


public class AssociacaoView extends javax.swing.JFrame {
    
    private StartView strtView;
    
    public AssociacaoView(StartView strtView) {
        this.strtView = strtView;
        initComponents();
    }
    
    public StartView getStartView() {
        return this.strtView;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnAssociacao = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mbAssociacao = new javax.swing.JMenuBar();
        mnAssociacao = new javax.swing.JMenu();
        miCadastroAssociacao = new javax.swing.JMenuItem();
        mnAssoc2 = new javax.swing.JMenu();
        miListarAssociacao = new javax.swing.JMenuItem();
        mnAssoc3 = new javax.swing.JMenu();
        miAdicionarFazendeiro = new javax.swing.JMenuItem();
        mnRemoverFazendeiro = new javax.swing.JMenu();
        miRemoverFazendeiro = new javax.swing.JMenuItem();
        mnAdicionarMensalidade = new javax.swing.JMenu();
        miAdicionarMensalidade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Associação");
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnAssociacao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        String userName = System.getProperty("user.name");
        jLabel3.setText("Usuário: " + userName);
        pnAssociacao.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        LocalDate currentdate = LocalDate.now();
        jLabel2.setText("Data: " +currentdate.getDayOfMonth() +"/" + currentdate.getMonthValue() +"/" + currentdate.getYear());
        pnAssociacao.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Logo.png"))); // NOI18N
        pnAssociacao.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(pnAssociacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mnAssociacao.setText("Cadastrar");

        miCadastroAssociacao.setText("Nova Associação");
        miCadastroAssociacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroAssociacaoActionPerformed(evt);
            }
        });
        mnAssociacao.add(miCadastroAssociacao);

        mbAssociacao.add(mnAssociacao);

        mnAssoc2.setText("Listar");

        miListarAssociacao.setText("Associações");
        miListarAssociacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarAssociacaoActionPerformed(evt);
            }
        });
        mnAssoc2.add(miListarAssociacao);

        mbAssociacao.add(mnAssoc2);

        mnAssoc3.setText("Adicionar Fazendeiro");

        miAdicionarFazendeiro.setText("Adicionar");
        miAdicionarFazendeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAdicionarFazendeiroActionPerformed(evt);
            }
        });
        mnAssoc3.add(miAdicionarFazendeiro);

        mbAssociacao.add(mnAssoc3);

        mnRemoverFazendeiro.setText("Remover Fazendeiro");

        miRemoverFazendeiro.setText("Remover");
        miRemoverFazendeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoverFazendeiroActionPerformed(evt);
            }
        });
        mnRemoverFazendeiro.add(miRemoverFazendeiro);

        mbAssociacao.add(mnRemoverFazendeiro);

        mnAdicionarMensalidade.setText("Adicionar Mensalidade");

        miAdicionarMensalidade.setText("Adicionar");
        miAdicionarMensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAdicionarMensalidadeActionPerformed(evt);
            }
        });
        mnAdicionarMensalidade.add(miAdicionarMensalidade);

        mbAssociacao.add(mnAdicionarMensalidade);

        setJMenuBar(mbAssociacao);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastroAssociacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroAssociacaoActionPerformed
        //Criar view de cadastro
        CadastrarAssociacaoView cev = new CadastrarAssociacaoView(this);

        cev.setVisible(true);
    }//GEN-LAST:event_miCadastroAssociacaoActionPerformed

    private void miListarAssociacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarAssociacaoActionPerformed
        ListaAssociacaoView lev = new ListaAssociacaoView(this);

        lev.setVisible(true);
    }//GEN-LAST:event_miListarAssociacaoActionPerformed

    private void miAdicionarFazendeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAdicionarFazendeiroActionPerformed
        AdicionarFazendeiroView rav = new AdicionarFazendeiroView(this);

        rav.setVisible(true);
    }//GEN-LAST:event_miAdicionarFazendeiroActionPerformed

    private void miRemoverFazendeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoverFazendeiroActionPerformed
        RemoverFazendeiroView rfv = new RemoverFazendeiroView(this);
        
        rfv.setVisible(true);
    }//GEN-LAST:event_miRemoverFazendeiroActionPerformed

    private void miAdicionarMensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAdicionarMensalidadeActionPerformed
        AdicionarMensalidadeView amv = new AdicionarMensalidadeView(this);
        
        amv.setVisible(true);
    }//GEN-LAST:event_miAdicionarMensalidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar mbAssociacao;
    private javax.swing.JMenuItem miAdicionarFazendeiro;
    private javax.swing.JMenuItem miAdicionarMensalidade;
    private javax.swing.JMenuItem miCadastroAssociacao;
    private javax.swing.JMenuItem miListarAssociacao;
    private javax.swing.JMenuItem miRemoverFazendeiro;
    private javax.swing.JMenu mnAdicionarMensalidade;
    private javax.swing.JMenu mnAssoc2;
    private javax.swing.JMenu mnAssoc3;
    private javax.swing.JMenu mnAssociacao;
    private javax.swing.JMenu mnRemoverFazendeiro;
    private javax.swing.JPanel pnAssociacao;
    // End of variables declaration//GEN-END:variables
}
