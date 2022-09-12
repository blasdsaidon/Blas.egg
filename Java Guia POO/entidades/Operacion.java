/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author blasd
 */
public class Operacion {
    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    //Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public int sumar(int num1, int num2){
        int suma=num1+num2;
        return suma;
    }          
    
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public int restar(){
        int resta=num1-num2;
        return resta;
    }
    
    //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    //fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
    //no, se hace la multiplicación y se devuelve el resultado al main
    public int multiplicar(){
        int multi;
        if(num1==0 || num2==0){
            multi=0;
            System.out.println("La multiplicacion por cero no está definida");
        }else{
            multi=num1*num2;
        }
        return multi;
        }
    /*
    h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    */
    public int dividir(){
        int divi;
        if(num1==0 || num2==0){
            divi=0;
            System.out.println("La división por cero no está definida");
        }else{
            divi=num1/num2;
        }
        return divi;
        }
    }
   

