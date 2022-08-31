/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ejemploguia;

/**
 *
 * @author blasd
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int [101];
        int j=0;
        for(int i = 100; i >0; i--){
            j++;
            vector[j]=i;
            System.out.println(vector[j]);
        }
       
    }
    
}
