/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejemploguia;

/**
 *
 * @author blasd
 */
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         java.util.Scanner leer = new java.util.Scanner(System.in);
        System.out.println("escriba un numero");
        int num1 = leer.nextInt();
        int k = 0;
        int j = 0;
        int l = 0;
        int m = 0;
        int d = 0;
        int[] vector = new int[num1];
        for(int i = 0; i <num1; i++){
            vector[i]=(int)(Math.random()*100000);
            if (vector[i]<10){
                k=k+1;
            }else if (vector[i]<100 && vector[i]>10){
                j=j+1;
            }else if (vector[i]<1000 && vector[i]>100){    
                l=l+1;
            }else if (vector[i]<10000 && vector[i]>1000)  {
                m=m+1;
            } else
                d=d+1;
        }
               for(int i = 0; i <num1; i++){
                   System.out.println(vector[i]);  
               }
           System.out.println(k +" de 1 cifra");  
           System.out.println(j +" de 2 cifras");
           System.out.println(l+" de 3 cifras");
           System.out.println(m +" de 4 cifras");
           System.out.println(d +" de 5 cifras");
            
            
        }
                
            
            
        
        
    }

