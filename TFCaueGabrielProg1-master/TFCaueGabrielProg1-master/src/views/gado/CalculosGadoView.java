/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.gado;

import javax.swing.JOptionPane;
import models.Gado;
import models.Refeicao;

public class CalculosGadoView extends javax.swing.JFrame {

    private GadoView gdView;

    public CalculosGadoView(GadoView gdView) {
        this.gdView = gdView;
        initComponents();
        
        for(Gado gado : this.gdView.getStartView().getGados()) {
            cbGado.addItem(gado);
        }
        
        for(Refeicao ref : this.gdView.getStartView().getRefeicoes()) {
            cbRefeicao.addItem(ref);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbGado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btCalcular = new java.awt.Button();
        btConsumir = new java.awt.Button();
        cbRefeicao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cálculo de Arroba e Consumir Refeição");

        jLabel1.setText("Selecione o gado:");

        btCalcular.setLabel("Calcular Arroba");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        btConsumir.setLabel("Consumir Refeição");
        btConsumir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsumirActionPerformed(evt);
            }
        });

        cbRefeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRefeicaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione a refeição:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btConsumir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbGado, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbGado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsumir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        for(Gado gado : this.gdView.getStartView().getGados()) {
            if(gado.toString().equalsIgnoreCase(cbGado.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(null, gado.calcularArrobas());
            }
        }
    }//GEN-LAST:event_btCalcularActionPerformed

    private void btConsumirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsumirActionPerformed
         for(Gado gado : this.gdView.getStartView().getGados()) {
            if(gado.toString().equalsIgnoreCase(cbGado.getSelectedItem().toString())) {
                 JOptionPane.showMessageDialog(null, gado.consumirRefeicao((Refeicao) cbRefeicao.getSelectedItem()));
            }
        }
    }//GEN-LAST:event_btConsumirActionPerformed

    private void cbRefeicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRefeicaoActionPerformed
        
    }//GEN-LAST:event_cbRefeicaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btCalcular;
    private java.awt.Button btConsumir;
    private javax.swing.JComboBox<Gado> cbGado;
    private javax.swing.JComboBox<Refeicao> cbRefeicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
