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
public class Cuenta {

    private int numCuenta;
    private double saldo;
    private long dni;
    private String nombre;

    public Cuenta() {
    }

    public Cuenta(double ingreso, String nombre, int numCuenta, int saldo, long dni) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public long getDni() {
        return dni;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void crear() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("Ingrese su DNI");
        dni = leer.nextLong();
        numCuenta = (int) (Math.random() * 14875);

        System.out.println("Bienvenido " + nombre + ", su numero de cuenta es " + numCuenta + " su saldo es " + saldo);
    }

    public void ingresa(double ingreso) {
        saldo +=ingreso;
    }

    public void retira(double retiro) {
        this.saldo = this.saldo - retiro;
    }
    
    public void extraccionRapida(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("puede retirar hasta un 20% de su saldo, ingrese un monto");
        double retir=leer.nextDouble();
        while (retir>this.saldo*0.2){
            System.out.println("Ingrese un monto menor");
            retir=leer.nextDouble();
        }
        this.saldo=this.saldo-retir;
    }
    public void consultarSaldo(){
        System.out.println("Su saldo es: "+this.saldo);
    }
    public void cosultarDatos(){
            System.out.println(this.nombre+"\n"+this.numCuenta+"\n"+this.dni+"\n"+this.saldo);
    }
}
