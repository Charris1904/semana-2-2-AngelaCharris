/**
 * 
 */
package com.ucreativa;

/**
 * @author achar
 *
 */
public class Impresora {

	private String marca;
	private String color;
	private String modelo;
	
	public Impresora(String marca, String color, String modelo) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String toString() {
		return "Impresora - Marca: " + marca + " Color: " + color + " Modelo: " + modelo;
	}

	public void imprimir() {}
	
	public void escanear() {}
	
	public void fotocopear() {}
}
