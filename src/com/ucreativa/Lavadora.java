/**
 * @author acharris
 */
package com.ucreativa;

public class Lavadora {

	private int capacidad;
	private String marca;
	private String color;
	
	public Lavadora(int capacidad, String marca, String color) {
		this.capacidad = capacidad;
		this.marca = marca;
		this.color = color;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Lavadora - Capacidad: " + capacidad + " Marca: " + marca + " Color: " + color;
	}

	public void iniciarCiclo() {}
	
	public void lavar() {}
	
	public void apagar() {}
}
