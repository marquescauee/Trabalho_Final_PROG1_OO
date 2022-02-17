package models.ingredientes;

import models.Ingrediente;

public class FareloSoja extends Ingrediente {
	
	public String valorNutricional() {
                          return super.valorNutricional() + this.nome + ": \nMatéria seca: 88,87%, \nMatéria orgânica: 93,61%, \nFibra Bruta: 6,18%, \nCalorias por grama: " + this.caloriasIngrediente; 
	}
}
