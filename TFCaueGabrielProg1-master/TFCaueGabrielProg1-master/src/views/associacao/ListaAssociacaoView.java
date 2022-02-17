/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.associacao;

import models.Associacao;
import models.Fazendeiro;
import models.Mensalidade;

public class ListaAssociacaoView extends javax.swing.JFrame {

    private AssociacaoView ascView;
    
    public ListaAssociacaoView(AssociacaoView ascView) {
        this.ascView = ascView;
        initComponents();
          for(Associacao asc : this.ascView.getStartView().getAssociacoes()) {
            taAssociacoes.append(asc.toString() + "\n");
            
            for(Mensalidade m : asc.getListaMensalidades()) {
                taAssociacoes.append(m.toString() + "\n");
            }
            for(Fazendeiro a : asc.getListaFazendeiros()) {
                taAssociacoes.append(a.toString());
            }
            
            taAssociacoes.append("\n");
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taAssociacoes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Associações");

        taAssociacoes.setColumns(20);
        taAssociacoes.setRows(5);
        jScrollPane1.setViewportView(taAssociacoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taAssociacoes;
    // End of variables declaration//GEN-END:variables
}
