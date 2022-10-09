/**
 * @author Daw120
 */
package com.solomongo.ejercicio2;
class Numero {
    private final int numeroInterno;
    
     // VARIABLES
     int numero, numeroParametro, 
         numeroSuma,numeroResta,
         valorNumeroInterno, 
         variarNumeroInterno,
         numeroTriple, numeroDoble;

     // CONSTRUCTORES
     Numero(){
       this.numeroInterno=numero; 
       }
      
     public int getNumeroInterno(){ // constructor default inicializa a 0 el número interno
       return numeroInterno;
       }
     
     public int getNumeroInterno(int numeroParametro){ // constructor que inicializa el número interno con un número pasado por parámetro
       return numeroParametro;
       }
     
     public Numero(int numeroInterno){                               
       this.numeroInterno=numeroInterno;                                    
       }    
     
     // METODOS SET
     public void setNumeroInterno(int numeroInterno)
        {
        this.numero=numeroInterno; //dice que el atributo nom: se almacena en el primero: nombre.
        }
     
     public int setNumeroSuma(){ // metodo suma que permite sumarle un número al valor interno
        return numeroInterno + numeroSuma;    
        } 
     
     public int setNumeroResta(){ // metodo resta que permite restarle un número al valor interno
        return numeroResta - numeroInterno;    
        } 
     
     public int setValorNumeroInterno(){  // metodo que devuelva el valor del número interno  
        return valorNumeroInterno;
        }
     
     public void setVariarNumero(int variarNumero){ // metodo que permita variar el valor del valor interno
        this.variarNumeroInterno=variarNumero; 
        }

     public void setDoble(int numeroDoble){ // metodo que permita variar el valor del valor interno
        this.numeroDoble=numeroInterno*2; 
        }
     
     public void setTriple(int numeroTriple){ // metodo que permita variar el valor del valor interno
        this.numeroTriple=numeroInterno*3; 
        }


} 
                     
     

