/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaejemplo1;

/**
 *
 * @author erwin
 */
public class Principal {
    static int num11 = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // int, double, float, String, char
        int num1=3;
        int num2=7;
        int suma = num1+num2;
        int resta = num1-num2;
        int multi = num1*num2;
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multi);

        if(num1>num2){
            System.out.println("El mayor es: "+num1);
        }else{
            System.out.println("El mayor es: "+num2);
        }

    }

}
