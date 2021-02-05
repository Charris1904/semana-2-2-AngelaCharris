/**
 * @author acharris
 */
package com.ucreativa;

public class Computadora {

	private String tipo;
	private String marca;
	private int peso;
	
	public Computadora(String tipo, String marca, int peso) {
		this.tipo = tipo;
		this.marca = marca;
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Computadora - Tipo: " + tipo + " Marca: " + marca + " Peso: " + peso;
	}
	
	public void encender() {}
	
	public void apagar() {}
	
	public void reiniciar() {}

}
