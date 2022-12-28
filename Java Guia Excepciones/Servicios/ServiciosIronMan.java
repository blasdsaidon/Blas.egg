/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.IronArmadura;
import Entidades.IronBota;
import Entidades.IronCasco;
import Entidades.IronGuante;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ServiciosIronMan {

    IronArmadura armadura;
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
//    • Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
//establecida como consumo en la bota por el tiempo en el que se camine.

    public void crearArmadura() {
        IronBota botaIz = new IronBota();
        IronGuante guanteIzq = new IronGuante();
        IronBota botaDer = new IronBota();
        IronGuante guanteDer = new IronGuante();
        IronCasco casco = new IronCasco();
        System.out.println("Ingrese el color primario de su armadura");
        String color1 = leer.next();
        System.out.println("Ingrese el color secundario de su armadura");
        String color2 = leer.next();

        armadura = new IronArmadura(botaIz, botaDer, guanteIzq, guanteDer, casco, color2, color2, 500);
    }

    public void caminar() {
        //1 hora de caminata 10%de bateria
        int danio = Daño();
        int tiempoCamina = 0;
        boolean verifica = true;
        System.out.println("Cuanto tiempo caminará(en minutos)?");
        try {
            tiempoCamina = leer.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese un numero entero positivo");
            leer.next();
            verifica = false;
            caminar();

        }
        int energiaRestada = (int) (tiempoCamina * 0.16);
        if (energiaRestada > armadura.getBotaDer().getPropulsor()) {
            System.out.println("No tiene energia suficiente");
            verifica = false;
            caminar();
        }
        if (verifica) {
            armadura.getBotaDer().setSalud(armadura.getBotaDer().getSalud() - danio);
            armadura.getBotaIzq().setSalud(armadura.getBotaIzq().getSalud() - danio);
            armadura.setBateria(armadura.getBateria() - energiaRestada*2);
            armadura.getBotaDer().setPropulsor(armadura.getBotaDer().getPropulsor() - energiaRestada);
            armadura.getBotaIzq().setPropulsor(armadura.getBotaIzq().getPropulsor() - energiaRestada);
            System.out.println("Energia restante: " + armadura.getBotaDer() + " " + armadura.getBotaIzq());
        }
    }

    public void correr() {
        int danio = Daño();
        int tiempoCorre = 0;
        boolean verifica = true;
        System.out.println("Cuanto tiempo correrá(en minutos)?");
        try {
            tiempoCorre = leer.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese un numero entero positivo");
            leer.next();
            verifica = false;
            correr();

        }
        int energiaRestada = (int) (tiempoCorre * 0.32);
        if (energiaRestada > armadura.getBotaDer().getPropulsor()) {
            System.out.println("No tiene energia suficiente");
            verifica = false;
            correr();
        }
        if (verifica) {
            armadura.getBotaDer().setSalud(armadura.getBotaDer().getSalud() - danio);
            armadura.getBotaIzq().setSalud(armadura.getBotaIzq().getSalud() - danio);
            armadura.setBateria(armadura.getBateria() - energiaRestada*2);
            armadura.getBotaDer().setPropulsor(armadura.getBotaDer().getPropulsor() - energiaRestada);
            armadura.getBotaIzq().setPropulsor(armadura.getBotaIzq().getPropulsor() - energiaRestada);
            System.out.println("Energia restante: " + armadura.getBotaDer() + " " + armadura.getBotaIzq());
        }
    }

    public void propulsion() {
        int danio = Daño();
        int tiempoPropulsion = 0;
        boolean verifica = true;
        System.out.println("Cuanto tiempo propulsionara(en minutos)?");
        try {
            tiempoPropulsion = leer.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese un numero entero positivo");
            leer.next();
            verifica = false;
            propulsion();

        }
        int energiaRestada = (int) (tiempoPropulsion * 0.48);
        if (energiaRestada > armadura.getBotaDer().getPropulsor()) {
            System.out.println("No tiene energia suficiente");
            verifica = false;
            propulsion();
        }
        if (verifica) {
            armadura.getBotaDer().setSalud(armadura.getBotaDer().getSalud() - danio);
            armadura.getBotaIzq().setSalud(armadura.getBotaIzq().getSalud() - danio);
            armadura.setBateria(armadura.getBateria() - energiaRestada*2);
            armadura.getBotaDer().setPropulsor(armadura.getBotaDer().getPropulsor() - energiaRestada);
            armadura.getBotaIzq().setPropulsor(armadura.getBotaIzq().getPropulsor() - energiaRestada);
            System.out.println("Energia restante: " + armadura.getBotaDer() + " " + armadura.getBotaIzq());
        }
    }

    public void Volar() {
        int danio = Daño();
        int tiempoPropulsion = 0;
        boolean verifica = true;
        System.out.println("Cuanto tiempo volara(en minutos)?");
        try {
            tiempoPropulsion = leer.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese un numero entero positivo");
            leer.next();
            verifica = false;
            propulsion();

        }

        int energiaRestada = (int) (tiempoPropulsion * 0.48);
        int energiaRestadaGuantes = (int) (tiempoPropulsion * 0.32);

        if (energiaRestada > armadura.getBotaDer().getPropulsor() || armadura.getGuanteDer().getExpulsor() < energiaRestadaGuantes) {
            System.out.println("No tiene energia suficiente");
            verifica = false;
            propulsion();
        }

        if (verifica) {
            armadura.getBotaDer().setSalud(armadura.getBotaDer().getSalud() - danio);
            armadura.getBotaIzq().setSalud(armadura.getBotaIzq().getSalud() - danio);
            armadura.getGuanteDer().setSalud(armadura.getGuanteDer().getSalud() - danio);
            armadura.getGuanteIzq().setSalud(armadura.getGuanteIzq().getSalud() - danio);
            armadura.setBateria(armadura.getBateria() - (energiaRestada * 2 + energiaRestadaGuantes * 2));
            armadura.getBotaDer().setPropulsor(armadura.getBotaDer().getPropulsor() - energiaRestada);
            armadura.getBotaIzq().setPropulsor(armadura.getBotaIzq().getPropulsor() - energiaRestada);
            armadura.getGuanteDer().setExpulsor(armadura.getGuanteDer().getExpulsor() - energiaRestadaGuantes);
            armadura.getGuanteIzq().setExpulsor(armadura.getGuanteIzq().getExpulsor() - energiaRestadaGuantes);

            System.out.println("Energia restante: " + armadura.getBotaDer() + " " + armadura.getBotaIzq());
            System.out.println("Energia Restante: " + armadura.getGuanteDer() + " " + armadura.getGuanteIzq());
        }
    }

    public void GastarEnergia() {
        System.out.println("A continuacion se desplegara un menu de opciones, indique cual desea elegir:");
        System.out.println("1 - Caminar" + " \n2 - Correr" + "\n3 - Propulsion" + "\n4 - Volar" + "\n 5 - SALIR");
        String opcion = leer.next();
        switch (opcion) {
            case "1":
                caminar();
                break;
            case "2":
                correr();
                break;
            case "3":
                propulsion();
                break;
            case "4":
                Volar();
                break;
            case "5":
                break;
            default:
        }
    }
    
    public void MostrarEstado() {
        System.out.println("El estado de la armadura es: " + armadura);
    }
    
    public void Bateria() {
        System.out.println("El estado de la bateria es: " + armadura.getBateria());
    }
    
    public void InformacionReactor() {
        System.out.println("El estado de la bateria en energia 2 es: " + (armadura.getBateria() * 2));
        System.out.println("El estado de la bateria en energia 3 es: " + (armadura.getBateria() * 3.84 / 0.65));
    }
    
    public int Daño() {
        int random = (int) (Math.random () * 3);
        int danio = 0;
        if (random == 0) {
            danio = 20;
        }
        return danio;
    }
}
