/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.ingrediente;

import models.Ingrediente;
import views.StartView;
import java.time.LocalDate;

public class IngredienteView extends javax.swing.JFrame {

    private StartView strtView;
    
    public IngredienteView(StartView strtView) {
        this.strtView = strtView;
        initComponents();
    }
    
    public StartView getStrtView() {
        return this.strtView;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnIngrediente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnIngrediente = new javax.swing.JMenu();
        miIngrediente = new javax.swing.JMenuItem();
        mnListarIngrediente = new javax.swing.JMenu();
        miListaIngrediente = new javax.swing.JMenuItem();
        mnEditar = new javax.swing.JMenu();
        miEditar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingrediente");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnIngrediente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        String userName = System.getProperty("user.name");
        jLabel3.setText("Usuário: " + userName);
        pnIngrediente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        LocalDate currentdate = LocalDate.now();
        jLabel2.setText("Data: " +currentdate.getDayOfMonth() +"/" + currentdate.getMonthValue() +"/" + currentdate.getYear());
        pnIngrediente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Logo.png"))); // NOI18N
        jLabel1.setToolTipText("");
        pnIngrediente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        getContentPane().add(pnIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 360));

        mnIngrediente.setText("Cadastrar");

        miIngrediente.setText("Novo Ingrediente");
        miIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIngredienteActionPerformed(evt);
            }
        });
        mnIngrediente.add(miIngrediente);

        jMenuBar1.add(mnIngrediente);

        mnListarIngrediente.setText("Listar");

        miListaIngrediente.setText("Listar Ingredientes");
        miListaIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListaIngredienteActionPerformed(evt);
            }
        });
        mnListarIngrediente.add(miListaIngrediente);

        jMenuBar1.add(mnListarIngrediente);

        mnEditar.setText("Editar");

        miEditar.setText("Editar Ingrediente");
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

    private void miIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIngredienteActionPerformed
        CadastrarIngredienteView civ = new CadastrarIngredienteView(this);
        
        civ.setVisible(true);
    }//GEN-LAST:event_miIngredienteActionPerformed

    private void miListaIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListaIngredienteActionPerformed
        ListarIngredienteView liv = new ListarIngredienteView(this);
        
        liv.setVisible(true);
    }//GEN-LAST:event_miListaIngredienteActionPerformed

    private void miEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarActionPerformed
        EditarIngredienteView eiv = new EditarIngredienteView(this);
        
        eiv.setVisible(true);
    }//GEN-LAST:event_miEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miEditar;
    private javax.swing.JMenuItem miIngrediente;
    private javax.swing.JMenuItem miListaIngrediente;
    private javax.swing.JMenu mnEditar;
    private javax.swing.JMenu mnIngrediente;
    private javax.swing.JMenu mnListarIngrediente;
    private javax.swing.JPanel pnIngrediente;
    // End of variables declaration//GEN-END:variables
}
