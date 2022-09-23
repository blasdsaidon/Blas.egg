/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ServiciosCadena {

    Scanner leer = new Scanner(System.in);

    public Cadena crearCadena() {
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
        return new Cadena(frase);

    }

    public void contarVocales(Cadena cadena) {
        String frasee = cadena.getFrase();
        int contador = 0;

        for (int i = 0; i < frasee.length(); i++) {

            switch (frasee.toUpperCase().substring(i, i + 1)) {
                case "A":
                    contador++;

                    break;
                case "E":
                    contador++;
                    break;
                case "I":
                    contador++;
                    break;
                case "O":
                    contador++;
                    break;
                case "U":
                    contador++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("el numero de vocales de su frase es; " + contador);

    }

    public void invertirFrase(Cadena cadena) {
        String invertir = cadena.getFrase();
        String invertido = "";
        for (int i = invertir.length(); i > 0; i--) {
            invertido = invertido + invertir.substring(i - 1, i);

        }
        System.out.println(invertido);
    }

    public void vecesRepetido(Cadena cadena) {
        int contador2 = 0;
        System.out.println("ingrese una letra para comprobar si esta en la frase");
        String letra = leer.nextLine();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().substring(i, i + 1).equals(letra)) {
                contador2++;
            }

        }
        System.out.println("la letra se encontró: " + contador2 + " veces");
    }

    public void unirFrases(Cadena cadena) {
        System.out.println("ingrese una frase para unir");
        String unir = leer.nextLine();
        unir = cadena.getFrase() + " " + unir;
        System.out.println("la frase unida es; " + unir);
    }

    public void reemplazar(Cadena cadena) {
        System.out.println("ingrese el caracter para incluir");
        String incluir = leer.nextLine();
        String reemplazo = cadena.getFrase().replaceAll("a", incluir);
        System.out.println(reemplazo);

    }

    public boolean contieneLetra(Cadena cadena) {
        boolean contiene = false;
        System.out.println("ingrese una letra para indicar si está en la frase");
        String letra2 = leer.nextLine();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().substring(i, i + 1).equals(letra2)) {
                contiene = true;
            }

        }

        return contiene;

    }
}
