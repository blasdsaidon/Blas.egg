/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author blasd
 */
public class Baraja {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Carta> mazo=new ArrayList();
    private ArrayList<Carta> descarte=new ArrayList();
    
    public Baraja(ArrayList<Carta> mazo,ArrayList<Carta> descarte) {
        this.mazo = mazo;
    }

    public ArrayList<Carta> getDescarte() {
        return descarte;
    }

    public void setDescarte(ArrayList<Carta> descarte) {
        this.descarte = descarte;
    }

    public Baraja() {
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + ", descarte=" + descarte + '}';
    }

    public void llenarBaraja(){
       String[] palos={"basto","espada","copa","oro"} ;
        for (int palo = 0; palo < 4; palo++) {
            for (int i = 1; i < 11; i++) {
            Carta c1=new Carta();
          if(i>=8){
          c1.setNumero(i+2);
          }else{
            c1.setNumero(i);  
          }
          c1.setPalo(palos[palo]);
          this.mazo.add(c1);
          }
          }
    }
    public void mostraBaraja(){
        System.out.println("Estas cartas quedan en la Baraja");
        for (Carta carta : mazo) {
            System.out.println(carta);
        }
    }
        public void mostraCartas(List<Carta> repartidas){
        System.out.println("Estas cartas quedan en la Baraja");
        for (Carta carta :repartidas) {
            System.out.println(carta);
        }
       
    }
    public void mezclar(){
        Collections.shuffle(mazo);
    }
    public void siguienteCarta(){
        
        System.out.println(mazo.get(0));
        descarte.add(mazo.get(0));
        mazo.remove(0);
           
        }
    public void cartasMonton(){
        System.out.println("Estas cartas ya salieron");
        for (Carta carta : descarte) {
            System.out.println(carta);
        }
    }
    public void cartasDisponibles(){
        System.out.println("Aun se pueden repartir "+mazo.size()+" cartas");
    }
    public void repartirCartas(){
        System.out.println("¿cuantas cartas desea?");
        int cartas=leer.nextInt();
        if(cartas<=mazo.size()){
            System.out.println("Estas cartas son las que te tocaron");
            //for (int i = 0; i < cartas; i++) {
                
                System.out.println("--------");
                List<Carta> repartidas=(mazo.subList(0,cartas));
                mostraCartas(repartidas);
                descarte.addAll(repartidas);
                mazo.removeAll(repartidas);
                 
            
        //}
                
                }else{
        
            System.out.println("no hay suficientes cartas"); 
            
        }
         System.out.println("¿Quiere mas cartas? SI/NO");
        String opcion=leer.next();
        if(opcion.equalsIgnoreCase("si")){
            repartirCartas();
        }
    }       
        
    
}
