//----------------------------------------------Asignaci�n_importaci�n_paquetes--------------------------------------------------------------------!
package com.sofka_ejercicios_PSeInt_Java;
import java.util.*;

public class ejercicio1_variables_impresion {
	public static void main(String[] args) {
		
//-----------------------------------------------------Definir_variables---------------------------------------------------------------------------!

		Scanner sc = new Scanner (System.in);
		String nombre, apellidos;
	
//-----------------------------------------------------Ejecuci�n_c�digo----------------------------------------------------------------------------!
		
		System.out.println("Bienvenido al programa solictudNombre_1.0");
		System.out.println(" ");
		System.out.println("Digita su nombre por favor");
		nombre = sc.nextLine();
		System.out.println(" ");
		System.out.println("Digita sus apellidos por favor");
		apellidos = sc.nextLine();
		System.out.println(" ");
		System.out.println("Gracias por tu participaci�n " + nombre + " " + apellidos + " :)");
		
	}

}
//-------------------------------------------------------------Fin---------------------------------------------------------------------------------!