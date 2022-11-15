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
public class Juego {

    private Revolver revolver;
    private ArrayList<Jugador> jugadores;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Juego() {
    }

    public Juego(Revolver revolver, ArrayList<Jugador> jugadores) {
        this.revolver = revolver;
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "revolver=" + revolver + ", jugadores=" + jugadores + '}';
    }

    public void llenarJuego(Revolver r, Jugador j1) {
        r.llenarRevolver();

        this.revolver = r;
        this.jugadores = j1.CrearJugadores();

    }

    public void ronda() {
        int i =0;
        do{
        for (Jugador jugadore : jugadores) {
            
            System.out.println("-------------");
            System.out.println(jugadore);
            jugadore.disparo(revolver);
            
            if (jugadore.isMojado()) {
                i++;
                System.out.println("Juego terminado");
                break;
            } else {
                System.out.println("Siguiente ronda? S/N");
                String opcion = leer.next();
                if (opcion.equalsIgnoreCase("S")) {
                    continue;
                } else {
                    break;
                }
            }
        }
        }while(i==0);
        
        for (Jugador jugadore : jugadores) {
            System.out.println("---------");
            System.out.println(jugadore);
        }

    }
}
    

