/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import java.util.Arrays;

/**
 *
 * @author blasd
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double a=0.5;
        double[] vectA = new double[50];
        double[] vectB = new double[20];
        for (int i = 0; i < 50; i++) {
            vectA[i]=(int)(Math.random()*10);
            //System.out.print("["+vectA[i]+"]");
        }
        //System.out.println("");
        Arrays.sort(vectA);
        System.arraycopy(vectA, 0, vectB, 0, 10);
             
        
        System.out.println(" ");
        
           Arrays.fill(vectB,10,20,0.5);
        
        for (int i = 0; i < 50; i++) {
            System.out.print("["+vectA[i]+"]");
            
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print("["+vectB[i]+"]");
            
        }
    }
    
}
