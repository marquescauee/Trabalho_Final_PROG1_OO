/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.veterinario;

import views.StartView;
import java.time.LocalDate;

public class VeterinarioView extends javax.swing.JFrame {

    private StartView strtView;

    public VeterinarioView(StartView strtView) {
        this.strtView = strtView;
        initComponents();
    }
    
    public StartView getStartView() {
        return this.strtView;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastrar = new javax.swing.JMenu();
        miCadastrar = new javax.swing.JMenuItem();
        mnCalcular = new javax.swing.JMenu();
        miCalcular = new javax.swing.JMenuItem();
        mnListar = new javax.swing.JMenu();
        miListar = new javax.swing.JMenuItem();
        mnEditar = new javax.swing.JMenu();
        miEditar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Veterinário");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        String userName = System.getProperty("user.name");
        jLabel3.setText("Usuário: " + userName);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        LocalDate currentdate = LocalDate.now();
        jLabel2.setText("Data: " +currentdate.getDayOfMonth() +"/" + currentdate.getMonthValue() +"/" + currentdate.getYear());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        mnCadastrar.setText("Cadastrar");
        mnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarActionPerformed(evt);
            }
        });

        miCadastrar.setText("Novo Veterinário");
        miCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarActionPerformed(evt);
            }
        });
        mnCadastrar.add(miCadastrar);

        jMenuBar1.add(mnCadastrar);

        mnCalcular.setText("Calcular");
        mnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCalcularActionPerformed(evt);
            }
        });

        miCalcular.setText("Eliminação de metano");
        miCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCalcularActionPerformed(evt);
            }
        });
        mnCalcular.add(miCalcular);

        jMenuBar1.add(mnCalcular);

        mnListar.setText("Listar");

        miListar.setText("Listar Veterinários");
        miListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarActionPerformed(evt);
            }
        });
        mnListar.add(miListar);

        jMenuBar1.add(mnListar);

        mnEditar.setText("Editar");

        miEditar.setText("Editar veterinário");
        miEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarActionPerformed(evt);
            }
        });
        mnEditar.add(miEditar);

        jMenuBar1.add(mnEditar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarActionPerformed
    }//GEN-LAST:event_mnCadastrarActionPerformed

    private void mnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCalcularActionPerformed
    }//GEN-LAST:event_mnCalcularActionPerformed

    private void miCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarActionPerformed
        CadastrarVeterinarioView cvv = new CadastrarVeterinarioView(this);
        
        cvv.setVisible(true);
    }//GEN-LAST:event_miCadastrarActionPerformed

    private void miCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCalcularActionPerformed
        CalcularMetanoView cmv = new CalcularMetanoView(this);
        
        cmv.setVisible(true);
    }//GEN-LAST:event_miCalcularActionPerformed

    private void miEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarActionPerformed
        EditarVeterinarioView evv = new EditarVeterinarioView(this);
        
        evv.setVisible(true);
    }//GEN-LAST:event_miEditarActionPerformed

    private void miListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarActionPerformed
        ListarVeterinarioView lvv = new ListarVeterinarioView(this);
        
        lvv.setVisible(true);
    }//GEN-LAST:event_miListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem miCadastrar;
    private javax.swing.JMenuItem miCalcular;
    private javax.swing.JMenuItem miEditar;
    private javax.swing.JMenuItem miListar;
    private javax.swing.JMenu mnCadastrar;
    private javax.swing.JMenu mnCalcular;
    private javax.swing.JMenu mnEditar;
    private javax.swing.JMenu mnListar;
    // End of variables declaration//GEN-END:variables
}
