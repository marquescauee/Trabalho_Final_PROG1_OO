package models;

public class Fazenda {
	private String nome;
	private double area;
	private int codigoFazenda;

        
                 public boolean setNome(String nome) {
                     if(!nome.isBlank()) {
                         this.nome = nome;
                         return true;
                     } else {
                         return false;
                     }
                 }
	
	public String getNome() {
                          return this.nome;
	}
        
                 public boolean setArea(double area) {
                          if(area > 0 ) {
                              this.area = area;
                              return true;
                          } else {
                              return false;
                          }
                 }
	
	public double getArea() {
                          return this.area;
	}
	
                 public boolean setCodigoFazenda(int codigoFazenda) {
                          if(codigoFazenda > 0) {
                              this.codigoFazenda = codigoFazenda;
                              return true;
                          } else {
                              return false;
                          }
                 }
        
	public int getCodigoFazenda() {
                          return this.codigoFazenda;
	}
	
	public String toString() {
                          return "Nome: " + this.nome + ", área: " + this.area + ", código: " + this.codigoFazenda;
	}
}
