/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaejemplo1;

import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class Principal3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("1) El mayor de 2 números");
        System.out.println("2) El mayor de 3 números");
        int num = leer.nextInt();
        
        switch(num){
            case 1:
                System.out.println("Opción 1");
                break;
            case 2:
                int num1;
                int num2;
                int num3;

                System.out.println("Ingrese el primer número");
                num1 = leer.nextInt();

                System.out.println("Ingrese el segundo número");
                num2 = leer.nextInt();

                System.out.println("Ingrese el tercer número");
                num3 = leer.nextInt();

                // Bloque para determinar el mayor de tres números
                if (num1>num2){
                    if(num1>num3){
                        System.out.println("El mayor es: " + num1);
                    }else{
                        System.out.println("El mayor es: " + num3);
                    }
                }else{
                    if(num2>num3){
                        System.out.println("El mayor es: " + num2);
                    }else{
                        System.out.println("El mayor es: " + num3);
                    }
                }
                break;
            default:
                System.out.println("Opción Default");
                break;
        }
    }
}
