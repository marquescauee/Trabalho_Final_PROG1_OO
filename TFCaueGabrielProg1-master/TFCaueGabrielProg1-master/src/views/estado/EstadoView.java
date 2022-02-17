/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.estado;

import views.StartView;
import java.time.LocalDate;

public class EstadoView extends javax.swing.JFrame {
    
     private StartView strtView;

    public EstadoView(StartView strtView) {
        this.strtView = strtView;
        initComponents();
    }
    
    public StartView getStartView() {
        return this.strtView;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpEstado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mbEstado = new javax.swing.JMenuBar();
        mnEstado1 = new javax.swing.JMenu();
        miCadastroEstado = new javax.swing.JMenuItem();
        mnEstado2 = new javax.swing.JMenu();
        miListarEstados = new javax.swing.JMenuItem();
        mnAdd = new javax.swing.JMenu();
        miAdd = new javax.swing.JMenuItem();
        mnRemover = new javax.swing.JMenu();
        miRemover = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estado");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpEstado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        String userName = System.getProperty("user.name");
        jLabel3.setText("Usuário: " + userName);
        jpEstado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        LocalDate currentdate = LocalDate.now();
        jLabel2.setText("Data: " +currentdate.getDayOfMonth() +"/" + currentdate.getMonthValue() +"/" + currentdate.getYear());
        jpEstado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Logo.png"))); // NOI18N
        jpEstado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 350));

        getContentPane().add(jpEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mnEstado1.setText("Cadastrar");

        miCadastroEstado.setText("Novo Estado");
        miCadastroEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroEstadoActionPerformed(evt);
            }
        });
        mnEstado1.add(miCadastroEstado);

        mbEstado.add(mnEstado1);

        mnEstado2.setText("Listar");

        miListarEstados.setText("Estados");
        miListarEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarEstadosActionPerformed(evt);
            }
        });
        mnEstado2.add(miListarEstados);

        mbEstado.add(mnEstado2);

        mnAdd.setText("Adicionar Associação");

        miAdd.setText("Adicionar");
        miAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddActionPerformed(evt);
            }
        });
        mnAdd.add(miAdd);

        mbEstado.add(mnAdd);

        mnRemover.setText("Remover Associação");

        miRemover.setText("Remover");
        miRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoverActionPerformed(evt);
            }
        });
        mnRemover.add(miRemover);

        mbEstado.add(mnRemover);

        setJMenuBar(mbEstado);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastroEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroEstadoActionPerformed
        //Criar view de cadastro
        CadastrarEstadoView cev = new CadastrarEstadoView(this);
        
        cev.setVisible(true);
    }//GEN-LAST:event_miCadastroEstadoActionPerformed

    private void miListarEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarEstadosActionPerformed
        ListaEstadosView lev = new ListaEstadosView(this);
        
        lev.setVisible(true);
    }//GEN-LAST:event_miListarEstadosActionPerformed

    private void miRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoverActionPerformed
        RemoverAssociacaoView rav = new RemoverAssociacaoView(this);
        
        rav.setVisible(true);
    }//GEN-LAST:event_miRemoverActionPerformed

    private void miAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddActionPerformed

        AdicionarAssociacaoView aav = new AdicionarAssociacaoView(this);
        
        aav.setVisible(true);
    }//GEN-LAST:event_miAddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpEstado;
    private javax.swing.JMenuBar mbEstado;
    private javax.swing.JMenuItem miAdd;
    private javax.swing.JMenuItem miCadastroEstado;
    private javax.swing.JMenuItem miListarEstados;
    private javax.swing.JMenuItem miRemover;
    private javax.swing.JMenu mnAdd;
    private javax.swing.JMenu mnEstado1;
    private javax.swing.JMenu mnEstado2;
    private javax.swing.JMenu mnRemover;
    // End of variables declaration//GEN-END:variables
}
