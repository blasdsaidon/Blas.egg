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
public class Alumno {
    private String nombreCompleto;
    private Integer cantidadVotos=0;
    private int dni;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, Integer cantidadVotos, int dni) {
        this.nombreCompleto = nombreCompleto;
        this.cantidadVotos = cantidadVotos;
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(Integer cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto +'}';
    }
    
}
    