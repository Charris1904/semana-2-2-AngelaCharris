/**
 * @author acharris
 */
package com.ucreativa;

public class Perro {
	
	private String nombre;
	private String color;
	private int nivelHambre;

	public Perro() {}

	public Perro(String color) {
		this.color = color;
	}

	public Perro(String nombre, String color, int nivelHambre) {
		this.nombre = nombre;
		this.color = color;
		this.nivelHambre = nivelHambre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNivelHambre() {
		return nivelHambre;
	}

	public void setNivelHambre(int nivelHambre) {
		this.nivelHambre = nivelHambre;
	}
	
	public String toString() {
		return "Perro - Nombre: " + " " + nombre + " Color: " + color + " Nivel de Hambre: " + nivelHambre;
	}
	
	public void ladrar() {}
	
	public void traerBola() {}
	
	public void comer() {}

}
