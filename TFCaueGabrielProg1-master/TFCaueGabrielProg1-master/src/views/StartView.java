/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.util.ArrayList;
import models.Associacao;
import models.Estado;
import models.Fazenda;
import models.Fazendeiro;
import models.Gado;
import models.Ingrediente;
import models.Mensalidade;
import models.Refeicao;
import models.Veterinario;
import models.ingredientes.CarocoAlgodao;
import models.ingredientes.FareloSoja;
import models.ingredientes.Milho;
import models.ingredientes.Sorgo;
import models.mensalidades.Anual;
import models.mensalidades.Semestral;
import views.associacao.AssociacaoView;
import views.gado.GadoView;
import views.ingrediente.IngredienteView;
import views.refeicao.RefeicaoView;
import views.estado.EstadoView;
import views.fazenda.FazendaView;
import views.fazendeiro.FazendeiroView;
import views.mensalidade.MensalidadeView;
import views.veterinario.VeterinarioView;
import java.time.LocalDate;

/**
 *
 * @author cauel
 */
public class StartView extends javax.swing.JFrame {
    private ArrayList<Estado> listaEstados;
    private ArrayList<Associacao> listaAssociacoes;
    private ArrayList<Fazendeiro> listaFazendeiros;
    private ArrayList<Fazenda> listaFazendas;
    private ArrayList<Gado> listaGados;
    private ArrayList<Ingrediente> listaIngredientes;
    private ArrayList<Refeicao> listaRefeicoes;
    private ArrayList<Veterinario> listaVeterinarios;
    private ArrayList<Mensalidade> listaMensalidades;
    /**
     * Creates new form StartView
     */
    public StartView() {
        this.listaAssociacoes = new ArrayList<>();
        this.listaEstados = new ArrayList<>();
        this.listaFazendeiros = new ArrayList<>();
        this.listaFazendas = new ArrayList<>();
        this.listaGados = new ArrayList<>();
        this.listaIngredientes = new ArrayList<>();
        this.listaRefeicoes = new ArrayList<>();
        this.listaVeterinarios = new ArrayList<>();
        this.listaMensalidades = new ArrayList<>();
        initComponents();
    }
    
    public ArrayList<Estado> getEstados() {
        return this.listaEstados;
    }
    
    public ArrayList<Associacao> getAssociacoes() {
        return this.listaAssociacoes;
    }
    
    public ArrayList<Fazendeiro> getFazendeiros() {
        return this.listaFazendeiros;
    }
    
    public ArrayList<Fazenda> getFazendas() {
        return this.listaFazendas;
    }
    
    public ArrayList<Gado> getGados() {
        return this.listaGados;
    }
    
    public ArrayList<Ingrediente> getIngredientes() {
        return this.listaIngredientes;
    }
    
    public ArrayList<Refeicao> getRefeicoes() {
        return this.listaRefeicoes;
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return this.listaVeterinarios;
    }
    
    public ArrayList<Mensalidade> getMensalidade() {
        return this.listaMensalidades;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmStart = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mbEntrar = new javax.swing.JMenuBar();
        mnEntrar = new javax.swing.JMenu();
        miEstado = new javax.swing.JMenuItem();
        miAssociacao = new javax.swing.JMenuItem();
        miFazenda = new javax.swing.JMenuItem();
        miFazendeiro = new javax.swing.JMenuItem();
        miGado = new javax.swing.JMenuItem();
        miRefeicao = new javax.swing.JMenuItem();
        miIngrediente = new javax.swing.JMenuItem();
        miMensalidade = new javax.swing.JMenuItem();
        miVeterinario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Início");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pmStart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        String userName = System.getProperty("user.name");
        jLabel1.setText("Seja bem-vindo: " + userName);
        pmStart.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        LocalDate currentdate = LocalDate.now();
        jLabel2.setText("Data: " +currentdate.getDayOfMonth() +"/" + currentdate.getMonthValue() +"/" + currentdate.getYear());
        pmStart.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel3.setText("Clique para sair");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        pmStart.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Logo.png"))); // NOI18N
        pmStart.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        getContentPane().add(pmStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        mbEntrar.setBackground(new java.awt.Color(232, 232, 232));

        mnEntrar.setBackground(new java.awt.Color(250, 189, 20));
        mnEntrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mnEntrar.setText("Entrar");
        mnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEntrarActionPerformed(evt);
            }
        });

        miEstado.setText("Estado");
        miEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEstadoActionPerformed(evt);
            }
        });
        mnEntrar.add(miEstado);

        miAssociacao.setText("Associação");
        miAssociacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAssociacaoActionPerformed(evt);
            }
        });
        mnEntrar.add(miAssociacao);

        miFazenda.setText("Fazendeiro");
        miFazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFazendaActionPerformed(evt);
            }
        });
        mnEntrar.add(miFazenda);

        miFazendeiro.setText("Fazenda");
        miFazendeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFazendeiroActionPerformed(evt);
            }
        });
        mnEntrar.add(miFazendeiro);

        miGado.setText("Gado");
        miGado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGadoActionPerformed(evt);
            }
        });
        mnEntrar.add(miGado);

        miRefeicao.setText("Refeição");
        miRefeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRefeicaoActionPerformed(evt);
            }
        });
        mnEntrar.add(miRefeicao);

        miIngrediente.setText("Ingrediente");
        miIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIngredienteActionPerformed(evt);
            }
        });
        mnEntrar.add(miIngrediente);

        miMensalidade.setText("Mensalidade");
        miMensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMensalidadeActionPerformed(evt);
            }
        });
        mnEntrar.add(miMensalidade);

        miVeterinario.setText("Veterinário");
        miVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVeterinarioActionPerformed(evt);
            }
        });
        mnEntrar.add(miVeterinario);

        mbEntrar.add(mnEntrar);

        setJMenuBar(mbEntrar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEstadoActionPerformed
        //Criar view
            EstadoView ev = new EstadoView(this);
        
        //Exibir view
            ev.setVisible(true);
    }//GEN-LAST:event_miEstadoActionPerformed

    private void miAssociacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAssociacaoActionPerformed
        AssociacaoView ascView = new AssociacaoView(this);
        ascView.setVisible(true);
    }//GEN-LAST:event_miAssociacaoActionPerformed

    private void miFazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFazendaActionPerformed
        FazendeiroView fv = new FazendeiroView(this);
        
        fv.setVisible(true);
    }//GEN-LAST:event_miFazendaActionPerformed

    private void miFazendeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFazendeiroActionPerformed
        FazendaView fazv = new FazendaView(this);
        
        fazv.setVisible(true);
    }//GEN-LAST:event_miFazendeiroActionPerformed

    private void miGadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGadoActionPerformed
        GadoView gv = new GadoView(this);
        
        gv.setVisible(true);
    }//GEN-LAST:event_miGadoActionPerformed

    private void mnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEntrarActionPerformed
    }//GEN-LAST:event_mnEntrarActionPerformed

    private void miIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIngredienteActionPerformed
        IngredienteView iv = new IngredienteView(this);
        
        iv.setVisible(true);
    }//GEN-LAST:event_miIngredienteActionPerformed

    private void miRefeicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRefeicaoActionPerformed
        RefeicaoView rv = new RefeicaoView(this);
        
        rv.setVisible(true);
    }//GEN-LAST:event_miRefeicaoActionPerformed

    private void miMensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMensalidadeActionPerformed
        MensalidadeView mv = new MensalidadeView(this);
        
        mv.setVisible(true);
    }//GEN-LAST:event_miMensalidadeActionPerformed

    private void miVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVeterinarioActionPerformed
        VeterinarioView vv = new VeterinarioView(this);
        
        vv.setVisible(true);
    }//GEN-LAST:event_miVeterinarioActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        StartView strt = new StartView();
        
        Estado e1 = new Estado("SC", 48);
        Estado e2 = new Estado("ES", 98);
        
        strt.listaEstados.add(e1);
        strt.listaEstados.add(e2);
        
        Associacao a1 = new Associacao("Associação dos Fazendeiros do Sul");
        Associacao a2 = new Associacao("Associação dos Fazendeiro do Norte");
        Associacao a3 = new Associacao("Associação dos Fazendeiro de Florianópolis");
        
        strt.listaAssociacoes.add(a1);
        strt.listaAssociacoes.add(a2);
        strt.listaAssociacoes.add(a3);
        
        Fazenda f1 = new Fazenda();
        f1.setNome("Fazenda Amaral");
        f1.setArea(25000);
        f1.setCodigoFazenda(11);
        
        Fazenda f2 = new Fazenda();
        f2.setNome("Fazenda Barbosa");
        f2.setArea(1200);
        f2.setCodigoFazenda(12);
        
        Fazenda f3 = new Fazenda();
        f3.setNome("Fazenda Lopes");
        f3.setArea(5000);
        f3.setCodigoFazenda(13);
        
        Fazenda f4 = new Fazenda();
        f4.setNome("Fazenda Lima");
        f4.setArea(10000);
        f4.setCodigoFazenda(13);
        
        strt.listaFazendas.add(f1);
        strt.listaFazendas.add(f2);
        strt.listaFazendas.add(f3);
        strt.listaFazendas.add(f4);
        
        Fazendeiro faz1 = new Fazendeiro("Jonas", 1234567);
        Fazendeiro faz2 = new Fazendeiro("Pedro", 4567890);
        
        strt.listaFazendeiros.add(faz1);
        strt.listaFazendeiros.add(faz2);
        
        Gado g1 = new Gado(123, 12000, 14, 560);
        Gado g2 = new Gado(234, 16000, 20, 600);
        Gado g3 = new Gado(657, 20000, 24, 460);
        Gado g4 = new Gado(908, 4000, 10, 380);
        
        strt.listaGados.add(g1);
        strt.listaGados.add(g2);
        strt.listaGados.add(g3);
        strt.listaGados.add(g4);
        
        Veterinario vet1 = new Veterinario();
        vet1.setNome("Matias");
        vet1.setRegistro(2546141);
        
        strt.listaVeterinarios.add(vet1);
        
        Ingrediente ing1 = new Milho();
        ing1.setNome("Milho");
        ing1.setCaloriasIngrediente(3.7);
        ing1.setGramas(200);
        Ingrediente ing2 = new Sorgo();
        ing2.setNome("Sorgo");
        ing2.setCaloriasIngrediente(4);
        ing2.setGramas(500);
        Ingrediente ing3 = new FareloSoja();
        ing3.setNome("Farelo de Soja");
        ing3.setCaloriasIngrediente(3.8);
        ing3.setGramas(800);
        
        Ingrediente ing4 = new CarocoAlgodao();
        ing4.setNome("Caroço de algodão");
        ing4.setCaloriasIngrediente(5);
        ing4.setGramas(300);
        
        strt.listaIngredientes.add(ing1);
        strt.listaIngredientes.add(ing2);
        strt.listaIngredientes.add(ing3);
        strt.listaIngredientes.add(ing4);

        
        Mensalidade m1 = new Semestral();
        Mensalidade m2 = new Anual();
        
        strt.listaMensalidades.add(m1);
        strt.listaMensalidades.add(m2);
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                strt.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar mbEntrar;
    private javax.swing.JMenuItem miAssociacao;
    private javax.swing.JMenuItem miEstado;
    private javax.swing.JMenuItem miFazenda;
    private javax.swing.JMenuItem miFazendeiro;
    private javax.swing.JMenuItem miGado;
    private javax.swing.JMenuItem miIngrediente;
    private javax.swing.JMenuItem miMensalidade;
    private javax.swing.JMenuItem miRefeicao;
    private javax.swing.JMenuItem miVeterinario;
    private javax.swing.JMenu mnEntrar;
    private javax.swing.JPanel pmStart;
    // End of variables declaration//GEN-END:variables
}