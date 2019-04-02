/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaejemplo2;

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
        
        
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
        tabla_multiplicar(numero);
        
        tablas_multiplicar();
    }
    
    public static void tabla_multiplicar(int n){
        for(int x=1;x<=10;x=x+1){
            System.out.println(n + " * " + x + " = " + (n*x));
        }
    }
    
    public static void tablas_multiplicar(){
        for(int x=1;x<=10;x=x+1){
            for(int y=1;y<=10;y=y+1){
                System.out.println(x + " * " + y + " = " + (y*x));
            }
        }
    }
    
    
    
}
