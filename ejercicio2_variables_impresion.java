//--------------------------------------------------Asignación_importación_paquetes---------------------------------------------------------------!
package com.sofka_ejercicios_PSeInt_Java;
import java.util.*;
//--------------------------------------------------------Declaración_variables-------------------------------------------------------------------!
public class ejercicio2_variables_impresion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String nombre, apellidos;
		byte edad;
		float estatura;
//----------------------------------------------------------Ejecución_código----------------------------------------------------------------------!
		
		System.out.println("Bienvenido al programa solicitudNombre 2.0");
		System.out.println("");
		
		System.out.println("Digite su nombre por favor");
		nombre = sc.nextLine();
		System.out.println("");
		
		System.out.println("Digite sus apellidos por favor");
		apellidos = sc.nextLine();
		System.out.println("");
		
		System.out.println("Digite sus edad por favor");
		edad = sc.nextByte();
		System.out.println("");
		
		System.out.println("Digite sus estatura en metros por favor");
		estatura = sc.nextFloat();
		System.out.println("");
		
		System.out.println(" ----------------------------------------------------");
		System.out.println("|Tu nombre completo es: " + nombre + " " + apellidos +".");
		System.out.println("|Tu edad es: " + edad + " " + "años" +  ".");
		System.out.println("|Tu estatura es: " + estatura + " " + "metros.");
		System.out.println("|____________________________________________________");
		System.out.println("");
		System.out.println("¡Gracias por su participación, " + nombre + " " + apellidos + ". "+ ":)");
		
	}

}
//-------------------------------------------------------------------Fin--------------------------------------------------------------------------!