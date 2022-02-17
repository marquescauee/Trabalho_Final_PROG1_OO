/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


public class Veterinario {
	private String nome;
	private int registro;
	
	public boolean setNome(String nome) {
                     if(!nome.isBlank()) {
                         this.nome = nome;
                         return true;
                     } else {
                         return false;
                     }
                 }
	
	public String getNome() {
                          return this.nome;
	}
	
                 public boolean setRegistro(int registro) {
                          if(registro > 0) {
                              this.registro = registro;
                              return true;
                          } else {
                              return false;
                          }
                 }
        
	public int getRegistro() {
                          return this.registro;
	}
	
	public String toString() {
                          return "Nome: " + this.nome + ", registro: " + this.registro;
	}
	
	public String calcularEliminacaoMetano(Gado gado) {
                          //Consumo 14KG por dia, o gado ganha 1,5Kg por dia e elimina 140g de metano por dia

                          double consumoAntigo = gado.getConsumoAntesDoControle();

                          //redução de 4kg na refeicao (4000g)
                          double consumoPosControle = consumoAntigo - 4;

                          double eliminacaoMetanoDiariaAntes = ((consumoAntigo * 140) / 14);
                          double eliminacaoMetanoAnualAntes = (eliminacaoMetanoDiariaAntes * 30 * 12) / 1000;

                          double eliminacaoMetanoDiariaAtual = ((consumoPosControle * 140) / 14);
                          double eliminacaoMetanoAnualAtual = (eliminacaoMetanoDiariaAtual * 30 * 12) / 1000;

                          return "Antes, o gado de identificador " + gado.getIdentificador() + " eliminava cerca de " + eliminacaoMetanoAnualAntes + "KG de metano por ano."
                                            + " Atualmente, após ajuste na alimentação, ele elimina cerca de " + eliminacaoMetanoAnualAtual + " KG de metano por ano.";
	}
}

