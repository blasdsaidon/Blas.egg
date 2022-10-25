/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import entidades.Almacen;
import java.util.Comparator;

/**
 *
 * @author blasd
 */
public class ComparadoresAlmacen {
    public static Comparator<Almacen> alfabetico=new Comparator<Almacen>(){
        @Override
        public int compare(Almacen p1, Almacen p2) {
             return p1.getNombreProducto().compareTo(p2.getNombreProducto());
        }
    
    
};
}
