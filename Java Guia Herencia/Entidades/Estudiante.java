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
public final class Estudiante extends Persona {
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toStringg()+"\n"+"Estudiante{" + "curso=" + curso + '}'; //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
    
}
