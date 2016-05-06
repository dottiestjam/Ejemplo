/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Mayo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CESUN Universidad");
        
        Scanner leer = new Scanner(System.in);
        String Cadena = "";
        int Numero = 0;
        
        System.out.print("Guardar la siguiente cadena:");
        Cadena = leer.next();
        System.out.println(Cadena);
        
        System.out.print("Ingresa un Numero Entero: ");
        Numero = leer.nextInt();
        System.out.println(Numero);
        
        for(int i=1; i<=Numero; i++)
        {
            System.out.println(i);
        }
        
        if(Numero >= 10)
        {
            System.err.println("El numero " + Numero + "Es mayor o igual que 10");
        }
        else
        {
            System.err.println("El numero " + Numero + "Es menor que 10");
        }
        
    }
    
}