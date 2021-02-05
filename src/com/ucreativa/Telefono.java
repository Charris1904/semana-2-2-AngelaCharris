/**
 * @author acharris
 */
package com.ucreativa;

public class Telefono {

	private String marca;
	private String tipo;
	private String color;
	
	public Telefono(String marca, String tipo, String color) {
		this.marca = marca;
		this.tipo = tipo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Telefono - Marca: " + marca + " Tipo: " + tipo + " Color: " + color;
	}
	
	public void llamar() {}
	
	public void colgar() {}
	
	public void devolverLlamada() {}

}
