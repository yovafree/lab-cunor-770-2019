/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaejemplo3;

import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la palabra");
        
        String palabra = leer.next();
        String palindromo = "";
        
        for(int x=palabra.length()-1;x>=0;x--){
            palindromo = palindromo + palabra.charAt(x);
        }
              
        if (palabra.equals(palindromo)){
            System.out.println("Es un palindromo");
        }else{
            System.out.println("No es un palindromo");
        }
        
        
    }
    
}
