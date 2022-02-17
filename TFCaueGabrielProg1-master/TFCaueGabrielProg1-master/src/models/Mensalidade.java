package models;

public abstract class Mensalidade {
	
	protected double taxa;
	protected int tempo;
	
	public int getTempo() {
                          return this.tempo;
	}
	
                 public String toString() {
                          return "Mensalidade: ";
                 }
        
	public abstract double calcularMensalidade(Fazendeiro fazendeiro);
}
