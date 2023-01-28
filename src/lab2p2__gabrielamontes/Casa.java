/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2__gabrielamontes;

import java.awt.Color;

/**
 *
 * @author Gabriela Montes
 */
public class Casa {
    private int numerodecasa;
    private int numerodebloque;
    private Color colorcasa;
    private int numancho;
    private int numlargo;
    private int numbaños;
    private int numcuartos;
    private String dueño;
    private String estado; 

    public Casa() {
    }

    public Casa(int numerodecasa, int numerodebloque, Color colorcasa, int numancho, int numlargo, int numbaños, int numcuartos, String estado) {
        this.numerodecasa = numerodecasa;
        this.numerodebloque = numerodebloque;
        this.colorcasa = colorcasa;
        this.numancho = numancho;
        this.numlargo = numlargo;
        this.numbaños = numbaños;
        this.numcuartos = numcuartos;
        this.estado = estado;
    }



    public int getNumerodecasa() {
        return numerodecasa;
    }

    public void setNumerodecasa(int numerodecasa) {
        this.numerodecasa = numerodecasa;
    }

    public int getNumerodebloque() {
        return numerodebloque;
    }

    public void setNumerodebloque(int numerodebloque) {
        this.numerodebloque = numerodebloque;
    }

    public Color getColorcasa() {
        return colorcasa;
    }

    public void setColorcasa(Color colorcasa) {
        this.colorcasa = colorcasa;
    }

    public int getNumancho() {
        return numancho;
    }

    public void setNumancho(int numancho) {
        this.numancho = numancho;
    }

    public int getNumlargo() {
        return numlargo;
    }

    public void setNumlargo(int numlargo) {
        this.numlargo = numlargo;
    }

    public int getNumbaños() {
        return numbaños;
    }

    public void setNumbaños(int numbaños) {
        this.numbaños = numbaños;
    }

    public int getNumcuartos() {
        return numcuartos;
    }

    public void setNumcuartos(int numcuartos) {
        this.numcuartos = numcuartos;
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
        return "La casa es" + " de numero " + numerodecasa + ", numero de bloque " + numerodebloque + ", con color " + colorcasa + ", tiene un ancho" + numancho + ", un largo de " + numlargo + ", un numero de baños de " + numbaños + ", un numero de cuartos de " + numcuartos + ", el dueno es " + dueño + ", y el estado es " + estado + '}';
    }
    
    
}
