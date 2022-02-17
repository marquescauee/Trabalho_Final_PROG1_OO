package models.ingredientes;

import models.Ingrediente;

public class Milho extends Ingrediente {
	
	public String valorNutricional() {
                          return super.valorNutricional() + this.nome + ": \nMatéria seca: 88,63%, \nMatéria orgânica: 98,85%, \nFibra Bruta: 2,06%, \nCalorias por grama: " +  this.caloriasIngrediente; 
	}
}
