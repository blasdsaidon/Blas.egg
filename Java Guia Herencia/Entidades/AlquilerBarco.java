/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */
package Entidades;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class AlquilerBarco {
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private int dniCliente;
    private String nombreCliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Barco barcoAlquilado;
    private int posicion;

    public AlquilerBarco() {
    }

    public AlquilerBarco(int dniCliente, String nombreCliente, Date fechaAlquiler, Date fechaDevolucion, Barco barcoAlquilado, int posicion) {
        this.dniCliente = dniCliente;
        this.nombreCliente = nombreCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.barcoAlquilado = barcoAlquilado;
        this.posicion = posicion;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barco getBarcoAlquilado() {
        return barcoAlquilado;
    }

    public void setBarcoAlquilado(Barco barcoAlquilado) {
        this.barcoAlquilado = barcoAlquilado;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "AlquilerBarco{" + "dniCliente=" + dniCliente + ", nombreCliente=" + nombreCliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", barcoAlquilado=" + barcoAlquilado + ", posicion=" + posicion + '}';
    }
    public int calculoDiasAlquiler(){
        int dia, mes, anio;
        System.out.println("Complete datos fecha alquiler");
        System.out.println("año");
        anio=leer.nextInt();
        System.out.println("mes");
        mes=leer.nextInt();
        System.out.println("dia");
        dia=leer.nextInt();
        Date fechaalq=new Date(anio-1900,mes-1,dia);
        this.setFechaAlquiler(fechaalq);
        System.out.println("-------");
         System.out.println("Complete datos fecha devolucion");
        System.out.println("año");
        anio=leer.nextInt();
        System.out.println("mes");
        mes=leer.nextInt();
        System.out.println("dia");
        dia=leer.nextInt();
        fechaalq =new Date(anio-1900,mes-1,dia);
        this.setFechaDevolucion(fechaalq);
        long startTime = fechaAlquiler.getTime() ;
     long endTime = fechaDevolucion.getTime();
     long diasDesde = (long) Math.floor(startTime / (1000*60*60*24)); // convertimos a dias, para que no afecten cambios de hora 
     long diasHasta = (long) Math.floor(endTime / (1000*60*60*24)); // convertimos a dias, para que no afecten cambios de hora
     long diasAlq = diasHasta - diasDesde;
        //System.out.println("son "+diasAlq+" dias"); 
       return (int)diasAlq; 
    }
    public void precioAlquiler(Barco barco){
        double precioCadaBarco = barco.precio();
        double precioAlq=precioCadaBarco*calculoDiasAlquiler();
        System.out.println("Precio de alquiler: $ "+precioAlq);
    }
}
