/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaejemplo2;

/**
 *
 * @author erwin
 */
public class Principal2 {
    public static void main(String[] args) {
        int n = 1;
        
        // Ciclo Do While
        
        do{
            System.out.println(n);
            n++;
            
        }while(n<=100);
        
        do{
            System.out.println(n);
            n--;
            
        }while(n>=1);
        
        
        // Ciclo While
        while(n<=100){
            System.out.println(n);
            n++;
        }
        
        while(n>=1){
            System.out.println(n);
            n--;
        }
    }
}
