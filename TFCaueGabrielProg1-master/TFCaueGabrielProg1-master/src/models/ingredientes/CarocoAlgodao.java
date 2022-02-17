package models.ingredientes;

import models.Ingrediente;

public class CarocoAlgodao extends Ingrediente {
	
	public String valorNutricional() {
                          return super.valorNutricional() + this.nome + ": \nMatéria seca: 92%, \nProteína bruta: 24%, \nFibra bruta: 21%, \nCalorias por grama: " + this.caloriasIngrediente; 
	}
}
