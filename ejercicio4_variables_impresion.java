//---------------------------------------------------Asignaci�n_importaci�n_paquetes--------------------------------------------------------------------!
package com.sofka_ejercicios_PSeInt_Java;
import java.util.*;

//--------------------------------------------------------Declaraci�n_variables-------------------------------------------------------------------------!
public class ejercicio4_variables_impresion {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido al programa solictudNombre 4.0");
		System.out.println("");
		Scanner sc = new Scanner (System.in);
		String nombre_ciudad,nombre_pais;
		
//----------------------------------------------------------Ejecuci�n_c�digo----------------------------------------------------------------------------!
		System.out.println("Digita el nombre de una ciudad");
		nombre_ciudad = sc.nextLine();
		
		System.out.println("Digita el nombre del pais al que pertenece la ciudad anteriormente escritas");
		nombre_pais = sc.nextLine();
		 
		System.out.println("La ciudad "+ nombre_ciudad + ","+ " es la capital del pa�s " + nombre_pais + ".");
		
	}
}

//------------------------------------------------------------------Fin---------------------------------------------------------------------------------!