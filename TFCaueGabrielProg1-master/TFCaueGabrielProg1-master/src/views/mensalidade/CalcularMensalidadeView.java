/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.mensalidade;

import javax.swing.JOptionPane;
import models.Fazendeiro;
import models.Mensalidade;

public class CalcularMensalidadeView extends javax.swing.JFrame {

    private MensalidadeView mv;

    public CalcularMensalidadeView(MensalidadeView mv) {
        this.mv = mv;
        initComponents();
        
        for(Fazendeiro fazendeiro : this.mv.getStartView().getFazendeiros()) {
            cbFazendeiro.addItem(fazendeiro);
        }
        
        for(Mensalidade mens : this.mv.getStartView().getMensalidade()) {
            cbMensalidade.addItem(mens);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbFazendeiro = new javax.swing.JComboBox<>();
        btCalcular = new java.awt.Button();
        cbMensalidade = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calcular Mensalidade");

        jLabel1.setText("Selecione o Fazendeiro:");

        cbFazendeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFazendeiroActionPerformed(evt);
            }
        });

        btCalcular.setLabel("Calcular Mensalidade");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        cbMensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMensalidadeActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione a Mensalidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFazendeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbFazendeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFazendeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFazendeiroActionPerformed
    }//GEN-LAST:event_cbFazendeiroActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        for(Mensalidade mens : this.mv.getStartView().getMensalidade()) {
            if(mens.toString().equalsIgnoreCase(cbMensalidade.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(null, mens.calcularMensalidade((Fazendeiro) cbFazendeiro.getSelectedItem()));
            }
        } 
    }//GEN-LAST:event_btCalcularActionPerformed

    private void cbMensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMensalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMensalidadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btCalcular;
    private javax.swing.JComboBox<Fazendeiro> cbFazendeiro;
    private javax.swing.JComboBox<Mensalidade> cbMensalidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
