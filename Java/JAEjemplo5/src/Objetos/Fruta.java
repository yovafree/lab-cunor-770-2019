/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author erwin
 */
public class Fruta {
    public String color;
    public String sabor;
    public String nombre;
    public String forma;
    
    /***
     * Constructor principal
     */
    public Fruta(){
        this.color = "";
        this.sabor = "";
        this.nombre = "";
        this.forma = "";
    }
    
    /***
     * Constructor que permite inicializar variables.
     * @param nombre
     * @param sabor
     * @param color
     * @param forma 
     */
    public Fruta(String nombre, String sabor, String color, String forma){
        this.color = color;
        this.sabor = sabor;
        this.nombre = nombre;
        this.forma = forma;
    }
    
    /***
     * Imprimir la info del objeto
     */
    public void info(){
        System.out.println("\nNombre: " + this.nombre);
        System.out.println("Color: " + this.color);
        System.out.println("Sabor: " + this.sabor);
        System.out.println("Forma: " + this.forma);
    }
}
