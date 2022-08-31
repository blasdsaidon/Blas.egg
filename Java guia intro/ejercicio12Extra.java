/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package ejemploguia;

/**
 *
 * @author blasd
 */
public class ejercicio12Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont1,cont2,cont3;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    cont1=i;
                    cont2=j;
                    cont3=k;
                    String letra = (cont1+"-"+ cont2+"-"+cont3);
                    String tetra = letra.replaceAll("3","E");
                    System.out.println(tetra);
                   
                    }
                    
                }
                
            }
            
        }
    }
    

