/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.estado;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Associacao;
import models.Estado;


public class AdicionarAssociacaoView extends javax.swing.JFrame {

    private EstadoView estView;
  
    public AdicionarAssociacaoView(EstadoView estView) {
        this.estView = estView;
        initComponents();
        for(Estado est : this.estView.getStartView().getEstados()) {
            cbEstado.addItem(est);
        }
        
        for(Associacao asc : this.estView.getStartView().getAssociacoes()) {
            cbNome.addItem(asc);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btAdd = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        cbNome = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Associação");

        jLabel1.setText("Associação");

        btAdd.setLabel("Adicionar");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        jLabel2.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNome, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 398, Short.MAX_VALUE)
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed

      ArrayList<Estado> tempEstados = this.estView.getStartView().getEstados();;
      Associacao tempAsc = cbNome.getItemAt(cbNome.getSelectedIndex()); 
      
     for(Estado e : tempEstados) {
          if(e.toString().equalsIgnoreCase(cbEstado.getItemAt(cbEstado.getSelectedIndex()).toString())) {
              e.addAssociacao(tempAsc);
              
              JOptionPane.showMessageDialog(null, "Sucesso!");
              
              this.dispose();
          }
       }
    }//GEN-LAST:event_btAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btAdd;
    private javax.swing.JComboBox<Estado> cbEstado;
    private javax.swing.JComboBox<Associacao> cbNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
