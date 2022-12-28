/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10herencia;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel4Estrellas;
import Entidades.Hotel5Estrellas;
import Entidades.Residencias;
import Servicios.ServiciosAlojamiento;
import java.util.ArrayList;

/**
 *
 * @author blasd
 */
public class Ejercicio3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Alojamiento> promoTuristicas = new ArrayList();

        Hotel5Estrellas granHotel = new Hotel5Estrellas(6, 20, 9, "A", "PEPE_CHEFF", 150, 30, 80, 4, 0, "GRANHOTEL", "CALLE 1 2533", "PUJATO", "SCALONI");

        Hotel5Estrellas realHotel = new Hotel5Estrellas(4, 15, 15, "A", "CHEFF_JORGE", 20, 15, 30, 2, 0, "HOTELREAL", "CALLE 6 3333", "ROSARIO", "MESSI");
        //Hotel4Estrellas chiquitoHotel1 = new Hotel4Estrellas(gimnasio, nombreRestaurante, 0, 0, 0, 0, 0, nombre, direccion, localidad, gerente);
        Hotel4Estrellas chiquitoHotel = new Hotel4Estrellas("B", "FERNANDO", 33, 25, 55, 3, 0, "FERNANDO_CHIQUITO", "CALLE 3 9999", "VGG", "LAVEZZI");
        Hotel4Estrellas plazaHotel = new Hotel4Estrellas("A", "LA ANGIOPLASTIA", 20, 35, 80, 2, 0, "PLAZA HOTEL", "CALLE 12 4444", "CABA", "LUDUEÑA");

        Camping enCarpa = new Camping(50, 6, true, true, 1000, "SE INUNDA", "PARQUE MUNI", "CASEROS", "ROQUE");
        Camping enCarpa2 = new Camping(20, 2, false, true, 500, "NO SE INUNDA", "PARQUE CLUB", "CASTELLANOS", "AARON");

        Residencias hostel = new Residencias(12, true, true, true, 800, "LA CUCARACHA", "FRENTE AL CUCU", "C.PAZ", "FALUCHO");
        Residencias hostelito = new Residencias(4, false, false, false, 200, "PIOJO'S", "DETRAS AL CUCU", "C.PAZ", "PEPER");

        promoTuristicas.add(chiquitoHotel);
        promoTuristicas.add(enCarpa);
        promoTuristicas.add(enCarpa2);
        promoTuristicas.add(granHotel);
        promoTuristicas.add(hostel);
        promoTuristicas.add(hostelito);
        promoTuristicas.add(plazaHotel);
        promoTuristicas.add(realHotel);

        ServiciosAlojamiento aloja = new ServiciosAlojamiento();
        aloja.menu(promoTuristicas);
    }

}
