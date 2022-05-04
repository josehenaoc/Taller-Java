
package ejercicios_condicionales_Java;
import java.util.Scanner;
import javax.swing.*;

//-------------------------------------------------Definir Variables----------------------------------------------------------------------------------------------------------!
public class ejercicio9_condicionales {

	public static void main(String[] args) {
		
//---------------------------------------------Formulas Areas Geométricas-----------------------------------------------------------------------------------------------------!
			//Area del rectangulo = Base X Altura
			//Area del Triangulo = 1/2 (Base)X(Altura)	X
			//Area del Trapecio =  Base mayor + Base menor
			//                     ----------------------  X Altura
			//                                2
            
		    Scanner menu = new Scanner ("System.in");
		    double valor1 = 1;
		    double valor2 = 2;
		    double fracción = valor1/valor2;
		   
//-----------------------------------------------Ejecución del codígo---------------------------------------------------------------------------------------------------------!
		    
			System.out.println("Bienvenido a la appCalculardoraAreas");
			System.out.println(" ");
			String nombre_completo = JOptionPane.showInputDialog("Escribe tu nombre completo.");
			System.out.println("Digita 1 para seleccionar el area geometrica de tu interes.");
			int menu_area = Integer.parseInt(JOptionPane.showInputDialog("Digita 1 para continuar por favor."));
			
			switch(menu_area) {
				
			case 1: 
				System.out.println("1--area del rectangulo.");
				System.out.println("2--area del triangulo o trapecio.");
				int menu_opciones = Integer.parseInt(JOptionPane.showInputDialog("Escoje una de las opciones por favor"));
					
				
					if (menu_opciones == 1) {
						
						System.out.println("Escribe el valor de la base en metros.");
						double base1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor de la base en metros por favor"));
						System.out.println("Escribe el valor de la altura en metros.");
						double altura1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor de la base en metros por favor"));
						double area_rectangulo = base1 * altura1;
						
						System.out.println(" ");
						System.out.println(nombre_completo + "," + " el area del rectangulo es " + area_rectangulo + " metros cuadrados.");
						
					}
					
					if (menu_opciones == 2) {
						
						System.out.println(" ");
						int menu_areas = Integer.parseInt(JOptionPane.showInputDialog("digita 1 si para halla area del triangulo ó digita 2 para hallar area del trapecio."));
						
						
						System.out.println(" ");
						if (menu_areas == 1) {
							
							System.out.println(" ");
							double base2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor de la base en metros por favor"));
							double altura2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor de la altura en metros por favor"));
							double area_triangulo = fracción * base2 * altura2;
							
							
							System.out.println(nombre_completo + "," + " el area del triangulo es " + area_triangulo + " metros cuadrados. ");
					
					}
					else {
							
						
						    double base_mayor = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor de la base mayor en metros por favor"));
						    double base_menor = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor de la base menor en metros por favor"));
						    double altura3 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor de la altura en metros por favor"));
						
							double area_trapecio = fracción * (base_mayor + base_menor) * altura3;
							
							
							System.out.println(nombre_completo + "," + " el area del trapecio es " + area_trapecio + " metros cuadrados. ");
							
					break;
							
				  }
			   }
			}
		}
	}
//----------------------------------------------------------Fin---------------------------------------------------------------------------------------------------------------!