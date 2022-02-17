package models;

import java.util.ArrayList;

public class Refeicao {
	private double caloriasRefeicao;
                 private ArrayList<Ingrediente> listaIngredientes;
        
                 public Refeicao() {
                          this.listaIngredientes = new ArrayList<>();
                 }
                 
                 public void addIngrediente(Ingrediente ingrediente) {
                          this.listaIngredientes.add(ingrediente);
                 }
                 
	public double getCaloriasRefeicao() {
                          return this.caloriasRefeicao;
	}
	
                 public String toString() {      
                          String texto = "";
                          for(Ingrediente ing : this.listaIngredientes) {
                                   texto += ing.getNome() + ", ";
                          }
                          return "Ingrediente(s): " + texto + " Calorias: " + this.getCaloriasRefeicao();
                 }
        
	public String prepararRefeicao(Ingrediente ingrediente1) {
                          this.caloriasRefeicao = (ingrediente1.getCaloriasIngrediente() * ingrediente1.getGramas());
                          return "A refeição foi preparada com o ingrediente: " + ingrediente1.getNome() + " e possui " + this.caloriasRefeicao + " calorias.";
	}
	
	public String prepararRefeicao(Ingrediente ingrediente1, Ingrediente ingrediente2) {
                          this.caloriasRefeicao = ((ingrediente1.getCaloriasIngrediente() * ingrediente1.getGramas()) + (ingrediente2.getCaloriasIngrediente() * ingrediente2.getGramas()));
		
                          return "A refeição foi preparada com " + ingrediente1.getNome() + " e " + ingrediente2.getNome() + " e possui " +
                                   this.caloriasRefeicao + " calorias.";
	}
}
