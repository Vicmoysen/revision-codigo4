package com.generation;

import java.util.Scanner;
/*
El código es un juego de papel y tijeras que funciona con dos jugadores:
Cada uno debe ingresar la opcion piedra, papel o tijeras. Pueden estar en mayusculas o con espacio al final, si es otra palabra marca error.
Si la palabra coincide entonces es un empate. 
*/
public class Codigo4 {
	// No estaba creado el método Main
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);  // Faltaba importar Scanner e iniciar el constructor con System.in
		    System.out.println("Turno del jugador 1 (Introduzca piedra, papel o tijeras): "); // Cambie print por println
		    String player1 = scanner.nextLine().trim().toLowerCase();  // Cambie nombre de variables a nombres más significativos
		    // Elimine espacios del final con trim y converti a minusculas 
		    System.out.println("Turno del jugador 2 Introduzca piedra, papel o tijeras): "); // Decía Jugador 1, cambie a 2. | Cambie print por println
		    // Elimine el segundo escaner 
		    String player2 = scanner.nextLine().trim().toLowerCase();  
		    
		    if (player1.equals(player2)) {  // Sobraba un parentesis en if y cambie condicion == por equals
		      System.out.println("Empate");
		    } else {
		      String g = "2"; // Cambie por String para poder mostrar error 
		      switch(player1) {
		        case "piedra":
		          if (player2.equals("tijeras")) { // Cambie == por equals
		            g = "1";
		          }

		        case "papel":
		          if (player2.equals("piedra")) { // Cambie == por equals
		            g = "1";
		          } // Faltaba llave que cerraba el if
		          
		        case "tijeras": // Decía tijera cambie a tijeras para que fuera igual en todos
		          if (player2.equals("papel")) {
		            g = "1";
		          }
		          break;
		        default:   // Faltaba completar default, añadi default para opciones incorrectas
		        	System.out.println("Opciones ingresadas incorrectas");
		        	g = "Error!";
		        break;
		      }
		      System.out.println("Gana el jugador " + g);
		
		     }
		    scanner.close(); // Cerre el Scanner
		    
	}
		   
}

   

  
  
