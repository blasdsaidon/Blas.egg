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
public final class Profesor extends Empleado{
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int incorporacion, int despacho, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(incorporacion, despacho, nombre, apellido, identificacion, estadoCivil);
        this.departamento = departamento;
    }

    public Profesor(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(int incorporacion) {
        this.incorporacion = incorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return super.toStringg()+"\n"+"Profesor{" + "departamento=" + departamento + '}'; //To change body of generated methods, choose Tools | Templates.
    }

   

   
    
}
