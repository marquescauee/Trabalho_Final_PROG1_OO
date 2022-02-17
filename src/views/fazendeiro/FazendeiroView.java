/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.fazendeiro;

import views.StartView;
import java.time.LocalDate;

public class FazendeiroView extends javax.swing.JFrame {

    private StartView strtView;
   
    public FazendeiroView(StartView strtView) {
        this.strtView = strtView;
        initComponents();
    }
    
    public StartView getStartView() {
        return this.strtView;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        pnFazendeiro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mbAssociacao = new javax.swing.JMenuBar();
        mnFazendeiro = new javax.swing.JMenu();
        miCadastroFazendeiro = new javax.swing.JMenuItem();
        mnListarFazend = new javax.swing.JMenu();
        miListarFazendeiro = new javax.swing.JMenuItem();
        mnAdicionarFazend = new javax.swing.JMenu();
        miAdicionarFazenda = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        miAdicionarGado = new javax.swing.JMenuItem();
        mnValidarGados = new javax.swing.JMenu();
        miValidarGados = new javax.swing.JMenuItem();
        mnRemover = new javax.swing.JMenu();
        mnRemoverFazenda = new javax.swing.JMenuItem();
        mnRemoverGado = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fazendeiro");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnFazendeiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        String userName = System.getProperty("user.name");
        jLabel3.setText("Usuário: " + userName);
        pnFazendeiro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        LocalDate currentdate = LocalDate.now();
        jLabel2.setText("Data: " +currentdate.getDayOfMonth() +"/" + currentdate.getMonthValue() +"/" + currentdate.getYear());
        pnFazendeiro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Logo.png"))); // NOI18N
        pnFazendeiro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        getContentPane().add(pnFazendeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 350));

        mnFazendeiro.setText("Cadastrar");

        miCadastroFazendeiro.setText("Novo Fazendeiro");
        miCadastroFazendeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroFazendeiroActionPerformed(evt);
            }
        });
        mnFazendeiro.add(miCadastroFazendeiro);

        mbAssociacao.add(mnFazendeiro);

        mnListarFazend.setText("Listar");

        miListarFazendeiro.setText("Fazendeiros");
        miListarFazendeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarFazendeiroActionPerformed(evt);
            }
        });
        mnListarFazend.add(miListarFazendeiro);

        mbAssociacao.add(mnListarFazend);

        mnAdicionarFazend.setText("Adicionar Fazenda");

        miAdicionarFazenda.setText("Adicionar");
        miAdicionarFazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAdicionarFazendaActionPerformed(evt);
            }
        });
        mnAdicionarFazend.add(miAdicionarFazenda);

        mbAssociacao.add(mnAdicionarFazend);

        jMenu1.setText("Adicionar Gado");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        miAdicionarGado.setText("Adicionar");
        miAdicionarGado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAdicionarGadoActionPerformed(evt);
            }
        });
        jMenu1.add(miAdicionarGado);

        mbAssociacao.add(jMenu1);

        mnValidarGados.setText("Validar Quantidade de Gados");

        miValidarGados.setText("Validar");
        miValidarGados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miValidarGadosActionPerformed(evt);
            }
        });
        mnValidarGados.add(miValidarGados);

        mbAssociacao.add(mnValidarGados);

        mnRemover.setText("Remover");

        mnRemoverFazenda.setText("Fazenda");
        mnRemoverFazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRemoverFazendaActionPerformed(evt);
            }
        });
        mnRemover.add(mnRemoverFazenda);

        mnRemoverGado.setText("Gado");
        mnRemoverGado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRemoverGadoActionPerformed(evt);
            }
        });
        mnRemover.add(mnRemoverGado);

        mbAssociacao.add(mnRemover);

        setJMenuBar(mbAssociacao);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastroFazendeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroFazendeiroActionPerformed
        //Criar view de cadastro
        CadastrarFazendeiroView cev = new CadastrarFazendeiroView(this);

        cev.setVisible(true);
    }//GEN-LAST:event_miCadastroFazendeiroActionPerformed

    private void miListarFazendeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarFazendeiroActionPerformed
        ListaFazendeiroView lev = new ListaFazendeiroView(this);

        lev.setVisible(true);
    }//GEN-LAST:event_miListarFazendeiroActionPerformed

    private void miAdicionarFazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAdicionarFazendaActionPerformed
        AdicionarFazendaView rav = new AdicionarFazendaView(this);

        rav.setVisible(true);
    }//GEN-LAST:event_miAdicionarFazendaActionPerformed

    private void miValidarGadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miValidarGadosActionPerformed
        ValidarQuantidadeGadosView vqgv = new ValidarQuantidadeGadosView(this);
        
        vqgv.setVisible(true);
    }//GEN-LAST:event_miValidarGadosActionPerformed

    private void mnRemoverFazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRemoverFazendaActionPerformed
        RemoverFazendaView rfv = new RemoverFazendaView(this);
        
        
        rfv.setVisible(true);
    }//GEN-LAST:event_mnRemoverFazendaActionPerformed

    private void mnRemoverGadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRemoverGadoActionPerformed
        RemoverGadoView rgv = new RemoverGadoView(this);
        
        rgv.setVisible(true);
    }//GEN-LAST:event_mnRemoverGadoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
      
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void miAdicionarGadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAdicionarGadoActionPerformed
         AdicionarGadoView agv = new AdicionarGadoView(this);
        
         agv.setVisible(true);
    }//GEN-LAST:event_miAdicionarGadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar mbAssociacao;
    private javax.swing.JMenuItem miAdicionarFazenda;
    private javax.swing.JMenuItem miAdicionarGado;
    private javax.swing.JMenuItem miCadastroFazendeiro;
    private javax.swing.JMenuItem miListarFazendeiro;
    private javax.swing.JMenuItem miValidarGados;
    private javax.swing.JMenu mnAdicionarFazend;
    private javax.swing.JMenu mnFazendeiro;
    private javax.swing.JMenu mnListarFazend;
    private javax.swing.JMenu mnRemover;
    private javax.swing.JMenuItem mnRemoverFazenda;
    private javax.swing.JMenuItem mnRemoverGado;
    private javax.swing.JMenu mnValidarGados;
    private javax.swing.JPanel pnFazendeiro;
    // End of variables declaration//GEN-END:variables
}
