/**
 * @author Daw120
 
  2.- Define una clase Numero que almacene un número entero y tenga 
       las siguientes características:
        
  • Un constructor por defecto que inicializa a 0 el número interno
  • Constructor que inicializa el número interno con un número pasado por 
    parámetro.
  • Método suma que permite sumarle un número al valor interno.
  • Método resta que resta un número al valor interno.
  • Método que devuelva el valor del número interno.
  • Método doble que devuelve el doble del valor interno. 
  • Método triple que devuelve el triple del número interno. 
  • Método que permita variar el valor del valor interno. 
  
En el programa principal genera un objeto de tipo Numero y prueba todos sus 
métodos.
 */
package com.solomongo.ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
      int numero;
      
      System.out.print("\n\n * Valor inicial del Numero Interno: ");
      Numero n0=new Numero(); 
      n0.getNumeroInterno();
      System.out.print(""+n0.getNumeroInterno()+"\n");
      
      // ENTRADA      
      Scanner teclado = new Scanner(System.in); 
      System.out.print("\nIntroduce un numero: "); 
      int numeroUser = teclado.nextInt();                          
      Numero n2=new Numero();
      numeroUser=n2.getNumeroInterno(numeroUser);
 
      System.out.print("\n* Nuevo Valor para Numero Interno: ");
      System.out.println(numeroUser); 
      System.out.println("\n-------------- OPERACIONES:-----------------\n");
 
      // SUMA
      Scanner teclado2 = new Scanner(System.in); 
      System.out.print("Sumale un numero + "); 
      int numeroSumado = teclado2.nextInt(); 
      int resultadoSumar = numeroUser+numeroSumado;
      System.out.println("Numero Interno ("+numeroUser+") + "+numeroSumado+" = "+resultadoSumar+"\n"); 
        
      // RESTA
      Scanner teclado3 = new Scanner(System.in); 
      System.out.print("Resta el numero - "); 
      int numeroRestado = teclado3.nextInt(); 
      int resultadoResta = resultadoSumar-numeroRestado;
      System.out.println("Numero Interno "+numeroUser+" - "+numeroRestado+" = "+resultadoResta+"\n"); 
        
      // DEVUELVE
      System.out.print(" * Valor devuelto del Numero Interno: ");  
      Numero n1=new Numero(); 
      n1.setNumeroInterno(n1.variarNumeroInterno);
      int numeroInterno = resultadoResta;
      System.out.println(numeroInterno); 
         
      // DOBLE
      System.out.print(" * Valor doble para Numero Interno: ");  
      Numero n22=new Numero(); 
      n22.setNumeroInterno(n22.numeroDoble);
      System.out.println(numeroInterno*2); 
         
      // TRIPLE
      System.out.print(" * Valor triple del Numero Interno: ");  
      Numero n33=new Numero(); 
      n33.setNumeroInterno(n33.numeroTriple);
      System.out.println(numeroInterno*3+"\n\n"); 
  
    }
}
