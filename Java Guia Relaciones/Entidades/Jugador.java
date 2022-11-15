/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class Jugador {
    private int ID;
    private String nombre;
    private boolean mojado;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Jugador() {
    }

    public Jugador(int ID, String nombre, boolean mojado) {
        this.ID = ID;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "("+"Nombre: "+nombre +", ID: "+ ID+", mojado= "+mojado+")";
    }
    
    public void disparo(Revolver r){
        
        if(r.mojar()){
            mojado=true;
            System.out.println("Te mojaste");
        }else{
            r.siguienteChorro();
            mojado=false;
            System.out.println("No te mojaste");
        }
    }
    public ArrayList<Jugador> CrearJugadores() {
        ArrayList<Jugador> jugadores=new ArrayList();
        
        System.out.print("Ingrese la cantidad de jugadores: ");
        int jugador = leer.nextInt();
        
        for (int i = 0; i < jugador; i++) {
            Jugador j1 = new Jugador();
            System.out.println("Ingrese su nombre");
            j1.setNombre(leer.next() +" "+ (i+1));
            j1.setID(i+1);
            jugadores.add(j1);
            j1.setMojado(false);
        } 
        return jugadores;
}
}
