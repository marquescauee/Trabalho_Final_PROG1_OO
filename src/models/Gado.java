package models;

public class Gado {
	private int identificador;
	private double peso;
	private double calMaxPorDia;
	private double consumoAntesDoControle;
	
	public Gado(int identificador, double calMaxPorDia, double consumoAntesDoControle, double peso) {
		this.identificador = identificador;
                                   this.peso = peso;
		this.calMaxPorDia = calMaxPorDia;
		this.consumoAntesDoControle = consumoAntesDoControle;
	}
	
	public double getConsumoAntesDoControle() {
		return this.consumoAntesDoControle;
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public double getPeso() {
		return this.peso;
	}

	public double getCalMaxPorDia() {
		return this.calMaxPorDia;
	}
	
	public String toString() {
		return "Identificador: " + this.identificador + ", peso: " + this.peso + ", Consumo por dia: " + this.calMaxPorDia;
	}
	
	public double calcularArrobas() {
		//Para o cálculo do arroba, deve-se levar em conta o peso da carcaça do boi, ou seja, a carne com osso, mas sem couro, sebo, miúdos e sangue.
		//Geralmente, a carcaça representa 50% do peso total do animal.
		
		double carcaca = this.peso * 0.5;
		
		//1@ = 15Kg
		double arrobas = carcaca / 15; 
		
		return Math.round(arrobas);
	}
	
                 private double consumoTotalDia = 0;
	public String consumirRefeicao(Refeicao refeicao) {
		if(refeicao.getCaloriasRefeicao() + consumoTotalDia <= this.calMaxPorDia) {
                                           consumoTotalDia += refeicao.getCaloriasRefeicao();
                                           return "O gado de identificador " + this.getIdentificador() + " consumiu a refeição.";
		} else {
                                           return "Se o gado consumir essa refeição, ele passará do limite indicado de calorias por dia.";
		}
	}
}
