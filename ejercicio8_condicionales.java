//-------------------------------------------------------------Asignaci�n_importaci�n_paquetes---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!
package ejercicios_condicionales_Java;
import java.util.Scanner;
import javax.swing.*;

//-------------------------------------------------------------------Definir_variables----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!	
public class ejercicio8_condicionales {
	public static void main(String[] args) {
		
     Scanner menu = new Scanner (System.in);
     
     String torta1_disponible = ("Chocolate");
 	 String torta2_disponible = ("Vainilla");
 	 String torta3_disponible = ("Fresa");
	
//--------------------------------------------------------------------Ejecuci�n_c�digo----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!
		
     System.out.println("|----->Bienvenido a la app PasteleriaDonCarlos<-----|");
     System.out.println(" ");
     String nombre_usuario = JOptionPane.showInputDialog("Digita nombre completo por favor.");
     String direccion = JOptionPane.showInputDialog("Digita direcci�n de domicilio por favor.");
     String n�mero_telefonico = JOptionPane.showInputDialog("Digita n�mero telefonico por favor.");
     String correo_electr�nico = JOptionPane.showInputDialog("Digita correo electr�nico de contacto por favor.");
     int desici�n = Integer.parseInt(JOptionPane.showInputDialog("Digita 1 para continuar por favor."));
     
         if(desici�n == 1) {
    	 
    	         System.out.println("--->�Te damos la bienvenida al men�!<--- ");
                 System.out.println("1---       Chocolate ---> $5000 ");
                 System.out.println("2---       Vainilla  ---> $5000  ");
                 System.out.println("3---        Fresa    ---> $5000 ");
                 System.out.println("4--- Torta personalizada ---> $8000 ");
                 System.out.println("5--- Consultar tortas disponibles. ");
                 System.out.println("6--- Ventas diarias realizadas. ");
                 System.out.println("7---          Salir            ");
                 System.out.println(" ");
                 System.out.println("Por favor, cuentanos �De que sabor deseas en las torta? ");
                 String sabor_torta = JOptionPane.showInputDialog("Escribe el sabor de la torta deseada.");
                 int opciones = Integer.parseInt(JOptionPane.showInputDialog("Oprime la opci�n n�merica deseada? "));
         
         
         switch (opciones) {
         
         case 1 :
        	
        	 if (sabor_torta.equalsIgnoreCase("chocolate")) {
        		 
        		 String porciones = JOptionPane.showInputDialog("Escribe la cantidad de porciones deseadas por favor.");
        		 System.out.println(" ");
        		 String decoraci�n = JOptionPane.showInputDialog("Deseas adiccionar decoraci�n a las tortas (Si/No)");
        		 System.out.println(" ");
        		 
        		 System.out.println("|------------------------------------------REGISTRO DE VENTA_001---------------------------------------------------------|");
        		 System.out.println("|" + "NOMBRE CLIENTE:" + nombre_usuario);
        		 System.out.println("|" + "DIRECCI�N:" +  direccion);
        		 System.out.println("|" + "N�MERO TELEFONICO:"+ n�mero_telefonico);
        		 System.out.println("|" + "CORREO ELECTR�NICO:" + correo_electr�nico);
        		 System.out.println("|" + "TIPO DE TORTA:" + torta1_disponible);
        		 System.out.println("|" + "PORCIONES:" + porciones);
        		 System.out.println("|" + "DECORACI�NES:"+ decoraci�n);
        		 System.out.println("|"+ "PRECIO: $5000");
        		 System.out.println("|________________________________________________________________________________________________________________________|");
        		 System.out.println("NOTA: Este mensaje sera notificado via SMS y por correo registrado en la app para su posteriro p�go de pedido");
        		 
        	 }
        	 
        	 System.out.println(" ");
        	 
        	 break;
        	 
         case 2 :
        	 
        	 if (sabor_torta.equalsIgnoreCase("vainilla")) {
        		
        	     String porciones = JOptionPane.showInputDialog("Escribe la cantidad de porciones deseada por favor.");
    		     System.out.println(" ");
    		     String decoraci�n = JOptionPane.showInputDialog("Deseas adiccionar decoraci�n a las tortas (Si/No)");
    		     System.out.println(" ");
    		 
    		     System.out.println("|------------------------------------------REGISTRO DE VENTA_002---------------------------------------------------------|");
    		     System.out.println("|" + "NOMBRE CLIENTE:" + nombre_usuario);
    		     System.out.println("|" + "DIRECCI�N:" +  direccion);
    		     System.out.println("|" + "N�MERO TELEFONICO:"+ n�mero_telefonico);
    		     System.out.println("|" + "CORREO ELECTR�NICO:" + correo_electr�nico);
    		     System.out.println("|" + "TIPO DE TORTA:" + torta2_disponible);
    		     System.out.println("|" + "PORCIONES:" + porciones);
    		     System.out.println("|" + "DECORACI�NES:"+ decoraci�n);
    		     System.out.println("|"+ "PRECIO: $5000");
    		     System.out.println("|________________________________________________________________________________________________________________________|");
    		     System.out.println("NOTA: Este mensaje sera notificado via SMS y por correo registrado en la app para su posteriro p�go de pedido");
        	 
        	}
        	
        	 System.out.println(" ");
        	 
        	 break;
        	 
         case 3 :
        	 
        	 if (sabor_torta.equalsIgnoreCase("fresa")) {
         		
            	 String porciones = JOptionPane.showInputDialog("Escribe la cantidad de porciones deseada por favor.");
        		 System.out.println(" ");
        		 String decoraci�n = JOptionPane.showInputDialog("Deseas adiccionar decoraci�n a las tortas (Si/No)");
        		 System.out.println(" ");
        		 
        		 System.out.println("|------------------------------------------REGISTRO DE VENTA_003---------------------------------------------------------|");
        		 System.out.println("|" + "NOMBRE CLIENTE:" + nombre_usuario);
        		 System.out.println("|" + "DIRECCI�N:" +  direccion);
        		 System.out.println("|" + "N�MERO TELEFONICO:"+ n�mero_telefonico);
        		 System.out.println("|" + "CORREO ELECTR�NICO:" + correo_electr�nico);
        		 System.out.println("|" + "TIPO DE TORTA:" + torta2_disponible);
        		 System.out.println("|" + "PORCIONES:" + porciones);
        		 System.out.println("|" + "DECORACI�NES:"+ decoraci�n);
        		 System.out.println("|"+ "PRECIO: $5000");
        		 System.out.println("|________________________________________________________________________________________________________________________|");
        		 System.out.println("NOTA: Este mensaje sera notificado via SMS y por correo registrado en la app para su posteriro p�go de pedido");
            	 
            	}
        	 
            	 System.out.println(" ");
            	 
        	 break;
        	 
         case 4 :
        	 
        	     System.out.println("Se ha identificado que el sabor escojido no se encuentra dentro del men�, si lo deseas te preparamos la torta de sabor: " + sabor_torta + " con un incremento de $ 3000");
        	     System.out.println("�Deseas obtener tu pedido? oprime 1 por favor");
        	     int pedido = Integer.parseInt(JOptionPane.showInputDialog("Oprime 1 para confirmar por favor "));
        	     System.out.println(" ");
        	     
        	     String porciones = JOptionPane.showInputDialog("Escribe la cantidad de porciones deseada por favor.");
        		 System.out.println(" ");
        		 String decoraci�n = JOptionPane.showInputDialog("Deseas adiccionar decoraci�n a las tortas (Si/No)");
        		 System.out.println(" ");
        		 
        		 System.out.println("|------------------------------------------REGISTRO DE VENTA_004---------------------------------------------------------|");
        		 System.out.println("|" + "NOMBRE CLIENTE:" + nombre_usuario);
        		 System.out.println("|" + "DIRECCI�N:" +  direccion);
        		 System.out.println("|" + "N�MERO TELEFONICO:"+ n�mero_telefonico);
        		 System.out.println("|" + "CORREO ELECTR�NICO:" + correo_electr�nico);
        		 System.out.println("|" + "TIPO DE TORTA:" + sabor_torta);
        		 System.out.println("|" + "PORCIONES:" + porciones);
        		 System.out.println("|" + "DECORACI�NES:"+ decoraci�n);
        		 System.out.println("|"+ "PRECIO: $8000");
        		 System.out.println("|________________________________________________________________________________________________________________________|");
        		 System.out.println("NOTA: Este mensaje sera notificado via SMS y por correo registrado en la app para su posteriro p�go de pedido");
        	     
        	 
        	 System.out.println(" ");
        	 
        	 break;
        	 
         case 5 :
        	 
        	 System.out.println("Se encuentran los siguientes sabores de tortas:");
        	 System.out.println(" ");
        	 System.out.println("-->Chocolate<--");
        	 System.out.println( "-->Vainilla<--");
        	 System.out.println("-->Fresa<--");
        	 System.out.println("-->Sabor personalizado<--");
        	 
        	 System.out.println(" ");
        	 
        	 break;
        	 
         case 6 :
        	 
        	 System.out.println("�Deseas conocer la cantidad de ventas? oprime 1  para confimar , oprime 0 sin no has realizado ventas por favor");
        	 System.out.println(" ");
        	 int ventas = Integer.parseInt(JOptionPane.showInputDialog("Oprime 1 para confirmar por favor "));
        	 
        	 if (ventas == 1) {
        		 
        		 System.out.println(" ");
        		 System.out.println("Al menos 1 venta has realizado en el dia de hoy :) ");
        		 
        	 }
        	 else {
        		 
        		 System.out.println(" ");
        		 System.out.println("Has realizado 0 ventas el dia de hoy :( ");
        		 
        	 }
        	 
        	 System.out.println(" ");
        	 
        	 break;
        	 
         case 7 :
        	 
        	 System.out.println(" ");
        	 System.out.println("Hasta pronto, �danos el gusto de volver a atenderte! :D");
        	 
        	 break;
        	 
         }
    	 
     }
  
  }

}
//----------------------------------------------------------------------------Fin---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------!