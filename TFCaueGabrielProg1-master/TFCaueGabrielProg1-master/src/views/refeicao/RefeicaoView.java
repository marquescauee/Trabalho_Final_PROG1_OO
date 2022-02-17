/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.refeicao;

import javax.swing.JOptionPane;
import models.Ingrediente;
import models.Refeicao;
import views.StartView;

public class RefeicaoView extends javax.swing.JFrame {

    private StartView strtView;
 
    public RefeicaoView(StartView strtView) {
        this.strtView = strtView;
        initComponents();
        
        cbIng1.addItem(null);
        cbIng2.addItem(null);
        
        for(Ingrediente ing : this.strtView.getIngredientes()) {
            cbIng1.addItem(ing);
        }
        
        for(Ingrediente ing : this.strtView.getIngredientes()) {
            cbIng2.addItem(ing);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbIng1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbIng2 = new javax.swing.JComboBox<>();
        btPreparar = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Refeição");
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrediente 1:");

        jLabel2.setText("Ingrediente 2:");

        btPreparar.setLabel("Preparar Refeição");
        btPreparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrepararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btPreparar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbIng1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbIng2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbIng1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbIng2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPreparar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPrepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrepararActionPerformed
        
        if(cbIng1.getSelectedItem() == null && cbIng2.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione pelo menos 1 ingrediente.");
        } else if (cbIng1.getSelectedItem() == null && cbIng2.getSelectedItem() != null) {
            Refeicao ref = new Refeicao();
            for(Ingrediente ing : this.strtView.getIngredientes()) {
                if(cbIng1.getSelectedItem() != null && ing.toString().equalsIgnoreCase(cbIng1.getSelectedItem().toString())) {
                    ref.addIngrediente(ing);
                }
                if(cbIng2.getSelectedItem() != null && ing.toString().equalsIgnoreCase(cbIng2.getSelectedItem().toString())) {
                    ref.addIngrediente(ing);
                }
            }
            JOptionPane.showMessageDialog(null, ref.prepararRefeicao((Ingrediente) cbIng2.getSelectedItem()));
            this.strtView.getRefeicoes().add(ref);
        } else if (cbIng1.getSelectedItem() != null && cbIng2.getSelectedItem() == null) {
            Refeicao ref = new Refeicao();
            for(Ingrediente ing : this.strtView.getIngredientes()) {
                if(cbIng1.getSelectedItem() != null && ing.toString().equalsIgnoreCase(cbIng1.getSelectedItem().toString())) {
                    ref.addIngrediente(ing);
                }
                if(cbIng2.getSelectedItem() != null && ing.toString().equalsIgnoreCase(cbIng2.getSelectedItem().toString())) {
                    ref.addIngrediente(ing);
                }
            }
            JOptionPane.showMessageDialog(null, ref.prepararRefeicao((Ingrediente) cbIng1.getSelectedItem()));
            this.strtView.getRefeicoes().add(ref);
        } else {
            Refeicao ref = new Refeicao();
            for(Ingrediente ing : this.strtView.getIngredientes()) {
                if(cbIng1.getSelectedItem() != null && ing.toString().equalsIgnoreCase(cbIng1.getSelectedItem().toString())) {
                    ref.addIngrediente(ing);
                }
                if(cbIng2.getSelectedItem() != null && ing.toString().equalsIgnoreCase(cbIng2.getSelectedItem().toString())) {
                    ref.addIngrediente(ing);
                }
            }
            JOptionPane.showMessageDialog(null , ref.prepararRefeicao((Ingrediente) cbIng1.getSelectedItem(), (Ingrediente) cbIng2.getSelectedItem()));
            this.strtView.getRefeicoes().add(ref);
        }
    }//GEN-LAST:event_btPrepararActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btPreparar;
    private javax.swing.JComboBox<Ingrediente> cbIng1;
    private javax.swing.JComboBox<Ingrediente> cbIng2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
