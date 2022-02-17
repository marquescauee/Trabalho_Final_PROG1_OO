/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.fazenda;

import views.StartView;
import java.time.LocalDate;

public class FazendaView extends javax.swing.JFrame {

    private StartView strtView;

    public FazendaView(StartView strtView) {
        this.strtView = strtView;
        initComponents();
    }
    
    public StartView getStartView() {
        return this.strtView;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnFazenda = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mbAssociacao = new javax.swing.JMenuBar();
        mnFazendeiro = new javax.swing.JMenu();
        miCadastroFazenda = new javax.swing.JMenuItem();
        mnListarFazenda = new javax.swing.JMenu();
        miListarFazenda = new javax.swing.JMenuItem();
        mnEditarFazenda = new javax.swing.JMenu();
        miEditarFazenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fazenda");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnFazenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        String userName = System.getProperty("user.name");
        jLabel3.setText("Usuário: " + userName);
        pnFazenda.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        LocalDate currentdate = LocalDate.now();
        jLabel2.setText("Data: " +currentdate.getDayOfMonth() +"/" + currentdate.getMonthValue() +"/" + currentdate.getYear());
        pnFazenda.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Logo.png"))); // NOI18N
        pnFazenda.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(pnFazenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mnFazendeiro.setText("Cadastrar");

        miCadastroFazenda.setText("Nova Fazenda");
        miCadastroFazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroFazendaActionPerformed(evt);
            }
        });
        mnFazendeiro.add(miCadastroFazenda);

        mbAssociacao.add(mnFazendeiro);

        mnListarFazenda.setText("Listar");

        miListarFazenda.setText("Fazendas");
        miListarFazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarFazendaActionPerformed(evt);
            }
        });
        mnListarFazenda.add(miListarFazenda);

        mbAssociacao.add(mnListarFazenda);

        mnEditarFazenda.setText("Editar");

        miEditarFazenda.setText("Editar fazenda");
        miEditarFazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarFazendaActionPerformed(evt);
            }
        });
        mnEditarFazenda.add(miEditarFazenda);

        mbAssociacao.add(mnEditarFazenda);

        setJMenuBar(mbAssociacao);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastroFazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroFazendaActionPerformed
        //Criar view de cadastro
        CadastrarFazendaView cfv = new CadastrarFazendaView(this);

        cfv.setVisible(true);
    }//GEN-LAST:event_miCadastroFazendaActionPerformed

    private void miListarFazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarFazendaActionPerformed
        ListaFazendaView lfv = new ListaFazendaView(this);

        lfv.setVisible(true);
    }//GEN-LAST:event_miListarFazendaActionPerformed

    private void miEditarFazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarFazendaActionPerformed
        EditarFazendaView efv = new EditarFazendaView(this);
        
        efv.setVisible(true);
    }//GEN-LAST:event_miEditarFazendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar mbAssociacao;
    private javax.swing.JMenuItem miCadastroFazenda;
    private javax.swing.JMenuItem miEditarFazenda;
    private javax.swing.JMenuItem miListarFazenda;
    private javax.swing.JMenu mnEditarFazenda;
    private javax.swing.JMenu mnFazendeiro;
    private javax.swing.JMenu mnListarFazenda;
    private javax.swing.JPanel pnFazenda;
    // End of variables declaration//GEN-END:variables
}
