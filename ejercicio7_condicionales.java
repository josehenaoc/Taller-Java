//-------------------------------------------------------------Asignación_importación_paquetes---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!
package ejercicios_condicionales_Java;
import java.util.*;
import javax.swing.*;

//-------------------------------------------------------------------Definir_variables----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!	
public class ejercicio7_condicionales {
	public static void main(String[] args) {
		
		 Scanner menu = new Scanner (System.in);
		 String nombre_usuario, apellidos_usuario, fecha, imc;  
		 double kilogramo, estatura, indice_masa_corporal;
//--------------------------------------------------------------------Ejecución_código----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!	
		
		
		System.out.println("|--------------------Bienvenidos a la app SecretariaSalud-----------------------------|");
		System.out.print("");
		System.out.print("");
		
		nombre_usuario = JOptionPane.showInputDialog("Por favor, introduce tu nombre al sistema");
			
	    apellidos_usuario = JOptionPane.showInputDialog("Por favor, introduce tus apellidos al sistema");
			
	    fecha = JOptionPane.showInputDialog("Por favor, escribe la fecha de ingreso");
	    
	    imc = JOptionPane.showInputDialog("¿Deseas conocer tu indice de masa corporal?");
			
		if (imc.equalsIgnoreCase("si")) {
	    
	    System.out.println("Escribe tu peso en kilogramos");
		kilogramo = menu.nextDouble();
		
		System.out.println("Escribe tu estatura en metros");
		estatura = menu.nextDouble();
		
		indice_masa_corporal = Math.round(kilogramo/Math.pow(estatura,2));
		
			
			if(indice_masa_corporal == 18.5) {
				
			
			System.out.println(nombre_usuario + " " + apellidos_usuario + ", tu indice de masa corporal es: " + indice_masa_corporal + " estas en bajo peso" + "a la fecha de: " + fecha + ".");
			
			}
			
			else if(indice_masa_corporal <= 24.9) {
					
				
			System.out.println(nombre_usuario + " " + apellidos_usuario + ", tu indice de masa corporal es: " + indice_masa_corporal + " estas en peso normal, ¡Muy bien!" + "a la fecha de: " + fecha + ".");
				
				}
					
			else if(indice_masa_corporal <= 29.9) {
						
					
			System.out.println(nombre_usuario + " " + apellidos_usuario + ", tu indice de masa corporal es: " + indice_masa_corporal + " estas en sobrepeso, ¡a hacer ejercicio!" + "a la fecha de: " + fecha + ".");
				
				}
		
			else if(indice_masa_corporal >30.0) {
							
						
				System.out.println(nombre_usuario + " " + apellidos_usuario + ", tu indice de masa corporal es: " + indice_masa_corporal + " estas en sobrepeso, ¡a hacer ejercicio!" + "a la fecha de: " + fecha + ".");
				
				}
	 	
	  }
  

		else {
			System.out.println("¡Vuelve pronto!");
		}
		
	}
		
  }


//----------------------------------------------------------------------------Fin---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!