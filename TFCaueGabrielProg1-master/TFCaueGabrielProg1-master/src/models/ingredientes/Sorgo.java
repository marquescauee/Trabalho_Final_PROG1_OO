package models.ingredientes;

import models.Ingrediente;

public class Sorgo extends Ingrediente {
	
	public String valorNutricional() {
                          return super.valorNutricional() + this.nome +  ": \nGordura: 3,3g, \nProteína: 11,3g, \nFibra: 6,3g, \nCalorias por grama: " + this.caloriasIngrediente; 
	}
}
