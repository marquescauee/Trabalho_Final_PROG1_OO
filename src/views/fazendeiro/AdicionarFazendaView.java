/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.fazendeiro;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Fazenda;
import models.Fazendeiro;

public class AdicionarFazendaView extends javax.swing.JFrame {

    private FazendeiroView fazView;
   
    public AdicionarFazendaView(FazendeiroView fazView) {
        this.fazView = fazView;
        initComponents();
        
        for(Fazendeiro fazendeiro : this.fazView.getStartView().getFazendeiros()) {
            cbFazendeiro.addItem(fazendeiro);
        }
        
         for(Fazenda fazenda : this.fazView.getStartView().getFazendas()) {
            cbFazenda.addItem(fazenda);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btAdd = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        cbFazendeiro = new javax.swing.JComboBox<>();
        cbFazenda = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Fazenda");

        jLabel1.setText("Fazenda:");

        btAdd.setLabel("Adicionar");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        jLabel2.setText("Fazendeiro:");

        cbFazendeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFazendeiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbFazenda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFazendeiro, 0, 484, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbFazenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbFazendeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed

        ArrayList<Fazendeiro> tempFazendeiros = this.fazView.getStartView().getFazendeiros();
        Fazenda tempFazenda = cbFazenda.getItemAt(cbFazenda.getSelectedIndex());

        for(Fazendeiro fazendeiro : tempFazendeiros) {
            if(fazendeiro.toString().equalsIgnoreCase(cbFazendeiro.getItemAt(cbFazendeiro.getSelectedIndex()).toString())) {
                fazendeiro.addFazenda(tempFazenda);

                JOptionPane.showMessageDialog(null, "Sucesso!");
            }
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void cbFazendeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFazendeiroActionPerformed
    }//GEN-LAST:event_cbFazendeiroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btAdd;
    private javax.swing.JComboBox<Fazenda> cbFazenda;
    private javax.swing.JComboBox<Fazendeiro> cbFazendeiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
