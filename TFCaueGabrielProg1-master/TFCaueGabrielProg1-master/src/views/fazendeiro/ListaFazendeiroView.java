/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.fazendeiro;

import models.Fazenda;
import models.Fazendeiro;
import models.Gado;

public class ListaFazendeiroView extends javax.swing.JFrame {

    private FazendeiroView fazView;

    public ListaFazendeiroView(FazendeiroView fazView) {
        this.fazView = fazView;
        initComponents();
        
          for(Fazendeiro faz : this.fazView.getStartView().getFazendeiros()) {
            taFazendeiro.append(faz.toString() + "\n");
            for(Fazenda fazenda : faz.getListaFazendas()) {
                taFazendeiro.append(fazenda.toString() + "\n");
            }
            
            for(Gado gado : faz.getListaGados()) {
                taFazendeiro.append(gado.toString() + "\n");
            }
            
            taFazendeiro.append("---------------------------" + "\n");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taFazendeiro = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Fazendeiros");

        taFazendeiro.setColumns(20);
        taFazendeiro.setRows(5);
        jScrollPane1.setViewportView(taFazendeiro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taFazendeiro;
    // End of variables declaration//GEN-END:variables
}
