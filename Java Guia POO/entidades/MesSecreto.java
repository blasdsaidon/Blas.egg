/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class MesSecreto {
    Scanner leer=new Scanner(System.in);
    private String mes[]={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto=mes[0];

    public MesSecreto() {
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    public void adivina(){
        System.out.println("Adivine el mes secreto, ingrese un mes en minusculas");
        String adiv=leer.nextLine();
        while(!adiv.equals(getMesSecreto())){
            System.out.println("No ha acertado, intente nuevamente");
            adiv=leer.nextLine();
        }
        System.out.println("!Ha acertado¡");
    }
        
    }




