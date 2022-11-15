/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.HashSet;
import java.util.Objects;



/**
 *
 * @author blasd
 */
public class Voto {
    private Alumno votante;
    private HashSet<Alumno> votados;
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.votante);
        hash = 47 * hash + Objects.hashCode(this.votados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voto other = (Voto) obj;
        if (!Objects.equals(this.votante, other.votante)) {
            return false;
        }
        if (!Objects.equals(this.votados, other.votados)) {
            return false;
        }
        return true;
    }
    

    public Voto() {
    }

    public Voto(Alumno votante, HashSet<Alumno> votados) {
        this.votante = votante;
        this.votados = votados;
    }

    public Alumno getVotante() {
        return votante;
    }

    public void setVotante(Alumno votante) {
        this.votante = votante;
    }

    public HashSet<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(HashSet<Alumno> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "Voto{" + "votante=" + votante.getNombreCompleto() + "\n, votados=" + votados + '}';
    }
    
}
