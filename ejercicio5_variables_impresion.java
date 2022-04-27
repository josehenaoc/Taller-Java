//---------------------------------------------------Asignación_importación_paquetes--------------------------------------------------------------------!
package com.sofka_ejercicios_PSeInt_Java;
import java.util.*;

//--------------------------------------------------------Declaración_variables-------------------------------------------------------------------------!
public class ejercicio5_variables_impresion {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String nombre, apellidos, nombre_mascota, tipo;
		int edad_mascota;

//----------------------------------------------------------Ejecución_código----------------------------------------------------------------------------!	
		
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
		System.out.println(nombre_mascota + " es un(a) " + tipo + " el cual, tiene " + edad_mascota + " años de edad y " + nombre + " " + apellidos +  " es actualmente su dueño(a).");
		System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------|");
		
	}

}
//------------------------------------------------------------------Fin---------------------------------------------------------------------------------!