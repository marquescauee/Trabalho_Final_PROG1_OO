package models.mensalidades;

import models.Fazendeiro;
import models.Mensalidade;

public class Semestral extends Mensalidade {
	
	public Semestral() {
                          this.tempo = 6;
                          this.taxa = 400;
	}
	
                 public String toString() {
                          return super.toString() + " Semestral";
                 }
        
	public double calcularMensalidade(Fazendeiro fazendeiro) {
		
                          if(fazendeiro.getQtdGados() == 5) {
		this.taxa = 350.0;
                          } else if(fazendeiro.getQtdGados() > 5 && fazendeiro.getQtdGados() <= 10){
		this.taxa = 300.0;
                          } else if(fazendeiro.getQtdGados() > 10 && fazendeiro.getQtdGados() <= 20) {
		this.taxa = 250.0;
                          } else {
		this.taxa = 200.0;
                          }
		
                          return this.taxa;
	}
}
