
package boletin2_7;

import java.util.Scanner;

public class Boletin2_7 {

    public static void main(String[] args) {
    
        float centigrado;
        Scanner entradagrados = new Scanner (System.in);
        
        System.out.println("Introduzca los grados centigrados para pasarlos a grados Kelvin y grados Farenheit");
        
        centigrado=entradagrados.nextFloat();
        
        System.out.println("Son tantos grados Kelvin " + (centigrado + 273) + " son tantos grados Farenheit " + (1.8*centigrado +32));
    }
    
}
