package models;

import java.util.ArrayList;

public class Fazendeiro {
	private String nome;
	private int rg;
	private int qtdGados;
	private ArrayList<Fazenda> listaFazendas;
	private ArrayList<Gado> listaGados;
	
	public Fazendeiro(String nome, int rg) {
                          this.nome = nome;
                          this.rg = rg;
                          this.listaFazendas = new ArrayList<>();
                          this.listaGados = new ArrayList<>();
	}
        
                 public ArrayList<Fazenda> getListaFazendas() {
                          return this.listaFazendas;
                 }
                 
                 public ArrayList<Gado> getListaGados() {
                          return this.listaGados;
                 }
	
	public void addFazenda(Fazenda fazenda) {
                          this.listaFazendas.add(fazenda);
	}
	
	public boolean removeFazenda(int codigoFazenda) {
                          for(Fazenda f : this.listaFazendas) {
		if(f.getCodigoFazenda() == codigoFazenda) {
                                           this.listaFazendas.remove(f);
                                           return true;
		}
                          }
                          return false;
	}
	
	public void addGado(Gado gado) {
                          this.listaGados.add(gado);
	}

	public boolean removeGado(int identificador) {
                          for(Gado g : this.listaGados) {
		if(g.getIdentificador() == identificador) {
                                           this.listaGados.remove(g);
                                           return true;
		}
                          }
                          return false;
	}
	
	public String getNome() {
                          return this.nome;
	}

	public int getRg() {
                          return this.rg;
	}
	
	
	public String validarQtdGados(int qtdGados) {
                          if(qtdGados <= 0) {
                                  return "Valor informado é inválido";
                          } else {
                                   return this.verificarCapacidade(qtdGados);
                          }
	}

	public int getQtdGados() {
                          return this.qtdGados;
	}

	public String verificarCapacidade(int qtdGados) {
                          int espacoPorGado = 15;
                          int limiteGados = 0;
		
                          for(Fazenda faz : this.listaFazendas) {
                                   limiteGados += Math.round(faz.getArea() / espacoPorGado);
                          }
		
                          if(qtdGados <= limiteGados) {
                                   this.qtdGados = qtdGados;
		return "O fazendeiro pode ter a quantidade de gados informada!";            
                          } else {
		return "O fazendeiro não pode ter a quantidade de gados informada.";
                          }
	}

	public String toString() {
                          return "Nome: " + this.nome + ", RG: " + this.rg;
	}
}
