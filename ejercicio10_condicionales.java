//-------------------------------------------------------------Asignación_importación_paquetes----------------------------------------------------------------------------------------------------!
package ejercicios_condicionales_Java;

import java.util.Scanner;
import javax.swing.JOptionPane;

//--------------------------------------------------------------------Definir Variables-----------------------------------------------------------------------------------------------------------!
public class ejercicio10_condicionales {

	public static void main(String[] args) {
		
		
		Scanner menu = new Scanner (System.in);
		
//-------------------------------------------------------------------Ejecución del codígo---------------------------------------------------------------------------------------------------------!

		System.out.println("|---->Bienvenido a la appSuBancoFiel <----|");
		System.out.println("Para el banco Su Banco Fiel informa que el titular debe tener deposito minomo de $50.000 en su cuenta bancaria.");
		System.out.println ("¿Deseas continuar con el registro?");
		int desicion = Integer.parseInt(JOptionPane.showInputDialog("Digita 1 para continuar por favor ó 0 para salir de la app"));
		
		
		if (desicion == 1) {
			System.out.println("Digite el nombre del titular por favor.");
			String nombre_titular = JOptionPane.showInputDialog("Escribe tu nombre completo.");
			System.out.println("Digite la fecha actual.");
			String fecha = JOptionPane.showInputDialog("Escribe fecha actual por favor.");
			int cantidad_consignar = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad deseada a consignar en la cuenta por favor."));
			
			
			
			if (cantidad_consignar < 50000) {
				
				System.out.println("Disculpa, el monto minimo para abrir la cuenta es de $50.000.");
			}
			else {
				System.out.println("¡Perfecto!" + "," + nombre_titular + " tu saldo inicial en tu cuenta es:$ " + cantidad_consignar + " a la fecha actual:" + fecha);
			}
			
			System.out.println("");
			System.out.println("\n1: 1--Realizar consignación (ingresos) \n2: 2--Realizar retiros \n3: Realizar consultas de valor \n4: Salir app");
			
			
			System.out.println("Digite el número de la opciones de la app.");
			int eleccion = Integer.parseInt(JOptionPane.showInputDialog("Digita alguna de las opciones por favor"));
			
			
			switch (eleccion) {
				
			case 1:
				
				System.out.println("");
				System.out.println("Digita el valor a consignar.");
				int consignar = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad deseada a consignar en la cuenta por favor."));
				double ingresos = cantidad_consignar + consignar;
						
			    System.out.println(nombre_titular + "," + " sus saldo actual es de $" + ingresos + " hasta la fecha es de: " + fecha);
						
				break;
					
			case 2:
				
				System.out.println("");
				System.out.println("Digita el valor a retirar.");
				int retirar = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad deseada retirar en la cuenta por favor."));
				 
				 double retiro =  cantidad_consignar - retirar;
						
				 System.out.println(nombre_titular + "," + " su valor de retiro es de $" + retirar + "," + " actualmente tiene un saldo de: " + retiro + " disponible hasta la fecha es de: " + fecha);
						
				break;
					
			case 3:
				
				 System.out.println("");
				 System.out.println("Si desea consultar el valor de su cuenta digite 1 para continuar, digita 0 para salir de app.");
				 int consulta_valor = menu.nextInt();
						
				 if (consulta_valor == 1) {
				 double saldo = cantidad_consignar;
							
				 System.out.println(nombre_titular + "," + " su saldo actual es de $" + saldo + " hasta la fecha es de:" + fecha); 
				 
				 }
				 else {
					 
				 System.out.println ("Hasta pronto, vuelve pronto :)");
				 
				 }
				 
				break;

			case 4:
				
				 System.out.println("");
				
				 System.out.println("Hasta pronto, es un gusto atenderte :)");
						
				break;
					
			}
			
		}
			
		else {
				
			
			System.out.println("Hasta pronto, vuelve pronto :)");
			
		}
					
	}
		
  }
//----------------------------------------------------------------------------Fin-----------------------------------------------------------------------------------------------------------------!