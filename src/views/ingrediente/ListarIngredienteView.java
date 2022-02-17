/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.ingrediente;

import models.Ingrediente;

public class ListarIngredienteView extends javax.swing.JFrame {

    private IngredienteView ingView;
 
    public ListarIngredienteView(IngredienteView ingView) {
        this.ingView = ingView;
        initComponents();
        
        for(Ingrediente ing : this.ingView.getStrtView().getIngredientes()) {
            taIngrediente.append(ing.valorNutricional() + "\n" + "--------------------------------" + "\n");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JScrollPanel = new javax.swing.JScrollPane();
        taIngrediente = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Ingredientes");

        taIngrediente.setColumns(20);
        taIngrediente.setRows(5);
        JScrollPanel.setViewportView(taIngrediente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPanel;
    private javax.swing.JTextArea taIngrediente;
    // End of variables declaration//GEN-END:variables
}
