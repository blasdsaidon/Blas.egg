/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Comparadores.ComparadoresAlmacen;
import entidades.Almacen;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ServiciosAlmacen {
   HashMap<String,Almacen> productos = new HashMap();
   Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
   
   public void menu(){
       Integer opcion;
       do{
        System.out.println("0 = salir del programa");
            System.out.println("1 = Agregar Producto");
            System.out.println("2 = Cambiar Precio");
            System.out.println("3 = eliminar Producto");
            System.out.println("4 = mostrar Productos");
            System.out.println("5 = mostrar Productos por orden Alfabetico");
            System.out.println("ingrese opcion....");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    modificaPrecio();
                    break;
                case 3:
                    eliminaProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    ordenAlfabetico();
                    break;
            }
                
            
                  
   }while(opcion!=0);
   }
   public void agregarProducto(){
       
       System.out.println("Ingrese un producto");
       String key = leer.next();
       System.out.println("Ingrese precio");
       Integer precio = leer.nextInt();
       Almacen A1=new Almacen(precio,key);
       productos.put(key, A1);
       System.out.println("¿Agregar otro producto S/N?");
       String opcion=leer.next();
       if(opcion.equalsIgnoreCase("s")){
           agregarProducto();
       }
       
   }
   
   public void mostrarProductos(){
       for (Map.Entry<String, Almacen> lista : productos.entrySet()) {
           String key = lista.getKey();
           Almacen value = lista.getValue();
           System.out.println("----------");
           System.out.println(key+" "+value.getPrecio());
       }
   }
   public void ordenAlfabetico(){
       ArrayList<Almacen> listaProductos=new ArrayList(productos.values());
       listaProductos.sort(ComparadoresAlmacen.alfabetico);
       for (Almacen aux : listaProductos) {
           System.out.println("------");
           System.out.println(aux.getNombreProducto()+" "+aux.getPrecio());
           
       }
   }
   public void modificaPrecio(){
       System.out.println("Ingrese el nombre del producto a modificar");
       String nombre=leer.next();
       if(productos.containsKey(nombre)){
           Almacen a1=productos.get(nombre);
           System.out.println("Precio actual: "+a1.getPrecio());
           System.out.println("ingrese nuevo precio");
           a1.setPrecio(leer.nextInt());
           productos.replace(nombre,a1);
           System.out.println("modificado con éxito");
           
       }else{
           System.out.println("El producto no está en la lista");
       }
   }
   public void eliminaProducto(){
       System.out.println("Ingrese el nombre del producto a modificar");
       String nombre=leer.next();
       if(productos.containsKey(nombre)){
           productos.remove(nombre);
           System.out.println("Eliminado con éxito");
       }else{
           System.out.println("El producto no está en la lista");
       }
   }
}

