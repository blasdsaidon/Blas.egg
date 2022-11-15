/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import Entidades.Alumno;
import java.util.Comparator;

/**
 *
 * @author blasd
 */
public class ComparadorVotos {
    public static Comparator<Alumno> masVotado=new Comparator<Alumno>(){
        @Override
        public int compare(Alumno p2, Alumno p1) {
             return p1.getCantidadVotos().compareTo(p2.getCantidadVotos());
        }
    };
            }
            