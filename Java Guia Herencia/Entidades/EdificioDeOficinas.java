/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;



/**
 *
 * @author blasd
 */
public class EdificioDeOficinas extends Edificio {
    private int numeroDePisos,numeroDeOficinas,numeroDePersonasPorOficina;

    public EdificioDeOficinas(int numeroDePisos, int numeroDeOficinas, int numeroDePersonasPorOficina, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.numeroDePisos = numeroDePisos;
        this.numeroDeOficinas = numeroDeOficinas;
        this.numeroDePersonasPorOficina = numeroDePersonasPorOficina;
    }

    public EdificioDeOficinas() {
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getNumeroDePersonasPorOficina() {
        return numeroDePersonasPorOficina;
    }

    public void setNumeroDePersonasPorOficina(int numeroDePersonasPorOficina) {
        this.numeroDePersonasPorOficina = numeroDePersonasPorOficina;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numeroDePisos=" + numeroDePisos + ", numeroDeOficinas=" + numeroDeOficinas + ", numeroDePersonasPorOficina=" + numeroDePersonasPorOficina + '}';
    }
    
     @Override
    public void calcularSuperficie() {
        
        System.out.println("La superficie del Edificio es: "+(this.getLargo()*this.getAncho())+"m2");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del Edificio es "+(this.getAlto()*this.getLargo()*this.getAncho())+"m3");
    }
    public void cantPersonas(){
        
        System.out.println("Ingrese numero de pisos");
        this.setNumeroDePisos(leer.nextInt());
        System.out.println("------");
        do{
        System.out.println("Ingrese numero de oficinas totales");
        this.setNumeroDeOficinas(leer.nextInt());
        }while(this.getNumeroDeOficinas()<this.getNumeroDePisos());
        System.out.println("------");
        System.out.println("Ingrese numero de personas por oficina");
        this.setNumeroDePersonasPorOficina(leer.nextInt());
        System.out.println("------");
        
        System.out.println("Numero de personas por piso: "+((int)(this.getNumeroDeOficinas()*this.getNumeroDePersonasPorOficina())/this.getNumeroDePisos()));
        System.out.println("--------");
        System.out.println("Numero de personas totales: "+((int)(this.getNumeroDeOficinas()*this.getNumeroDePersonasPorOficina())));
    }
}

