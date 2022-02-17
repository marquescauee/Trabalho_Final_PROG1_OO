package models;

import java.util.ArrayList;

public class Associacao {
	private String nome;
	private ArrayList<Fazendeiro> listaFazendeiros;
                 private ArrayList<Mensalidade> listaMensalidades;
        
	public Associacao(String nome) {
                          this.nome = nome;
                          this.listaFazendeiros = new ArrayList<>();
                          this.listaMensalidades = new ArrayList<>();
	}
	
                 public void addMensalidade(Mensalidade mensalidade) {
                          this.listaMensalidades.add(mensalidade);
                 }
        
	public void addFazendeiro(Fazendeiro fazendeiro) {
                          this.listaFazendeiros.add(fazendeiro);
	}

	public boolean removeFazendeiro(int rg) {
                          for(Fazendeiro f : this.listaFazendeiros) {
		if(f.getRg() == rg) {
                                           this.listaFazendeiros.remove(f);
                                           return true;
		}
                          }
                          return false;
	}
        
                 public ArrayList<Fazendeiro> getListaFazendeiros() {
                          return this.listaFazendeiros;
                 }
                 
                 public ArrayList<Mensalidade> getListaMensalidades() {
                          return this.listaMensalidades;
                 }
	
	public String getNome() {
                          return this.nome;
	}
	
	public String toString() {
                          return "Nome da associação: " + this.nome;
	}
}
