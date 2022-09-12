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
public class Persona {
    private double peso;
    private double altura;
    private int edad;
    private String nombre;
    private String sexo;

    public Persona(double peso, double altura, int edad, String nombre, String sexo) {
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Persona() {
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void crearPersona(){
        Scanner leer=new Scanner(System.in);
        
       
      
        System.out.println("ingrese su sexo");
        this.sexo=leer.nextLine();
        while (!(sexo.equalsIgnoreCase("m")||sexo.equalsIgnoreCase("h")||sexo.equalsIgnoreCase("o"))){
            System.out.println("ingrese su sexo(m, h u o)");
            this.sexo=leer.nextLine();
        }
         System.out.println("ingrese su nombre");
        this.nombre=leer.nextLine();
        System.out.println("ingrese su peso");
        this.peso=leer.nextFloat();
        System.out.println("ingrese su altura");
        this.altura=leer.nextFloat();
        System.out.println("ingrese su edad");
        this.edad=leer.nextInt();
    }
    public int calcularIMC(){
        int imc;
        if((peso/altura/altura)<20){
            System.out.println("estas por debajo de tu peso ideal");
        imc=-1;
        }else if((peso/altura/altura)>=20&&(peso/altura/altura)<=25){
            System.out.println("estas en tu peso ideal");
        imc=0;
    }else{
            System.out.println("estas por encima de tu peso ideal");
            imc=1;
    
              
    }
        return imc;
    }
    public boolean mayorEdad(){
        boolean mayo=false;
        if(edad>18){
            mayo=true;
        }
        return mayo;
    }
}
