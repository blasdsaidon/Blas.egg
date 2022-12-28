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
public class OutOfBounds {
   private String[] vector =new String[5];

    public OutOfBounds() {
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }
   
   public void llenarVector(){
       try{
       for (int i = 0; i < 10; i++) {
           vector[i]=("a"+1);
       }
   }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Fuera de rango");
   }
   }
}
