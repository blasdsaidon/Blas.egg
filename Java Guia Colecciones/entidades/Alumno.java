/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author blasd
 */
public class Alumno {
    private String nombreAlumno;
    private List<Integer> notas=new ArrayList<>();

    public Alumno(String nombreAlumno,List<Integer> notas) {
        this.nombreAlumno = nombreAlumno;
        this.notas=notas;
    }

    
    public Alumno() {
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
}
