//---------------------------------------------------Asignaci�n_importaci�n_paquetes--------------------------------------------------------------------!
package com.sofka_ejercicios_PSeInt_Java;
import java.util.*;

//--------------------------------------------------------Declaraci�n_variables-------------------------------------------------------------------------!
public class ejercicio5_variables_impresion {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String nombre, apellidos, nombre_mascota, tipo;
		int edad_mascota;

//----------------------------------------------------------Ejecuci�n_c�digo----------------------------------------------------------------------------!	
		
		System.out.println("Bienvenido al programa solictudNombre 5.0");
		System.out.println("");
		
		System.out.println("Digita su nombre por favor");
		nombre = sc.nextLine();
		
		System.out.println("Digita sus apellidos por favor");
		apellidos = sc.nextLine();
		
		System.out.println("Ingresa nombre de la de la mascota por favor");
		nombre_mascota = sc.nextLine();
		
		System.out.println("Ingresa tipo de mascota por favor");
		tipo = sc.nextLine();
		
		System.out.println("Ingresa edad de la mascota por favor");
		edad_mascota = sc.nextInt();
		
		System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------|");
		System.out.println(nombre_mascota + " es un(a) " + tipo + " el cual, tiene " + edad_mascota + " a�os de edad y " + nombre + " " + apellidos +  " es actualmente su due�o(a).");
		System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------|");
		
	}

}
//------------------------------------------------------------------Fin---------------------------------------------------------------------------------!