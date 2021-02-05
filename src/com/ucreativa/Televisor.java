/**
 * @author acharris
 */
package com.ucreativa;

public class Televisor {

	private int tamano;
	private String color;
	private String marca;
	
	//Constructor
	public Televisor(int tamano, String color, String marca) {
		this.tamano = tamano;
		this.color = color;
		this.marca = marca;
	}

	//Getter & Setter
	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//toString
	public String toString() {
		return "Televisor - Tamaño: " + tamano + "Color: " + color + " Marca: " + marca;
	}
	
	public void cambiarCanal() {}
	
	public void silenciar() {}
	
	public void subirVolumen() {}

}
