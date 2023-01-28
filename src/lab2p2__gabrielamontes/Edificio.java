/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2__gabrielamontes;

/**
 *
 * @author Gabriela Montes
 */
public class Edificio {
    private int numerodepisos;
    private int cantidaddelocales;
    private String direccionporreferencia;
    private String dueño;
    private String estado; 

    public Edificio() {
    }

    public Edificio(int numerodepisos, int cantidaddelocales, String direccionporreferencia, String estado) {
        this.numerodepisos = numerodepisos;
        this.cantidaddelocales = cantidaddelocales;
        this.direccionporreferencia = direccionporreferencia;
        this.estado = estado;
    }



    public int getNumerodepisos() {
        return numerodepisos;
    }

    public void setNumerodepisos(int numerodepisos) {
        this.numerodepisos = numerodepisos;
    }

    public int getCantidaddelocales() {
        return cantidaddelocales;
    }

    public void setCantidaddelocales(int cantidaddelocales) {
        this.cantidaddelocales = cantidaddelocales;
    }

    public String getDireccionporreferencia() {
        return direccionporreferencia;
    }

    public void setDireccionporreferencia(String direccionporreferencia) {
        this.direccionporreferencia = direccionporreferencia;
    }
    
    
    //dueño y estado
    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
}

    @Override
    public String toString() {
        return "El edificio " + "tiene " + numerodepisos + " pisos, " + cantidaddelocales + " locales, y la direccion de " + direccionporreferencia + ", el dueño es " + dueño + ", y el estado es " + estado +'}';
    }
    
}
