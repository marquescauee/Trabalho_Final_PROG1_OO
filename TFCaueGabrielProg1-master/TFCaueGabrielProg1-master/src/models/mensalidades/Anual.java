package models.mensalidades;

import models.Fazendeiro;
import models.Mensalidade;

public class Anual extends Mensalidade {
	
	private double desconto;

	public Anual() {
                          this.tempo = 12;
                          this.taxa = 250;
	}
	
                 public String toString() {
                          return super.toString() + " Anual";
                 }
        
	public double calcularMensalidade(Fazendeiro fazendeiro) {
                          if(fazendeiro.getQtdGados() <= 5) {
		this.desconto = 20.0;
                          } else if(fazendeiro.getQtdGados() > 5 && fazendeiro.getQtdGados() <= 10){
		this.desconto = 40.0;
                          } else if(fazendeiro.getQtdGados() > 10 && fazendeiro.getQtdGados() <= 20) {
		this.desconto = 60.0;
                          } else {
		this.desconto = 80.0;
                          }
		
                          return this.taxa - this.desconto;
	}

}
