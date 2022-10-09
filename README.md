# U2-Hoja-3-EJERCICIO-2
Definir un numero por usuari@ y meterle constructores en JAVA get y set para realizar operaciones.


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
 
 
```java
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
      int numero;      
      System.out.print("\n\n * Valor inicial del Numero Interno: ");
      Numero n0=new Numero(); 
      n0.getNumeroInterno();
      System.out.print(""+n0.getNumeroInterno()+"\n");    
      Scanner teclado = new Scanner(System.in); 
      System.out.print("\nIntroduce un numero: "); 
      int numeroUser = teclado.nextInt();                          
      Numero n2=new Numero();
      numeroUser=n2.getNumeroInterno(numeroUser);
      System.out.print("\n* Nuevo Valor para Numero Interno: ");
      System.out.println(numeroUser); 
      Scanner teclado2 = new Scanner(System.in); 
      System.out.print("Sumale un numero + "); 
      int numeroSumado = teclado2.nextInt(); 
      int resultadoSumar = numeroUser+numeroSumado;
      System.out.println("Numero Interno ("+numeroUser+") + "+numeroSumado+" = "+resultadoSumar+"\n"); 
      Scanner teclado3 = new Scanner(System.in); 
      System.out.print("Resta el numero - "); 
      int numeroRestado = teclado3.nextInt(); 
      int resultadoResta = resultadoSumar-numeroRestado;
      System.out.println("Numero Interno "+numeroUser+" - "+numeroRestado+" = "+resultadoResta+"\n"); 
      System.out.print(" * Valor devuelto del Numero Interno: ");  
      Numero n1=new Numero(); 
      n1.setNumeroInterno(n1.variarNumeroInterno);
      int numeroInterno = resultadoResta;
      System.out.println(numeroInterno); 
      System.out.print(" * Valor doble para Numero Interno: ");  
      Numero n22=new Numero(); 
      n22.setNumeroInterno(n22.numeroDoble);
      System.out.println(numeroInterno*2); 
      System.out.print(" * Valor triple del Numero Interno: ");  
      Numero n33=new Numero(); 
      n33.setNumeroInterno(n33.numeroTriple);
      System.out.println(numeroInterno*3+"\n\n"); 
  
    }
}

```
![Captura de pantalla 2022-10-09 130243](https://user-images.githubusercontent.com/80227002/194753644-f6f9c4f5-7322-47ce-93ca-66c6d5ab4421.png)

```java
class Numero {
    private final int numeroInterno;
     int numero,numeroParametro,numeroSuma,numeroResta,valorNumeroInterno,variarNumeroInterno,numeroTriple,numeroDoble;
     Numero(){this.numeroInterno=numero;}    
     public int getNumeroInterno(){return numeroInterno;}
     public int getNumeroInterno(int numeroParametro){return numeroParametro;}
     public Numero(int numeroInterno){this.numeroInterno=numeroInterno; }    
     public void setNumeroInterno(int numeroInterno){this.numero=numeroInterno;}  
     public int setNumeroSuma(){return numeroInterno + numeroSuma;} 
     public int setNumeroResta(){return numeroResta - numeroInterno;} 
     public int setValorNumeroInterno(){return valorNumeroInterno;}
     public void setVariarNumero(int variarNumero){this.variarNumeroInterno=variarNumero;}
     public void setDoble(int numeroDoble){this.numeroDoble=numeroInterno*2;}
     public void setTriple(int numeroTriple){this.numeroTriple=numeroInterno*3;}
     } 
```
