/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Objetos.Fruta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erwin
 */
public class Principal2 {
    
    static List<Fruta> lstFrutas =  new ArrayList<>();
    
    public static void main(String[] args){
        lstFrutas.add(new Fruta("Sandía","Dulce", "Verde", "Ovalada"));
        lstFrutas.add(new Fruta("Manzana","Dulce", "Roja", "Ovalada"));
        lstFrutas.add(new Fruta("Manzana","Ácida", "Verde", "+- Ovalada"));
        
        for(Fruta item : lstFrutas){
            item.info();
        }
    }
}
