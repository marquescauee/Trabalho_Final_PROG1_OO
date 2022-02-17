package models;

public abstract class Ingrediente {
	protected double caloriasIngrediente;
	protected double gramas;
	protected String nome;

	public String getNome() {
                          return this.nome;
	}
        
                 public boolean setNome(String nome) {
                          if(!nome.isBlank()) {
                              this.nome = nome;
                              return true;
                          } else {
                              return false;
                          }
                 }
	
	public double getGramas() {
                          return this.gramas;
	}
	
                 public boolean setGramas(double gramas) {
                          if(gramas > 0) {
                              this.gramas = gramas;
                              return true;
                          } else {
                              return false;
                          }
                 }
        
	public double getCaloriasIngrediente() {
                          return this.caloriasIngrediente;
	}
        
                 public boolean setCaloriasIngrediente(double caloriasIngrediente) {
                          if(caloriasIngrediente > 0) {
                              this.caloriasIngrediente = caloriasIngrediente;
                              return true;
                          } else {
                              return false;
                          }
                 }
	
	public String valorNutricional() {
                          return "Composição do " + this.nome;
	}
        
                 public String toString() {
                          return "Nome: " +  this.nome + ", gramas: " + this.gramas + ". calorias do ingrediente : " + this.caloriasIngrediente + ", calorias totais: " + (this.caloriasIngrediente * this.gramas);
                 }
}
