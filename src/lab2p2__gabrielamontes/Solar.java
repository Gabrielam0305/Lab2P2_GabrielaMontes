/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2__gabrielamontes;

/**
 *
 * @author Gabriela Montes
 */
public class Solar {
    private int numancho;
    private int numlargo;
    private int area;
     private String dueño;
    private String estado;

    public Solar() {
    }

    public Solar(int numancho, int numlargo, int area) {
        this.numancho = numancho;
        this.numlargo = numlargo;
        this.area = area;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

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
    
}
