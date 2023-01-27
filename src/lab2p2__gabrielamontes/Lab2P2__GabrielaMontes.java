/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2__gabrielamontes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

/**
 *
 * @author Gabriela Montes
 */
public class Lab2P2__GabrielaMontes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    static void menu() {
        ArrayList objetos = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Registro de Inmueble/Solar\n"
                + "2. Manejo de Estados \n"
                + "3. Log in/Sign up\n"
                + "4. Salir");
        int menu = entrada.nextInt();
        while (menu != 4) {
            switch (menu) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }

        }
        //menu
    }
    
    static void registro (ArrayList objetos){
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Crear,\n"
                + " 2Listar, \n"
                + "3. Modificar \n"
                + "4. Borrar \n"
                + "5. Vender"
                + "6. Salir");
         int registro = entrada.nextInt();
        while (registro != 6) {
            switch (registro) {
                case 1:
                    //crear
                    crear(objetos);
                    break;
                case 2:
                    listar(objetos);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                
            }
            //fin while
           System.out.println("1. Crear,\n"
                + " 2Listar, \n"
                + "3. Modificar \n"
                + "4. Borrar \n"
                + "5. Vender"
                + "6. Salir");
         registro = entrada.nextInt();  
            
    }
//registro
}
   public static void crear(ArrayList objetos){
       Scanner entrada = new Scanner(System.in);
       System.out.println("1.Casa \n 2. Edificio \n 3. Solar \n 4. Salir");
      int crear = entrada.nextInt();
        while (crear != 4) {
            switch (crear) {
                case 1:
                    //casa
                    break;
                case 2:
                    //edificio
                    break;
                case 3:
                    //solar
                    break;
            }
            //fin while
     System.out.println("1.Casa \n 2. Edificio \n 3. Solar \n 4. Salir");
      crear = entrada.nextInt();
        }
  
   }

public static void casa(ArrayList objetos){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el numero de casa: ");
    int num=entrada.nextInt();
    System.out.println("Ingrese el numero de bloque: ");
    int bloc=entrada.nextInt();
    System.out.println("Ingrese el color: ");
    Color col=JColorChooser.showDialog(null, "    Seleccione el color", Color.black);
    System.out.println("Ingrese el numero de baños: ");
    int baños=entrada.nextInt();
    System.out.println("Ingrese el ancho: ");
    int ancho=entrada.nextInt();
    System.out.println("Ingrese el largo: ");
    int largo=entrada.nextInt();
    System.out.println("Ingrese el numero de cuartos: ");
    int cuartos=entrada.nextInt();
    Casa c=new Casa(num, bloc, col, ancho, largo, baños, cuartos);
}
public static void edificio(ArrayList objetos){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el numero de pisos: ");
    int num=entrada.nextInt();
    System.out.println("Ingrese la cantidad de locales: ");
    int locales=entrada.nextInt();
    System.out.println("Ingrese la dirección por referencia: ");
    String direccion =entrada.nextLine();
    Edificio e=new Edificio(num, locales, direccion);
}

public static void solar(ArrayList objetos){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el ancho: ");
    int ancho=entrada.nextInt();
    System.out.println("Ingrese el largo: ");
    int largo =entrada.nextInt();
    int area=(largo*ancho);
    Solar s=new Solar(ancho, largo, area);
}

public static void listar(ArrayList objetos){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese si deasea listar1. casa, 2. edificio, 3. solar: ");
    int listar=entrada.nextInt();
    switch(listar){
        case 1:
            for (Object o: objetos) {
            if(o instanceof Casa){
                System.out.println(objetos.indexOf(o)+" "+o);
            }
    }
            break;
        case 2:
            for (Object o: objetos) {
            if(o instanceof Edificio){
                System.out.println(objetos.indexOf(o)+" "+o);
            }
    }
            break;
        case 3:
            for (Object o: objetos) {
            if(o instanceof Solar){
                System.out.println(objetos.indexOf(o)+" "+o);
            }
    }
            break;
    }
    }




//clase
}