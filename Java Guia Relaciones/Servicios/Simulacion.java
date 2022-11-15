/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import static Comparadores.ComparadorVotos.masVotado;
import Enumeradores.Apellidos;
import Entidades.Alumno;
import Entidades.Voto;
import Enumeradores.Nombres;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class Simulacion {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> alumnes = new ArrayList();
    ArrayList<Integer> listaDni = new ArrayList();
    ArrayList<String> nombresCompletos = new ArrayList();

    public String randomApellidos() {
        Integer pick = new Random().nextInt(Apellidos.values().length);
        return Apellidos.values()[pick].toString();
    }

    public String randomNombres() {
        Integer pick = new Random().nextInt(Nombres.values().length);
        return Nombres.values()[pick].toString();
    }

    public ArrayList<Integer> crearDni() {
        for (int i = 0; i < 100; i++) {
            int dni = (int) ((Math.random() * (50000000 - 20000000)) + 20000000);
            if (!listaDni.contains(dni)) {
                listaDni.add(dni);
            } else {
                dni = (int) ((Math.random() * (50000000 - 20000000)) + 20000000);
                listaDni.add(dni);
            }

        }
        return listaDni;
    }

    public ArrayList<String> crearNombres() {
        for (int i = 0; i < 100; i++) {

            String nombre = (randomNombres() + " " + randomApellidos());

            nombresCompletos.add(nombre);
        }
        return nombresCompletos;
    }

    public ArrayList<Alumno> crearAlumnos() {
        System.out.println("¿cuantos alumnos desea simular?");
        Integer numeroSimula = leer.nextInt();
        for (int i = 0; i < numeroSimula; i++) {
            Alumno al = new Alumno();
            al.setNombreCompleto(crearNombres().get((int) ((Math.random() * 100))));
            al.setDni(crearDni().get((int) ((Math.random() * 100))));
            alumnes.add(al);
        }
        return alumnes;
    }

    public void mostrarAlumnos() {
        for (Alumno alumne : alumnes) {
            System.out.println(alumne + " " + alumne.getCantidadVotos());
        }

    }

    public void votacion() {
        ArrayList<Voto> votos = new ArrayList();

        int votoRandom;
        //ArrayList<Integer> votados = new ArrayList();
        for (Alumno alumne : alumnes) {

            Voto v1 = new Voto();
            v1.setVotante(alumne);
            HashSet<Alumno> votados = new HashSet();
            do {
                votoRandom = (int) ((Math.random() * alumnes.size()));
                alumnes.get(votoRandom);
                if (alumne != alumnes.get(votoRandom)) {
                    alumnes.get(votoRandom).setCantidadVotos((int)(alumnes.get(votoRandom).getCantidadVotos() + 1));
                    votados.add(alumnes.get(votoRandom));
                    v1.setVotados(votados);
                }
            } while ((votados.size() < 3));
            votos.add(v1);
        }
        mostrarVotos(votos);

    }

    public void mostrarVotos(ArrayList<Voto> votos) {

        for (Voto voto : votos) {
            System.out.println(voto);
        }
    }
    public void masVotados(){
        Collections.sort(alumnes, masVotado);
        
    }
}
