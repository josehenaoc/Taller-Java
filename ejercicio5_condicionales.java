//---------------------------------------------------Asignación_importación_paquetes---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!
package ejercicios_condicionales_Java;
import java.util.*;
import javax.swing.*;

//----------------------------------------------------------Definir_variables----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!	
public class ejercicio5_condicionales {

	public static void main(String[] args) {
		
		Scanner menu = new Scanner(System.in);
		
		String codigo1 ="1";
		String codigo2 ="2";
		String codigo3 ="3";
		String codigo4 ="1";
		String codigo5 ="2";
		String codigo6 ="3";
		String codigo7 ="1";
		String codigo8 ="2";
		String codigo9 ="3";
		String codigo10="1";
		String codigo11="2";
		String codigo12="3";

//-----------------------------------------------------------Ejecución_código----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!	

		System.out.println("Bienvenido a la app farmmaceutica DrogueriaMiSalud");
		System.out.println("Servicios farmaceuticos para la comunidad de Suba y sectores aledaños");
		System.out.println("Te solicitaremos la información conrrespondiente para generarte tu factura electronica y tenerla a disposición");
		System.out.println(" ");
		
		String nombre_usuario = JOptionPane.showInputDialog("Digite su nombre por favor");
		String apellidos_usuario = JOptionPane.showInputDialog("Digite sus apellidos por favor");
		String número_telefonico = JOptionPane.showInputDialog("Digita tu número telefonico de contacto por favor");
		String direccion = JOptionPane.showInputDialog("Digite su dirección de residencia por favor");
		
		System.out.println("Te invitamos a consultar nuestros productos agrupados por categorias, puedes comunicarte con un asesor en linea telefonica a traves del número (000.000.00)");
		System.out.println(" ");
		System.out.println ("Permitenos ayudarte a escojer el producto indicado para los sintomas que presentas");
		System.out.println(" ");
		System.out.println("Describenos tu sintomas y dolencias que presentas");
		String sintoma = JOptionPane.showInputDialog("Describenos los sintomas de salud que presentas por favor");
		
		System.out.println("Ahora, dentro de los sintomas descritos ¿Se relaciona nuestra categoria de productos farmaceuticos con tus sintomas? Oprime 1 para confirmar ó 0 para negar ");
		System.out.println(" ");
		System.out.println("Consulta nuestro catalogo de productos disponibles para tus necesidades");
		System.out.println("1-- Dermatológicos");
		System.out.println("2-- Digestivos");
		System.out.println("3-- Alivio de dolor");
		System.out.println("4-- Vitaminas y productos naturales");
		System.out.println("5--¿Deseas reportar alguna eventualidad en nuestros productos?");
		System.out.println("6-- Salir de la app");
		int eleccion = menu.nextInt();
		
		switch (eleccion) {
		
		case 1:
		
		System.out.println("Por favor, consulta las categorias de productos que tenemos a disposicíon y confirma tu compra para ser enviada a tu domicilio");
		System.out.println(" ");
		System.out.println("--->Dermatólogicos<---");
		System.out.println("Digita el número correspondiente a tu medicamento");
		System.out.println(codigo1 + "-Protectores dérmicos (Acid-Mantlle pH 4.0)--- $20.000");
		System.out.println(codigo2 + "-Protectores dérmicos (Acetato de Aluminio ph 4.6)--- $9.000");
		System.out.println(codigo3 + "-Protectores dérmicos (Jabón Alergibón)--- $23.000");
		int listado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción a escojer"));
		
		        if(listado1 ==1) {
		
			
				System.out.println(" ");
				System.out.println("--------------------------------------------------------------FACTURA NÚMERO 001-----------------------------------------------------------------------------------------------------");
				System.out.println("|         USUARIO:" + " " + nombre_usuario + " " + apellidos_usuario);
				System.out.println("| NUMERO CONTACTO:" + " " + número_telefonico);
				System.out.println("|       DIRECCIÓN:" + " "  + direccion);
				System.out.println("|        PRODUCTO:" + " Acid Mantlle ph 4.0");
				System.out.println("|    VALOR PAGADO:" + " $20.000");
				System.out.println("|  SINTOMATOLOGÍA:" + " " + sintoma);
				System.out.println( "____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(" ");
				System.out.println(nombre_usuario + " " + apellidos_usuario + "," + " tu producto de la cátegoria -->Dermatológicos<-- ha sido ingresada al sistema con éxito y listo para ser entregado a la dirección:" + " " + direccion);
				
		  }
			
		        if (listado1 ==2) {
				
				
				System.out.println(" ");
				System.out.println("--------------------------------------------------------------FACTURA NÚMERO 002-----------------------------------------------------------------------------------------------------");
				System.out.println("|         USUARIO:" + " " + nombre_usuario + " " + apellidos_usuario);
				System.out.println("| NUMERO CONTACTO:" + " " + número_telefonico);
				System.out.println("|       DIRECCIÓN:" + " "  + direccion);
				System.out.println("|        PRODUCTO:" + " Acetato de Aluminio ph 4.6");
				System.out.println("|    VALOR PAGADO:" + " $9.000");
				System.out.println("|  SINTOMATOLOGÍA:" + " " + sintoma);
				System.out.println( "____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(" ");
				System.out.println(nombre_usuario + " " + apellidos_usuario + "," + " tu producto de la cátegoria -->Dermatológicos<-- ha sido ingresada al sistema con éxito y listo para ser entregado a la dirección:" + " " + direccion);
				
		  }
			
		        if (listado1 ==3) {
				
				
				System.out.println(" ");
				System.out.println("--------------------------------------------------------------FACTURA NÚMERO 003-----------------------------------------------------------------------------------------------------");
				System.out.println("|         USUARIO:" + " " + nombre_usuario + " " + apellidos_usuario);
				System.out.println("| NUMERO CONTACTO:" + " " + número_telefonico);
				System.out.println("|       DIRECCIÓN:" + " "  + direccion);
				System.out.println("|        PRODUCTO:" + " Jabón Alergibón");
				System.out.println("|    VALOR PAGADO:" + " $23.000");
				System.out.println("|  SINTOMATOLOGÍA:" + " " + sintoma);
				System.out.println( "____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(" ");
				System.out.println(nombre_usuario + " " + apellidos_usuario + "," + " tu producto de la cátegoria -->Dermatológicos<-- ha sido ingresada al sistema con éxito y listo para ser entregado a la dirección:" + " " + direccion);
				
		  }
		
	    break;
	    
        case 2: 
        	
        	System.out.println(" ");
			System.out.println("--->Digestivos<---");
			System.out.println("Digita el número correspondiente a tu medicamento");
			System.out.println(codigo4 + "-Digestivos (Pancreatina Simeticona MK 170mg)--- $50.000");
			System.out.println(codigo5 + "-Digestivos (Gastrofast TQ 4.6)---$28.000");
			System.out.println(codigo6 + "-Digestivos (Fracción vitaminas C 10% descuento/ unidad)--- $10.000");
			int listado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción a escojer"));
		
		
		        if (listado2 ==1) {
					
				
				System.out.println(" ");
				System.out.println("--------------------------------------------------------------FACTURA NÚMERO 004-----------------------------------------------------------------------------------------------------");
				System.out.println("|         USUARIO:" + " " + nombre_usuario + " " + apellidos_usuario);
				System.out.println("| NUMERO CONTACTO:" + " " + número_telefonico);
				System.out.println("|       DIRECCIÓN:" + " "  + direccion);
				System.out.println("|        PRODUCTO:" + "Pancreatina Simeticona MK 170mg)");
				System.out.println("|    VALOR PAGADO:" + " $50.000");
				System.out.println("|  SINTOMATOLOGÍA:" + " " + sintoma);
				System.out.println( "____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(" ");
				System.out.println(nombre_usuario + " " + apellidos_usuario + "," + " tu producto de la cátegoria -->Digestivos<-- ha sido ingresada al sistema con éxito y listo para ser entregado a la dirección:" + " " + direccion);
					
			  }
		
				
		        if (listado2 ==2) {
					
					
				System.out.println(" ");
				System.out.println("--------------------------------------------------------------FACTURA NÚMERO 005-----------------------------------------------------------------------------------------------------");
				System.out.println("|         USUARIO:" + " " + nombre_usuario + " " + apellidos_usuario);
				System.out.println("| NUMERO CONTACTO:" + " " + número_telefonico);
				System.out.println("|       DIRECCIÓN:" + " "  + direccion);
				System.out.println("|        PRODUCTO:" + " Gastrofast TQ 4.6");
				System.out.println("|    VALOR PAGADO:" + " $28.000");
				System.out.println("|  SINTOMATOLOGÍA:" + " " + sintoma);
				System.out.println( "____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(" ");
				System.out.println(nombre_usuario + " " + apellidos_usuario + "," + " tu producto de la cátegoria -->Digestivos<-- ha sido ingresada al sistema con éxito y listo para ser entregado a la dirección:" + " " + direccion);
					
			  }
				
			    if (listado2 ==3) {
					
					
				System.out.println(" ");
				System.out.println("--------------------------------------------------------------FACTURA NÚMERO 006-----------------------------------------------------------------------------------------------------");
				System.out.println("|         USUARIO:" + " " + nombre_usuario + " " + apellidos_usuario);
				System.out.println("| NUMERO CONTACTO:" + " " + número_telefonico);
				System.out.println("|       DIRECCIÓN:" + " "  + direccion);
				System.out.println("|        PRODUCTO:" + " Fracción vitaminas C 10% descuento/ unidad");
				System.out.println("|    VALOR PAGADO:" + " $10.000");
				System.out.println("|  SINTOMATOLOGÍA:" + " " + sintoma);
				System.out.println( "____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(" ");
				System.out.println(nombre_usuario + " " + apellidos_usuario + "," + " tu producto de la cátegoria -->Digestivos<-- ha sido ingresada al sistema con éxito y listo para ser entregado a la dirección:" + " " + direccion);
					
			  }
				
		break;
			
		case 3:
			
			System.out.println(" ");
			System.out.println("--->Alivio de dolor<---");
			System.out.println(codigo7 + "-Dolor general (Dolex 500mg/tableta-10und)--- $7.000");
			System.out.println(codigo8 + "-Dolor general (Apronax 275mg/tableta-8und)--- $12.000");
			System.out.println(codigo9 + "-Dolor general (Aspirina efervecente 500mg/tableta-10und)--- $13.500");
			int listado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción a escojer"));
          
			    if (listado3 ==1) {
					
				
				System.out.println(" ");
				System.out.println("--------------------------------------------------------------FACTURA NÚMERO 007-----------------------------------------------------------------------------------------------------");
				System.out.println("|         USUARIO:" + " " + nombre_usuario + " " + apellidos_usuario);
				System.out.println("| NUMERO CONTACTO:" + " " + número_telefonico);
				System.out.println("|       DIRECCIÓN:" + " "  + direccion);
				System.out.println("|        PRODUCTO:" + "Dolex 500mg/tableta-10und)");
				System.out.println("|    VALOR PAGADO:" + " $7.000");
				System.out.println("|  SINTOMATOLOGÍA:" + " " + sintoma);
				System.out.println( "____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(" ");
				System.out.println(nombre_usuario + " " + apellidos_usuario + "," + " tu producto de la cátegoria -->Alivio de dolor<-- ha sido ingresada al sistema con éxito y listo para ser entregado a la dirección:" + " " + direccion);
					
			  }
				
				if (listado3 ==2) {
					
					
				System.out.println(" ");
				System.out.println("--------------------------------------------------------------FACTURA NÚMERO 008-----------------------------------------------------------------------------------------------------");
				System.out.println("|         USUARIO:" + " " + nombre_usuario + " " + apellidos_usuario);
				System.out.println("| NUMERO CONTACTO:" + " " + número_telefonico);
				System.out.println("|       DIRECCIÓN:" + " "  + direccion);
				System.out.println("|        PRODUCTO:" + " Apronax 275mg/tableta-8und)--- $12.000Apronax 275mg/tableta-8und)");
				System.out.println("|    VALOR PAGADO:" + " $12.000");
				System.out.println("|  SINTOMATOLOGÍA:" + " " + sintoma);
				System.out.println( "____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(" ");
				System.out.println(nombre_usuario + " " + apellidos_usuario + "," + " tu producto de la cátegoria -->Alivio de dolor<-- ha sido ingresada al sistema con éxito y listo para ser entregado a la dirección:" + " " + direccion);
					
			  }
		
				
				if (listado3 ==3) {
					
					
				System.out.println(" ");
				System.out.println("--------------------------------------------------------------FACTURA NÚMERO 009-----------------------------------------------------------------------------------------------------");
				System.out.println("|         USUARIO:" + " " + nombre_usuario + " " + apellidos_usuario);
				System.out.println("| NUMERO CONTACTO:" + " " + número_telefonico);
				System.out.println("|       DIRECCIÓN:" + " "  + direccion);
				System.out.println("|        PRODUCTO:" + " Aspirina efervecente 500mg/tableta-10und)");
				System.out.println("|    VALOR PAGADO:" + " $13.500");
				System.out.println("|  SINTOMATOLOGÍA:" + " " + sintoma);
				System.out.println( "____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(" ");
				System.out.println(nombre_usuario + " " + apellidos_usuario + "," + " tu producto de la cátegoria -->Alivio de dolor<-- ha sido ingresada al sistema con éxito y listo para ser entregado a la dirección:" + " " + direccion);
					
			  }	
		
		
	    break;
	    
		case 4:
			
			System.out.println(" ");
			System.out.println("--->Vitaminas y productos naturales<---");
			System.out.println(codigo10 + "-Articulos deportivos (Glucerna Vainilla)--- $9.000");
			System.out.println(codigo11 + "-Articulos deportivos (Proteina Funat x 50g)--- $6.000");
			System.out.println(codigo12 + "-Articulos deportivos (Gelimed Colágeno)--- $95.000");
			int listado4 = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción a escojer")); 
					

			    if (listado4 ==1) {
						
					
				System.out.println(" ");
				System.out.println("--------------------------------------------------------------FACTURA NÚMERO 010-----------------------------------------------------------------------------------------------------");
				System.out.println("|         USUARIO:" + " " + nombre_usuario + " " + apellidos_usuario);
				System.out.println("| NUMERO CONTACTO:" + " " + número_telefonico);
				System.out.println("|       DIRECCIÓN:" + " "  + direccion);
				System.out.println("|        PRODUCTO:" + "Glucerna Vainilla");
				System.out.println("|    VALOR PAGADO:" + " $9.000");
				System.out.println("|  SINTOMATOLOGÍA:" + " " + sintoma);
				System.out.println( "____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(" ");
				System.out.println(nombre_usuario + " " + apellidos_usuario + "," + " tu producto de la cátegoria -->Vitaminas y productos naturales<-- ha sido ingresada al sistema con éxito y listo para ser entregado a la dirección:" + " " + direccion);
						
				  }
					
	
				if (listado4 ==2) {
						
						
				System.out.println(" ");
				System.out.println("--------------------------------------------------------------FACTURA NÚMERO 011-----------------------------------------------------------------------------------------------------");
				System.out.println("|         USUARIO:" + " " + nombre_usuario + " " + apellidos_usuario);
				System.out.println("| NUMERO CONTACTO:" + " " + número_telefonico);
				System.out.println("|       DIRECCIÓN:" + " "  + direccion);
				System.out.println("|        PRODUCTO:" + " Proteina Funat x 50g");
				System.out.println("|    VALOR PAGADO:" + " $6.000");
				System.out.println("|  SINTOMATOLOGÍA:" + " " + sintoma);
				System.out.println( "____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(" ");
				System.out.println(nombre_usuario + " " + apellidos_usuario + "," + " tu producto de la cátegoria -->Vitaminas y productos naturales<-- ha sido ingresada al sistema con éxito y listo para ser entregado a la dirección:" + " " + direccion);
						
				  }

					
				if (listado4 ==3) {
						
						
				System.out.println(" ");
				System.out.println("--------------------------------------------------------------FACTURA NÚMERO 012-----------------------------------------------------------------------------------------------------");
				System.out.println("|         USUARIO:" + " " + nombre_usuario + " " + apellidos_usuario);
				System.out.println("| NUMERO CONTACTO:" + " " + número_telefonico);
				System.out.println("|       DIRECCIÓN:" + " "  + direccion);
				System.out.println("|        PRODUCTO:" + " Gelimed Colágeno");
				System.out.println("|    VALOR PAGADO:" + " $95.000");
				System.out.println("|  SINTOMATOLOGÍA:" + " " + sintoma);
				System.out.println( "____________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(" ");
				System.out.println(nombre_usuario + " " + apellidos_usuario + "," + " tu producto de la cátegoria -->Vitaminas y productos naturales<-- ha sido ingresada al sistema con éxito y listo para ser entregado a la dirección:" + " " + direccion);
						
				  }	
				
		break;
		
		case 5: 
			
			
			System.out.println("Escribenos tus observaciones relacionados con nuestros productos y atendermos tu inquietud de inmediato");
			System.out.println("Confirma la acción con (si), de lo contrario saldras de la app");
			String afirmacion = JOptionPane.showInputDialog("Digite la opción a escojer"); 
			
			    if(afirmacion.equalsIgnoreCase("si")) {
				
				String observaciones = JOptionPane.showInputDialog("Describenos los sintomas de salud que presentas por favor");
				System.out.println("");
				System.out.println(nombre_usuario + " " + apellidos_usuario + " recibimos tus observaciones y te haremos un reembolso del producto que has comprado mas seguimiento de tu condicion de salud a traves del reporte: " + "--> " +observaciones + " <--" + " " + "¡mil disculpas por las molestias causadas! :(");
				
			    }
		
		break;
			
		case 6:
			
			
			System.out.println("Hasta pronto," + " " + nombre_usuario + " " + apellidos_usuario + ", vuelve pronto :)");
			
		break;
			
		}
		
	}
}	
//-------------------------------------------------------------------Fin---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!