//---------------------------------------------------Asignación_importación_paquetes--------------------------------------------------------------------!
package ejercicios_condicionales_Java;
import java.util.*;
import javax.swing.*;

//----------------------------------------------------------Definir_variables----------------------------------------------------------------------------!	
public class ejercicio3_condicionales {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		String nombre_usuario = JOptionPane.showInputDialog("Digita tu nombre Por favor");
		
		String apellidos_usuario = JOptionPane.showInputDialog("Digita tus apellidos Por favor");
		
		String edad_usuario = JOptionPane.showInputDialog("Digita tu edad por favor");
		
		int edad_yo = Integer.parseInt(edad_usuario);

		
//-----------------------------------------------------------Ejecución_código----------------------------------------------------------------------------!	
		
		System.out.println("---> Bienvenidos al programa de validación de edad 3.0 <---");
		System.out.println("");
		
		
        if (edad_yo>=18) {
			
			System.out.println(nombre_usuario + " " + apellidos_usuario + ", " + "usted es mayor de edad, por lo tanto, puede entrar a la fiesta.");
		}
		
		else {
		
		System.out.println(nombre_usuario + " " + apellidos_usuario + ", " +"usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
		}

        System.out.println(" ");
		System.out.println(" ");
		System.out.println("¡Gracias por su participacion! "+ nombre_usuario + "." + ":)");
        
	}

}
//-------------------------------------------------------------------Fin---------------------------------------------------------------------------------!