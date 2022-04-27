//---------------------------------------------------Asignación_importación_paquetes--------------------------------------------------------------------!
package com.sofka_ejercicios_PSeInt_Java;
import java.util.*;

//--------------------------------------------------------Declaración_variables-------------------------------------------------------------------------!
public class ejercicio3_variables_impresion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre, apellidos, nombre_mama, apellidos_mama, nombre_papa, apellidos_papa;
		
//----------------------------------------------------------Ejecución_código----------------------------------------------------------------------------!		
		
		System.out.println ("Bienvenidos al programa solicituNombre 3.0");
		System.out.println(" ");
		
		System.out.println("Digite su nombre por favor");
		nombre = sc.nextLine();
		System.out.println(" ");
		
		System.out.println("Digite sus apellidos por favor");
		apellidos = sc.nextLine();
		System.out.println(" ");
		
		System.out.println("Digita el nombre de su madre por favor");
		nombre_mama = sc.nextLine();
		System.out.println(" ");
		
		System.out.println("Digita los apellidos completos de su madre por favor");
		apellidos_mama = sc.nextLine();
		System.out.println(" ");
		
		System.out.println("Digita el nombre  de su padre por favor");
		nombre_papa = sc.nextLine();
		System.out.println(" ");
		
		System.out.println("Digita los apellidos de su padre por favor");
		apellidos_papa = sc.nextLine();
		System.out.println(" ");
		
	    System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------|");
		System.out.println(" Yo " + nombre + " " +  apellidos + ", " + "soy hijo de " + nombre_mama + " " + apellidos_mama + " y " + nombre_papa + " " + apellidos_papa + ".");
		System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------|");
		System.out.println(" ");
		System.out.println("¡Gracias por su participación " + nombre + apellidos+ "." + ":)");
		
	}

}
//-------------------------------------------------------------------Fin--------------------------------------------------------------------------------!