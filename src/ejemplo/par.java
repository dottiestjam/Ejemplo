/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class par {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Introduce un numero");
        numero = scan.nextInt();
        
        if( numero == 0){
            System.out.println("Es cero");   
        }
        
        else{
            float resultado = numero % 2; 
        
            if( resultado == 0 ){
                System.out.println("Numero es par");
            }
            else {
                System.out.println("Numero es impar");
            }
        }

    }
}
