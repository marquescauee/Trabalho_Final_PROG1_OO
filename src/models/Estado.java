package models;

import java.util.ArrayList;

public class Estado {

	private String nome;
	private int codigoFederal;
	private ArrayList<Associacao> listaAssociacoes;
	
	public Estado(String nome, int codigoFederal) {
                          this.nome = nome;
                          this.codigoFederal = codigoFederal;
                          this.listaAssociacoes = new ArrayList<>();
	}

	public void addAssociacao(Associacao associacao) {
                          this.listaAssociacoes.add(associacao);
	}
	
	public void removeAssociacao(String nome) {
                          for(Associacao a : this.listaAssociacoes) {
		if(a.getNome().equals(nome)) {
                                           this.listaAssociacoes.remove(a);	
		}
                          }	
	}
        
                 public ArrayList<Associacao> getListaAssociacoes() {
                          return this.listaAssociacoes;
                 }
	
	public String getNome() {
                          return this.nome;
	}

	public int getCodigoFederal() {
                          return this.codigoFederal;
	}
	
	public String toString() {
                          return this.nome + "  -  " + this.codigoFederal;
	}
	
}
