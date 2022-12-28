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
public class Empleado extends Persona {
    protected int incorporacion;
    protected int despacho;

    public Empleado() {
    }

    public Empleado(int incorporacion, int despacho, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.incorporacion = incorporacion;
        this.despacho = despacho;
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

    public String toStringg() {
        return super.toStringg()+"\n"+ "Empleado{" + "incorporacion=" + incorporacion + ", despacho=" + despacho + '}';//To change body of generated methods, choose Tools | Templates.
    }
    
}
