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
public class mayor {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        System.out.println("Introduce un numero");
        n1 = scan.nextInt();
        System.out.println("Introduce un numero");
        n2 = scan.nextInt();
        System.out.println("Introduce un numero");
        n3 = scan.nextInt();
        
        if(n1 > n2 && n1>n3){
            System.out.println(n1+"Es el mayor");
        }
        
        if(n1 < n2 && n1 < n3){
            System.out.println(n1+"Es el menor");
        }
        
        if(n2 > n1 && n2 > n3){
            System.out.println(n2+"Es el mayor");
        }
        
        if(n2 < n1 && n2 < n3){
            System.out.println(n2+"Es el menor");
        }
        
        if(n3 > n1 && n3 > n2){
            System.out.println(n3+"Es el mayor");
        }
        
        if(n3 < n1 && n3 < n2){
            System.out.println(n3+"Es el menor");
        }
        
        
    }
    
}
