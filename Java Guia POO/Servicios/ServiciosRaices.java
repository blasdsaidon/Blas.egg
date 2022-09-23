/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Raices;

/**
 *
 * @author blasd
 */
public class ServiciosRaices {
   public double getDiscriminante(Raices raiz){
       double discriminante = Math.pow(raiz.getB(), 2)-(4*raiz.getC()*raiz.getA());
       return discriminante;
   }
   public boolean tieneRaices(Raices raiz){
     boolean raices=false;  
   
       if (getDiscriminante(raiz)>0){ 
           raices=true;
       }
       
    return raices;
   
    }
   public boolean tieneRaiz(Raices raiz){
       boolean rais=false;
       if (getDiscriminante(raiz)==0){
           rais=true;
       }
       return rais;
   }
   public void obtenerRaices(Raices raiz){
       
       if(tieneRaices(raiz)==true){
          double r1=(-raiz.getB()-Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA());
          double r2=(-raiz.getB()+Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA());
           System.out.println("R1= "+r1);
           System.out.println("R2= "+r2);
       }
       
   }
   public void obternerRaiz(Raices raiz){
         if(tieneRaiz(raiz)==true){
          double r1=(-raiz.getB()-Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA());
         
           System.out.println("R1= "+r1);
           
       }
       
   }
   public void calcular(Raices raiz){
       if(tieneRaices(raiz)==true){
          double r1=(-raiz.getB()-Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA());
          double r2=(-raiz.getB()+Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA());
           System.out.println("R1= "+r1);
           System.out.println("R2= "+r2);
       }else if(tieneRaiz(raiz)==true){
            double r1=(-raiz.getB()-Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA());
         
           System.out.println("R1= "+r1);
       }else{
           System.out.println("No existe solucion real");
       }
   }
}