/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Objetos.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class Principal3 {
    static List<Persona> lstPersonas = new ArrayList<>();
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args){
        lstPersonas.add(new Persona("48383","Juan Diego","Solares","848394","4ra. Ave 3-24"));
        lstPersonas.add(new Persona("899203","José","Solares","848394","4ra. Ave 3-24"));
        lstPersonas.add(new Persona("949432","Alvaro","García","848394","4ra. Ave 3-24"));
        lstPersonas.add(new Persona("112484","Luis","Alvarado","848394","4ra. Ave 3-24"));
        
        int op = 0;
        do{
            menu();
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    addPersona();
                    break;
                case 3:
                    buscarPersona();
                    break;
                case 4: 
                    imprimirLista();
                    break;
                default:
                    break;
            }
            
        }while(op != 5);
    }
    
    public static void addPersona(){
        Persona nuevo = new Persona();
        String res = "";
        System.out.println("Ingrese el DPI: ");
        res = leer.next();
        nuevo.setDpi(res);
        
        System.out.println("Ingrese los nombres: ");
        res = leer.next();
        nuevo.setNombres(res);
        
        System.out.println("Ingrese los apellidos: ");
        res = leer.next();
        nuevo.setApellidos(res);
        
        System.out.println("Ingrese el teléfono: ");
        res = leer.next();
        nuevo.setTelefono(res);
        
        System.out.println("Ingrese la dirección:");
        res = leer.next();
        nuevo.setDireccion(res);
        
        lstPersonas.add(nuevo);
    }
    
    public static void imprimirLista(){
        for(Persona item: lstPersonas){
            System.out.println("DPI: "+ item.getDpi() + "\t NOMBRES: "+item.getNombres()
            + "\t APELLIDOS " + item.getApellidos());
        }
    }
    
    public static void buscarPersona(){
        System.out.println("\nIngrese el téxto de búsqueda: ");
        String busqueda = leer.next();
        //Persona encontrado = null;
        
        for(Persona item: lstPersonas){
            if (item.getDpi().contains(busqueda) || 
                    item.getNombres().contains(busqueda) ||
                    item.getApellidos().contains(busqueda)){
                System.out.println("DPI: "+ item.getDpi() + "\t NOMBRES: "+item.getNombres()
            + "\t APELLIDOS " + item.getApellidos());
            }
            
        }
    }
    
    public static void menu(){
        System.out.println("MENÚ");
        System.out.println("1) Nueva persona");
        System.out.println("2) Editar persona");
        System.out.println("3) Buscar persona");
        System.out.println("4) Imprimir listado de personas");
        System.out.println("5) Salir");
        System.out.println("Ingrese la opción que desea realizar:");
    }
}
