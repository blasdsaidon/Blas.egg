/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Objects;



/**
 *
 * @author blasd
 */
public class Pais implements Comparable<Pais> {
     private String pais;
     private Integer habitantes; 

    public Pais() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.pais);
        hash = 67 * hash + Objects.hashCode(this.habitantes);
        return hash;
    }

    @Override
    public String toString() {
        return "Pais{" + "pais=" + pais + ", habitantes=" + habitantes + '}';
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
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.habitantes, other.habitantes)) {
            return false;
        }
        return true;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(Integer habitantes) {
        this.habitantes = habitantes;
    }

    public Pais(String pais, Integer habitantes) {
        this.pais = pais;
        this.habitantes = habitantes;
    }

 

    @Override
    public int compareTo(Pais t) {
        return this.habitantes.compareTo(t.getHabitantes());
    }

//   @Override
//    public int compareTo(Pais t) {
//        return this.pais.compareTo(t.getPais());
//    }
     

    
}