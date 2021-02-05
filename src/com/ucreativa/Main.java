/**
 * @author acharris
 */
package com.ucreativa;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Perro perro = new Perro("Sissy ", "Amarillo ", 0);
		Televisor tv = new Televisor(15, "Negro", "LG");
		Telefono telefono = new Telefono("Samsung", "Celular", "Rojo");
		Computadora computadora = new Computadora("Portatil", "Asus", 3);
		Lavadora lavadora = new Lavadora(20, "Mabe", "Blanco");
		Impresora impresora = new Impresora("Canon", "Negro", "Pixma");
		
		System.out.println(perro.toString());
		System.out.println(tv.toString());
		System.out.println(telefono.toString());
		System.out.println(computadora.toString());
		System.out.println(lavadora.toString());
		System.out.println(impresora.toString());
	}

}
