/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hoteles;
import Entidades.Residencias;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ServiciosAlojamiento {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public ArrayList<Hoteles> ordenaHoteles(ArrayList<Alojamiento> promoTuristicas) {
        ArrayList<Hoteles> soloHoteles = new ArrayList();

        for (Alojamiento aux : promoTuristicas) {
            if (aux instanceof Hoteles) {
                ((Hoteles) aux).valorHabitacion();
                soloHoteles.add((Hoteles) aux);
            }
            soloHoteles.sort(ordenMayorMenor);
        }
        return soloHoteles;
    }
    public static Comparator<Hoteles> ordenMayorMenor = new Comparator<Hoteles>() {
        @Override
        public int compare(Hoteles h1, Hoteles h2) {
            return Float.compare(h2.getPrecioHabitacion(), h1.getPrecioHabitacion());
        }
    };

    public void menu(ArrayList<Alojamiento> promoTuristicas) {
        String opcion;
        ArrayList<Hoteles> listaHotel = ordenaHoteles(promoTuristicas);
        do {
            System.out.println("1 - VER TODOS" + " \n2 - VER HOTELS DE MAYOR A MENOR" + "\n3 - CAMPING CON RESTAURANTE" + "\n4 - RESIDENCIAS CON DESCUENTOS" + "\n 5 - SALIR");
            opcion = leer.next();
            switch (opcion) {
                case "1":
                    System.out.println("MOSTRAREMOS TODAS LAS OPCIONES");
                    for (Alojamiento aux : promoTuristicas) {
                        System.out.println(aux.toStringSuper());
                    }
                    break;
                case "2":
                    System.out.println("MOSTRAREMOS HOTELES DE MAS CAROS  A MAS BARATOS");
                    for (Hoteles aux : listaHotel) {
                        System.out.println("HOTEL..." + aux.getNombre() + "  VALOR HABITACION: €" + aux.getPrecioHabitacion());
                    }
                    break;
                case "3":
                    System.out.println("MOSTRAREMOS CAMPING CON RESTAURANTES");
                    for (Alojamiento aux : promoTuristicas) {
                        if (aux instanceof Camping) {
                            if (((Camping) aux).isHayRestaurante()) {
                                System.out.println(aux.toStringSuper());
                            }
                        }
                    }
                    break;
                case "4":
                    System.out.println("MOSTRAREMOS RESIDENCIA CON DESCUENTOS");
                    for (Alojamiento aux : promoTuristicas) {
                        if (aux instanceof Residencias) {
                            if (((Residencias) aux).isDtosGremios()) {
                                System.out.println(aux.toStringSuper());
                            }
                        }
                    }
                    break;
                case "5":
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        } while (!opcion.equals("5"));
    }
}
