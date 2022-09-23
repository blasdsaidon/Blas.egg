/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejemploguia;

/**
 *
 * @author blasd
 */
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        System.out.println("escriba un numero");
        int num1 = leer.nextInt();
        int k = 0;
        int[] vector = new int[num1];
        for(int i = 0; i <num1; i++){
            vector[i]=(int)(Math.random()*10);
            System.out.println(vector[i]);
        }
    System.out.println("escriba el numero que desea buscar");
    int busq = leer.nextInt();
    for(int i = 0; i <num1; i++){
        if (vector[i]==busq){
            k=k+1;
        System.out.println("su numero esta en la posición" + i);
    }
    }
    if(k==0){
        System.out.println("su numero no se encuentra");
    }
}
}