/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.gado;

import views.StartView;
import java.time.LocalDate;

public class GadoView extends javax.swing.JFrame {

    private StartView strtView;
 
    public GadoView(StartView strtView) {
        this.strtView = strtView;
        initComponents();
    }

    public StartView getStartView() {
            return this.strtView;
        }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnGado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastrar = new javax.swing.JMenu();
        miCadastrar = new javax.swing.JMenuItem();
        mnListar = new javax.swing.JMenu();
        miListar = new javax.swing.JMenuItem();
        mnCalculos = new javax.swing.JMenu();
        miCalculos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gado");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnGado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        String userName = System.getProperty("user.name");
        jLabel3.setText("Usuário: " + userName);
        pnGado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        LocalDate currentdate = LocalDate.now();
        jLabel2.setText("Data: " +currentdate.getDayOfMonth() +"/" + currentdate.getMonthValue() +"/" + currentdate.getYear());
        pnGado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Logo.png"))); // NOI18N
        pnGado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        getContentPane().add(pnGado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        mnCadastrar.setText("Cadastrar");

        miCadastrar.setText("Cadastrar Gado");
        miCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarActionPerformed(evt);
            }
        });
        mnCadastrar.add(miCadastrar);

        jMenuBar1.add(mnCadastrar);

        mnListar.setText("Listar");

        miListar.setText("Listar Gados");
        miListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarActionPerformed(evt);
            }
        });
        mnListar.add(miListar);

        jMenuBar1.add(mnListar);

        mnCalculos.setText("Cálculos");

        miCalculos.setText("Calcular");
        miCalculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCalculosActionPerformed(evt);
            }
        });
        mnCalculos.add(miCalculos);

        jMenuBar1.add(mnCalculos);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarActionPerformed
        CadastrarGadoView cgv = new CadastrarGadoView(this);
        
        cgv.setVisible(true);
    }//GEN-LAST:event_miCadastrarActionPerformed

    private void miListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarActionPerformed
        ListaGadoView lgv = new ListaGadoView(this);
        
        lgv.setVisible(true);
    }//GEN-LAST:event_miListarActionPerformed

    private void miCalculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCalculosActionPerformed
        CalculosGadoView cgv = new CalculosGadoView(this);
        
        cgv.setVisible(true);
        
    }//GEN-LAST:event_miCalculosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miCadastrar;
    private javax.swing.JMenuItem miCalculos;
    private javax.swing.JMenuItem miListar;
    private javax.swing.JMenu mnCadastrar;
    private javax.swing.JMenu mnCalculos;
    private javax.swing.JMenu mnListar;
    private javax.swing.JPanel pnGado;
    // End of variables declaration//GEN-END:variables
}
