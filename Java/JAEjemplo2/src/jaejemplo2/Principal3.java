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
public class Principal3 {
    public static void main(String[] args) {
        //Serie Fibonacci
        // 0 1 1 2 3 5 8 13 21 34
        int a=1;
        int b=0;
        for (int x=1;x<=15;x++){
            System.out.print(b + " ");
            a = a +b;
            b = a - b;
        }
        
        int n=1;
        a=1;
        b=0;
        System.out.print("\n");
        do{
            System.out.print(b + " ");
            a = a +b;
            b = a - b;
            n++;
        }while(n<=8);
        
        n=1;
        a=1;
        b=0;
        System.out.print("\n");
        while(n<=8){
            System.out.print(b + " ");
            a = a +b;
            b = a - b;
            n++;
        }
    }
}
