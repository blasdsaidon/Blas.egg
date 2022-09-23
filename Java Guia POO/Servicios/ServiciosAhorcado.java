package Servicios;

import entidades.Ahorcado;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ServiciosAhorcado {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {
        boolean valido;
        String pala;
        do{
        valido=true;
        System.out.println("Ingrese una palabra");
         pala = leer.nextLine();
        for (int i = 0; i < pala.length(); i++) {
            if(Character.isLetter(pala.charAt(i))==false){
                System.out.println("caracter invalido");
                valido=false;
                break;
            }
            
        }
        }while(!valido);
        String[] busca = new String[pala.length()];
        for (int i = 0; i < pala.length(); i++) {
            busca[i] = pala.substring(i, i + 1);

        }
        System.out.println("ingrese el numero de intentos permitidos");
        int intentos = leer.nextInt();

        return new Ahorcado(busca, 0, intentos);
    }

    public void longitud(Ahorcado ahorca) {
        int longi = ahorca.getBuscar().length;
        System.out.println("La longitud de la palabra es: " + longi);

    }

    public void buscar(Ahorcado ahorca, String letra) {

        int cont = 0;
        for (String buscar : ahorca.getBuscar()) {
            if (buscar.equalsIgnoreCase(letra)) {
                cont++;
            }
        }

        if (cont == 0) {
            System.out.println("la letra no se encuentra en la palabra");

            //intentos(ahorca);
            //System.out.println("te quedan "+ahorca.getIntentos()+" intentos");
        } else {
            System.out.println("la letra esta en la palabra");
            // ahorca.setEncontradas(ahorca.getEncontradas()+cont);
            // System.out.println("letras encontradas "+ahorca.getEncontradas());
        }
    }

    public void intentos(Ahorcado ahorca) {

        ahorca.setIntentos(ahorca.getIntentos() - 1);
        System.out.println("te quedan " + ahorca.getIntentos() + " intentos");
    }

    public boolean encontradas(Ahorcado ahorca, String letra) {
        boolean existe = false;
        int cont = 0;
        for (int i = 0; i < ahorca.getBuscar().length; i++) {

            if (ahorca.getBuscar()[i].equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        if (cont > 0) {

            ahorca.setEncontradas(ahorca.getEncontradas() + cont);

            existe = true;
        }
        System.out.println("numero de letras (encontradas, faltantes): (" + ahorca.getEncontradas() + "," + (ahorca.getBuscar().length - ahorca.getEncontradas()) + ")");
        return existe;
    }

    public void juego() {
        Ahorcado ahorca = crearJuego();
        String letra;
        String repetida = "";
        boolean repeat = false;
        do {
            longitud(ahorca);
            do{
                
                System.out.println("Ingrese una letra");
                letra = leer.next();
            }while(letra.length()!=1||!Character.isLetter(letra.charAt(0)));
            repeat = false;
            for (int i = 0; i < repetida.length(); i++) {
                if (letra.equalsIgnoreCase(repetida.substring(i, i + 1))) {
                    repeat = true;
                    break;
                }
            }
            if (repeat) {
                System.out.println("repetiste la letra");
            } else {
                repetida = repetida + letra;
                buscar(ahorca, letra);
                
                if (encontradas(ahorca, letra) == false) {
                    intentos(ahorca);
                }
            }

        } while (ahorca.getIntentos() > 0 && ahorca.getEncontradas() < ahorca.getBuscar().length);

        if (ahorca.getIntentos() == 0) {
            System.out.println("agotaste tus intentos");
        } else if (ahorca.getEncontradas() == ahorca.getBuscar().length) {
            System.out.println("encontraste la palabra");
           
        }
        System.out.println("la palabra era: "); 
        for (String buscar : ahorca.getBuscar()) {
            System.out.print(buscar);
            
        }
        System.out.println(" ");
            
        
    }

}
