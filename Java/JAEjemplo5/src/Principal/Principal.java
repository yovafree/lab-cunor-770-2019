/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Objetos.Fruta;

/**
 *
 * @author erwin
 */
public class Principal {
    static Fruta[] lstFrutas = new Fruta[10];
    
    
    public static void main(String[] args){
        lstFrutas[0] = new Fruta();
        lstFrutas[0].color = "Roja";
        lstFrutas[0].forma = "+- Redonda";
        lstFrutas[0].nombre = "Manzana";
        lstFrutas[0].sabor = "Dulce";
        
        lstFrutas[1] = new Fruta();
        lstFrutas[1].color = "Verde";
        lstFrutas[1].forma = "+- Redonda";
        lstFrutas[1].nombre = "Manzana Verde";
        lstFrutas[1].sabor = "Ácida";
        
        lstFrutas[2] = new Fruta("Sandía","Dulce", "Verde", "Ovalada");
        lstFrutas[3] = new Fruta("Fresa","Dulce", "Roja", "Ovalada");
        lstFrutas[4] = new Fruta("Mango","Dulce", "Amarillo", "Ovalado");
        int pos =5;
        
        
        for(int x=0;x<pos;x++){
            lstFrutas[x].info();
        }
    }
}
