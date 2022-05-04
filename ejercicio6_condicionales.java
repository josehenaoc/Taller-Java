//---------------------------------------------------Asignación_importación_paquetes---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!
package ejercicios_condicionales_Java;
import java.util.Scanner;
import javax.swing.*;

//----------------------------------------------------------Definir_variables----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!	
public class ejercicio6_condicionales {
	
	public static void main(String[] args) {
	
		Scanner menu = new Scanner (System.in);
		
		String nombre_completo_usuario, direccion, numero_telefonico, correo_electronico, marca_modelo, novedades, codigo1, codigo2, codigo3, codigo4, codigo5, codigo6, codigo7, codigo8;
		int opciones,cilindraje;
		boolean repuestos = true;
		
		nombre_completo_usuario = JOptionPane.showInputDialog("Digite su nombre por favor");
		direccion = JOptionPane.showInputDialog("Digite su dirección de residencia por favor");
		numero_telefonico = JOptionPane.showInputDialog("Digita tu número telefonico de contacto por favor");
		correo_electronico = JOptionPane.showInputDialog("Digite su correo electronico por favor");
		
	
//-----------------------------------------------------------Ejecución_código----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!	

		System.out.println("|------------Bienvenido a la App tallerMotosElMaquinista----------------|");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("En esta aplicación se enfocara en el mantenimiento preventivo y correctio de motos de alto cilindaje (mayores a 150)");
		marca_modelo = JOptionPane.showInputDialog("Digita por favor la marca y modelo del vehiculo...Recomendación:-->escribe la respuesta en mayuscula en totalidad");
		novedades = JOptionPane.showInputDialog ("Digita las novedades ó incovenientes de tu vehiculo por favor");
		cilindraje = Integer.parseInt(JOptionPane.showInputDialog("Escribe el cilindraje de tu vehiculo por favor"));  
		
		if (cilindraje>150) {
			
			System.out.println("MENU DE OPCIONES \n \n1: Registro de ingreso y observaciones \n2: Registro de salida de taller y novedades \n3: Arreglos realizados por los colaboradores/Inventario de cambios y/o repuestos \n4: Salir app");
			opciones = menu.nextInt();
			
			switch (opciones) {
			
			case 1: 
				
				System.out.println("|----------------------REGISTRO DE ENTRADA---------------------------------------------------------|");
				System.out.println("|" + "NOMBRE CLIENTE:" + nombre_completo_usuario);
				System.out.println("|" + "DIRECCIÓN:" + direccion);
				System.out.println("|" + "NÚMERO TELEFONICO:" + numero_telefonico);
			    System.out.println("|" + "CORREO ELECTRÓNICO:" + correo_electronico);
				System.out.println("|" + "NOVEDADES DEL VEHICULO:" + novedades);
				System.out.println("|__________________________________________________________________________________________________|");
				System.out.println("NOTA: Este mensaje sera enviado via SMS y por correo registrado en la app.");
				break; 
				
			case 2:
				
				System.out.println("|------------------------------REGISTRO DE SALIDA--------------------------------------------------|");
				System.out.println("|" + "NOMBRE CLIENTE:" + nombre_completo_usuario);
				System.out.println("|" + "DIRECCIÓN:" + direccion);
				System.out.println("|" + "NÚMERO TELEFONICO:" + numero_telefonico);
			    System.out.println("|" + "CORREO ELECTRÓNICO:" + correo_electronico);
				System.out.println("|" + "NOVEDADES DEL VEHICULO:" + novedades);
				System.out.println("|__________________________________________________________________________________________________|");
				System.out.println("NOTA: Este mensaje sera enviado via SMS y por correo registrado en la app.");
				
				break;
				
			case 3:
				
				System.out.println("Se identifico los siguientes requerimientos descritos anteriormente por el usuario:" + " " + novedades);
				System.out.println("¿Desea obtener los nuevos repuestos para las novedades presentas en su vehiculo? escribe -> 1 <- para afirmar, --> 0 <- para no obtener los repuestos");
				repuestos= menu.nextBoolean();
				
				if (repuestos== true){
					
					System.out.println("Te invitamos a visualizar las tablas de repuesto de moto de acuerdo a las caracteristicas de tu vehiculo");
					
				    System.out.println("|-----------------------------INVENTARIO DE REPUESTOS y ACCESORIOS" + " " + marca_modelo + "----------------------------------------|");
					System.out.println("|------------------" + "(                        (1)Llantas                            )-----------------------------------|");
					System.out.println("|------------------" + "(                   (2)Pastillas de freno                      )-----------------------------------|");
					System.out.println("|------------------" + "(                    (3)Bateria electrica                      )-----------------------------------|");
					System.out.println("|------------------" + "(                   (4)Juego de tornilleria                    )-----------------------------------|");
					System.out.println("|------------------" + "(                    (5)Tren de arrastre                       )-----------------------------------|");
					System.out.println("|------------------" + "(                  (6)Canal de escape de gas                   )-----------------------------------|");
					System.out.println("|------------------" + "(                   (7)Juego de espejos                        )-----------------------------------|");
					System.out.println("|------------------" + "(                      (8)Calcomanias                          )-----------------------------------|");
					System.out.println("|_____________________________________________________________________________________________________________________|");
					System.out.println(" ");
					System.out.println(" ");
					
					System.out.println("|----------------------REGISTRO DE ARREGLOS,MODIFICACIONES E INVENTARIO DE REPUESTOS-----------------------------------|");
					System.out.println("|" + "NOMBRE CLIENTE:" + nombre_completo_usuario);
					System.out.println("|" + "DIRECCIÓN:" + direccion);
					System.out.println("|" + "NÚMERO TELEFONICO:" + numero_telefonico);
				    System.out.println("|" + "CORREO ELECTRÓNICO:" + correo_electronico);
					System.out.println("|" + "NOVEDADES DEL VEHICULO:" + novedades);
				    System.out.println("|" + "CAMBIOS REALIZADOS:");
					System.out.println("|" + "COSTOS PARCIAL: $150.000.");
					System.out.println("|"+ "COSTOS TOTAL: $150.000.");
					System.out.println("|______________________________________________________________________________________________________________________|");
					System.out.println("NOTA1: Este mensaje sera enviado via SMS y por correo registrado en la app.");
					System.out.println("NOTA2: COSTO PARCIAL equivale a 1 ó 2 mantenimientos preventivos del vehiculo; COSTO TOTAL equivale a cambios de repuestos nuevos y manteminientos preventimos mayor a 3.");
				}
				
				else {
					
					System.out.println("Se realizara al vehiculo " +  marca_modelo + " con mantenimiento preventivo y correctivo en tarifa estandar de $90.000.");
				}
				
			    break;
			    
			case 4:
				
				System.out.println("Hasta pronto, ¡danos el gusto de volver a atenderte! :D");
				
				break;
			
			}
		}	
			
		else {
			
		System.out.println("Discupanos, pero tu moto no es de cilindraje mayor, podemos atenderte con la App tallerMotosElMaquinista-cilindrajeBasico....Próximanete :)");
			
		}
		
	}

}
//-------------------------------------------------------------------Fin---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!