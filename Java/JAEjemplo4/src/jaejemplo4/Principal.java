/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaejemplo4;

import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class Principal {
    static String[][] usuarios = new String[3][10];
    static int cntUsr = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicializar();
        int op=0;
        Scanner leer = new Scanner(System.in);
        do{
            menu();
            op = leer.nextInt();
            switch (op){
                case 1:
                    crearUsuario();
                    break;
                case 2:
                    iniciarSesion();
                    break;
                case 3:
                    cambiarContrasenia();
                    break;
                case 4:
                    imprimirUsuario();
                    break;
                default:
                    break;
            }
            
        }while(op != 5);
    }
    
    public static void inicializar(){
        usuarios[0][0] = "Juan";
        usuarios[1][0] = "1234";
        usuarios[2][0] = "Juan García";
        
        usuarios[0][1] = "Daniel";
        usuarios[1][1] = "1234";
        usuarios[2][1] = "Daniel Choc";
        
        usuarios[0][2] = "Luis";
        usuarios[1][2] = "1234";
        usuarios[2][2] = "Luis Hernandez García";
        
        usuarios[0][3] = "Kevin";
        usuarios[1][3] = "1234";
        usuarios[2][3] = "Kevin Méndez";
        
        cntUsr = 4;
    }
    
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1) Crear usuario");
        System.out.println("2) Iniciar sesión");
        System.out.println("3) Cambiar contraseña");
        System.out.println("4) Imprimir usuarios");
        System.out.println("5) Salir");
    }
    
    public static void crearUsuario(){
        Scanner leer = new Scanner(System.in);
        System.out.println("\nIngrese el nombre de usuario:");
        usuarios[0][cntUsr] = leer.next();
        
        System.out.println("\nIngrese la contraseña del usuario:");
        usuarios[1][cntUsr] = leer.next();
        
        System.out.println("\nIngrese el nombre completo:");
        usuarios[2][cntUsr] = leer.next();
        
        cntUsr++;
    }
    
    public static void iniciarSesion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("\nINICIO DE SESIÓN");
        System.out.println("\nIngrese el nombre de usuario:");
        String usr = leer.next();
        
        System.out.println("\nIngrese la contraseña del usuario:");
        String pass = leer.next();
        int pos = -1;
        for(int x=0; x<cntUsr;x++){
            if (usuarios[0][x].equals(usr)){
                if (usuarios[1][x].equals(pass)){
                    pos=x;
                }
            }
        }
        
        if (pos>-1){
            System.out.println("Usuario y contraseña correcta.");
        }else{
            System.out.println("Usuario y contraseña incorrecta.");
        }
    }
    
    public static void cambiarContrasenia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("\nCAMBIO DE CONTRASEÑA");
        System.out.println("\nIngrese el nombre de usuario:");
        String usr = leer.next();
        
        System.out.println("\nIngrese la contraseña del usuario:");
        String pass = leer.next();
        int pos = -1;
        for(int x=0; x<cntUsr;x++){
            if (usuarios[0][x].equals(usr)){
                if (usuarios[1][x].equals(pass)){
                    pos=x;
                }
            }
        }
        
        if (pos>-1){
            System.out.println("Ingrese la nueva contraseña:");
            usuarios[1][pos] = leer.next();
        }else{
            System.out.println("Usuario y contraseña incorrecta.");
        }
    }
    
    public static void imprimirUsuario(){
        System.out.println("USUARIO\t\tPASS\tNOMBRE");
        for (int x = 0; x < cntUsr;x++){
            System.out.println(usuarios[0][x] + "\t\t" + usuarios[1][x] + "\t" + usuarios[2][x]);
        }
    }
    
}
