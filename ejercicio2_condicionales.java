//---------------------------------------------------Asignaci�n_importaci�n_paquetes--------------------------------------------------------------------!
package ejercicios_condicionales_Java;
import java.util.*;
import javax.swing.*;

//----------------------------------------------------------Definir_variables----------------------------------------------------------------------------!	
public class ejercicio2_condicionales {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String nombre_usuario = JOptionPane.showInputDialog("Por favor, introduce tu nombre completo por favor");
		String edad_usuario = JOptionPane.showInputDialog("Por favor, introduce tu edad por favor");
		int edad_yo = Integer.parseInt(edad_usuario);
		
//-----------------------------------------------------------Ejecuci�n_c�digo----------------------------------------------------------------------------!	

		System.out.println("---> Bienvenidos al programa de validaci�n de edad 2.0 <---");
		System.out.println(" ");
		
		if (edad_yo<18) {
			
			System.out.println(nombre_usuario + "," + " usted es menor de edad.");
		}
		else {
			System.out.print("Ups, n�mero invalido en el sistema, vuelve a intertarlo :D");	
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("�Gracias por su participacion! "+ nombre_usuario + "." + " :)");
	}

}
//-------------------------------------------------------------------Fin---------------------------------------------------------------------------------!