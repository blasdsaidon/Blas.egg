/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Asiento;
import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Filas;
import Entidades.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author blasd
 */
public class ServiciosCine {
    String[] fila={"A","B","C","D","E","F","G","H","I","J"};
    Cine cine=new Cine();
    public void abrirCine(){
        
        Asiento[][] s=new Asiento[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                String a= String.valueOf(8-i);
                String b= fila[j];
                s[i][j]=new Asiento(null,a+b);
                
            }
           
            
        }
        cine.setSala(s);
    }
    public void mostrarSala(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if(cine.getSala()[i][j].getEspe()!=null){
                    System.out.print("| "+cine.getSala()[i][j].getPosicion()+cine.getSala()[i][j].getEspe().getNombre()+"  |");
                }else{
                    System.out.print("| "+cine.getSala()[i][j].getPosicion()+"         |");   
                }
            }
            System.out.println(" ");
        }
            
        
    }
    public ArrayList<Espectador> crearEspectador(){
        ArrayList<Espectador> espe=new ArrayList();
        String num;
        for (int i = 0; i < 120 ; i++) {
           if(i<9){
               num="00"+(i+1);
           }else if(i>=9&&i<99){
               num="0"+(i+1);
               
           }else num=String.valueOf(i+1);
           Espectador e = new Espectador(" Es "+num,1+(int)(Math.random()*90),(int)(Math.random()*4400));
           espe.add(e);
            
        }
        return espe;
    }
    public void mostrarEspec(ArrayList<Espectador> espectadores){
        System.out.println("-----------------------");
        for (Espectador string : espectadores) {
            
            System.out.println(string);
                    }
        System.out.println("-----------------------");
    }
    public void Funcion(){
        Pelicula peli= new Pelicula("Marsopas", "Miguelo", 500 , 18);
        cine.setPeli(peli);
        cine.setPrecio(800);
        System.out.println("Hoy presentamos: "+peli);
    }
    
    
    public void llenarCine(){
        ArrayList<Espectador> espectadores=crearEspectador();
        mostrarEspec(espectadores);
        Funcion();
        int precio = cine.getPrecio();
        int edad = cine.getPeli().getEdadMinima();
        int cont=0;
        for (Espectador aux : espectadores) {
            
            if (aux.getEdad()>edad && aux.getDineroDisponible()>=precio){
                int i;
                int j;
                cont++;
               do{
                i=(int)(Math.random()*8);
                j=(int)(Math.random()*6);
               }
               while(cine.getSala()[i][j].getEspe()!=null&&cont<=48);
               
                       if(cont<=48){
                               cine.getSala()[i][j].setEspe(aux);
                       
                       } else break;
                           
                       
                          
            }
            
        }
        if(cont>=48){
            System.out.println("Sala completa");
        }
    }
}
