//---------------------------------------------------Asignación_importación_paquetes-----------------------------------------------------------------------------------------------------------------------!
package ejercicios_condicionales_Java;
import java.util.*;
import javax.swing.*;

//----------------------------------------------------------Definir_variables------------------------------------------------------------------------------------------------------------------------------!	
public class ejercicio4_condicionales {

	public static void main(String[] args) {
		

        Scanner menu = new Scanner(System.in);
		
		String nombre_usuario = JOptionPane.showInputDialog("Digite su nombre por favor");
		String apellidos_usuario = JOptionPane.showInputDialog("Digite sus apellidos por favor");
		System.out.println("MENU DE OPCIONES \n1: Alquilar Pelicula \n2: Consultar peliculas disponibles \n3: Recibir pelicula en la video tienda");
		System.out.println("recuerda oprimir las opciones númericas en la consola");
		
		
//-----------------------------------------------------------Ejecución_código------------------------------------------------------------------------------------------------------------------------------!	
	
		System.out.println("---> Bienvenidos al programa de validación de edad 3.0 <---");
		System.out.println("");	
		
		System.out.println("MENU DE OPCIONES \n1: Alquilar pelicula --> A)-Titanic B)-Aquaman C)-Inception D)- Granizo \n2: Consultar peliculas disponibles \n3: Recibir pelicula en la video tienda \n4: Salir");
		System.out.println("recuerda oprimir las opciones númericas en la consola");
		System.out.println("");	
		int opcion = menu.nextInt();
		
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!
        if (opcion == 1){
			
        System.out.println("\n1A)-Titanic \n2B)-Aquaman \n3C)-Inception \n4D)- Granizo");
			
		int seleccion_pelicula = Integer.parseInt(JOptionPane.showInputDialog("Por favor, escoje una de las peliculas de la lista."));
			
	    switch (seleccion_pelicula) {
			
	    case 1: 
	    
		System.out.println("");		
		System.out.println (nombre_usuario + " " +  apellidos_usuario + "," +"Has seleccionado la pelicula --> Titanic <--" + "¡Excelente elección!");
		System.out.println("");
		System.out.println("Gracias por preferirnos, estamos para servirte. :D ");		
	   break;
			
	    case 2: 
	    	
	    System.out.println("");					
	    System.out.println (nombre_usuario + " " +  apellidos_usuario + "," +"Has seleccionado la pelicula --> Aquaman <--" + "¡Excelente elección!");
	    System.out.println("");
		System.out.println("Gracias por preferirnos, estamos para servirte. :D ");		
	   
	   break;
				
		case 3: 
			
		System.out.println("");			
		System.out.println (nombre_usuario + " " +  apellidos_usuario + "," +"Has seleccionado la pelicula --> Inception <--" + "¡Excelente elección!");
		System.out.println("");
		System.out.println("Gracias por preferirnos, estamos para servirte. :D ");		
	   
	   break;	
				
		case 4: 
			
	    System.out.println("");			
		System.out.println (nombre_usuario + " " +  apellidos_usuario + "," +"Has seleccionado la pelicula --> Granizo <--" + "¡Excelente elección!");
		System.out.println("");
		System.out.println("Gracias por preferirnos, estamos para servirte. :D ");		
		
	   break;
				
	   
		default:
				
			System.out.println(nombre_usuario + " " + apellidos_usuario + ", " +"Agradecemos tu tiempo, pronto tendremos mas peliculas para tu disfrute;");
				
			}	
		}
	
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!
		
        if (opcion == 2){
			
			System.out.println("Escribe el nombre de la pelicula de la lista");
			String elección_pelicula = JOptionPane.showInputDialog("Digita el nombre de la pelicula por favor");
				
				
				if (elección_pelicula.equals("Titanic")) {
					
					System.out.println("");	
					System.out.println( "La pelicula --> Titanic <-- se encuentra disponible para alquilar :D");
				}
				
                if (elección_pelicula.equals("Aquaman")) {
					
                	System.out.println("");	
					System.out.println( "La pelicula --> Aquaman <-- se encuentra disponible para alquilar :D");
				}
				
                if (elección_pelicula.equals("Inception")) {
					
                	System.out.println("");	
					System.out.println( "La pelicula --> Inception <-- se encuentra disponible para alquilar :D");
				}
				
                if (elección_pelicula.equals("Granizo")) {
					
                	System.out.println("");	
					System.out.println( "La pelicula --> Granizo <-- se encuentra disponible para alquilar :D");
				}
				
			}
		
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
        if (opcion == 3){
			
			System.out.println("¿Desea reclamar la pelicula en la video tienda?");
			System.out.println("oprime 1 para confirmar, oprime 0 para salir de la app");
			int escojer = menu.nextInt();
			
			if (escojer == 1) {
				
				System.out.println("Excelente, esperamos tus comentarios y opiniones de la pelicula ;)");
			}
			
             if (escojer == 0) {
				
				System.out.println("Hasta pronto, vuelve pronto :)");
             }
        }
//-------------------------------------------------------------------------------------------------------------------------------------------------------!
          if (opcion == 4) {
        	   
        	   System.out.println("Hasta pronto, vuelve pronto :)");
           }
	
		}

 }

//-------------------------------------------------------------------Fin---------------------------------------------------------------------------------!