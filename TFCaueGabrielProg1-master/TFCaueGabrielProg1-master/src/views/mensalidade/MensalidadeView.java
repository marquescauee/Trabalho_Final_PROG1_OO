/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.mensalidade;

import views.StartView;
import java.time.LocalDate;

public class MensalidadeView extends javax.swing.JFrame {

    private StartView strtView;

    public MensalidadeView(StartView strtView) {
        this.strtView = strtView;
        initComponents();
    }

    public StartView getStartView() {
        return this.strtView;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMensalidade = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastrar = new javax.swing.JMenu();
        miCadastrar = new javax.swing.JMenuItem();
        mnCalcular = new javax.swing.JMenu();
        miCalcular = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mensalidade");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMensalidade.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        String userName = System.getProperty("user.name");
        jLabel3.setText("Usuário: " + userName);
        pnMensalidade.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        LocalDate currentdate = LocalDate.now();
        jLabel2.setText("Data: " +currentdate.getDayOfMonth() +"/" + currentdate.getMonthValue() +"/" + currentdate.getYear());
        pnMensalidade.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Logo.png"))); // NOI18N
        jLabel1.setToolTipText("");
        pnMensalidade.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(pnMensalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 360));

        mnCadastrar.setText("Cadastrar");

        miCadastrar.setText("Nova mensalidade");
        miCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarActionPerformed(evt);
            }
        });
        mnCadastrar.add(miCadastrar);

        jMenuBar1.add(mnCadastrar);

        mnCalcular.setText("Calcular");

        miCalcular.setText("Taxa");
        miCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCalcularActionPerformed(evt);
            }
        });
        mnCalcular.add(miCalcular);

        jMenuBar1.add(mnCalcular);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarActionPerformed
        CadastrarMensalidadeView cmv = new CadastrarMensalidadeView(this);
        
        cmv.setVisible(true);
    }//GEN-LAST:event_miCadastrarActionPerformed

    private void miCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCalcularActionPerformed
        CalcularMensalidadeView calcmv = new CalcularMensalidadeView(this);
        
        calcmv.setVisible(true);
    }//GEN-LAST:event_miCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miCadastrar;
    private javax.swing.JMenuItem miCalcular;
    private javax.swing.JMenu mnCadastrar;
    private javax.swing.JMenu mnCalcular;
    private javax.swing.JPanel pnMensalidade;
    // End of variables declaration//GEN-END:variables
}
