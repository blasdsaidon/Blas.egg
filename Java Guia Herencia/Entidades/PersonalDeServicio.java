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
public final class PersonalDeServicio extends Empleado{
    private String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, int incorporacion, int despacho, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(incorporacion, despacho, nombre, apellido, identificacion, estadoCivil);
        this.seccion = seccion;
    }

    

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toStringg()+"\n"+"PersonalDeServicio{" + "seccion=" + seccion + '}'; //To change body of generated methods, choose Tools | Templates.
    }
    
}
