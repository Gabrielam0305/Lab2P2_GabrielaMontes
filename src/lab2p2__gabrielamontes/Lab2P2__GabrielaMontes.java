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
        menu();
    }

    static void menu() {
        ArrayList objetos = new ArrayList();
        ArrayList<Usuario>usuarios=new ArrayList<Usuario>();
        Usuario admin= new Usuario("admin", 35, "admin", "admin1234");
        usuarios.add(admin);
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Registro de Inmueble/Solar\n"
                + "2. Manejo de Estados \n"
                + "3. Log in/Sign up\n"
                + "4. Salir");
        int menu = entrada.nextInt();
        while (menu != 4) {
            switch (menu) {
                case 1:
                    validacion(objetos, usuarios);
                    logout(usuarios);
                    break;
                case 2:
                    validacionestados(objetos, usuarios);
                    logout(usuarios);
                    break;
                case 3:
                    entrar(usuarios);
                    logout(usuarios);
                    break;
            }
            System.out.println("1. Registro de Inmueble/Solar\n"
                + "2. Manejo de Estados \n"
                + "3. Log in/Sign up\n"
                + "4. Salir");
        menu = entrada.nextInt();

        }
        //menu
    }
    
    public static void validacion (ArrayList objetos, ArrayList<Usuario>usuarios){
        Usuario temp=login(usuarios);
        if (temp.getUsuariousername().equals("admin")&&temp.getUsuariocontraseña().equals("admin1234")) {
            registroadmin(objetos);
        }else{
            registrousuario(objetos);
        }
    }
    public static void validacionestados (ArrayList objetos, ArrayList<Usuario>usuarios){
        Usuario temp=login(usuarios);
        if (temp.getUsuariousername().equals("admin")&&temp.getUsuariocontraseña().equals("admin1234")) {
            //ejercicio2
        }else{
            System.out.println("Usuario no valido, solo el admin puede acceder");
        }
    }
    static void registroadmin (ArrayList objetos){
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Crear\n"
                + " 2. Listar \n"
                + "3. Modificar \n"
                + "4. Borrar \n"
                + "5. Vender\n"
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
            //fin switch
           System.out.println("1. Crear,\n"
                + " 2Listar, \n"
                + "3. Modificar \n"
                + "4. Borrar \n"
                + "5. Comprar"
                + "6. Salir");
         registro = entrada.nextInt();  
            
    }
//registro
}
    public static void registrousuario(ArrayList objetos){
         Scanner entrada = new Scanner(System.in);
        System.out.println("1. Crear,\n"
                + " 2Listar, \n"
                + "3. Modificar \n"
                + "4. Borrar \n"
                + "5. comprar"
                + "6. Salir");
         int registro = entrada.nextInt();
        while (registro != 6) {
            switch (registro) {
                case 1:
                    System.out.println("Opcion no es accesible");
                    break;
                case 2:
                    listar(objetos);
                    break;
                case 3:
                    System.out.println("Opcion no es accesible");
                    break;
                case 4:
                    System.out.println("Opcion no es accesible");
                    break;
                case 5:
                    //comprar
                    break;
                
            }
            //fin while
           System.out.println("1. Crear,\n"
                + " 2Listar, \n"
                + "3. Modificar \n"
                + "4. Borrar \n"
                + "5. Comprar"
                + "6. Salir");
         registro = entrada.nextInt();  
    }
    }
    
   public static void crear (ArrayList objetos){
       Scanner entrada = new Scanner(System.in);
       System.out.println("1.Casa \n 2. Edificio \n 3. Solar \n 4. Salir");
      int crear = entrada.nextInt();
        while (crear != 4) {
            switch (crear) {
                case 1:
                    casa(objetos);
                    //casa
                    break;
                case 2:
                    edificio(objetos);
                    //edificio
                    break;
                case 3:
                    solar(objetos);
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
    Color color;
    System.out.println("Ingrese el numero de casa: ");
    int num=entrada.nextInt();
    System.out.println("Ingrese el numero de bloque: ");
    int bloc=entrada.nextInt();
    System.out.println("Ingrese el color: negro, gris, blanco");
    String col=entrada.nextLine();
    while ((col !="negro")||(col!="gris")||(col!="blanco")){
        System.out.println("Color no valido");
           System.out.println("Ingrese el color: negro, gris, blanco");
        col=entrada.nextLine(); 
    }
    if (col.equalsIgnoreCase("negro")) {
        color=Color.BLACK;
    } else if ((col.equalsIgnoreCase("gris"))){
            color=Color.GRAY;
            }else {
        color=Color.WHITE;
    }

    System.out.println("Ingrese el numero de baños: ");
    int baños=entrada.nextInt();
    System.out.println("Ingrese el ancho: ");
    int ancho=entrada.nextInt();
    System.out.println("Ingrese el largo: ");
    int largo=entrada.nextInt();
    System.out.println("Ingrese el numero de cuartos: ");
    int cuartos=entrada.nextInt();
    Casa c=new Casa(num, bloc, color, ancho, largo, baños, cuartos);
    objetos.add(c);
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
    objetos.add(e);
}

public static void solar(ArrayList objetos){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el ancho: ");
    int ancho=entrada.nextInt();
    System.out.println("Ingrese el largo: ");
    int largo =entrada.nextInt();
    int area=(largo*ancho);
    Solar s=new Solar(ancho, largo, area);
    objetos.add(s);
}

public static void listar(ArrayList objetos){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese si deasea listar 1. casa, 2. edificio, 3. solar: ");
    int listar=entrada.nextInt();
    switch(listar){
        case 1:
            listarcasas (objetos);
            break;
        case 2:
           listaredificios(objetos);
            break;
        case 3:
            listarsolares (objetos);
            break;
    }
    }
public static void Signup(ArrayList<Usuario>usuarios){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Nombre: ");
    String nombre=entrada.nextLine();
    System.out.println("Edad: ");
    int edad=entrada.nextInt();
    entrada = new Scanner(System.in);
    System.out.println("Username: ");
    String username=entrada.nextLine();
    System.out.println("Contrasena: ");
    String contrasena=entrada.nextLine();
    Usuario u=new Usuario(nombre, edad, username, contrasena);
    usuarios.add(u);
    System.out.println(usuarios.size());
}

public static Usuario login(ArrayList<Usuario>usuarios){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Necesita ingresar para acceder al registro");
    System.out.println("Username: ");
    String username=entrada.nextLine();
    System.out.println("Contrasena: ");
    String contrasena=entrada.nextLine();
    for (Usuario u : usuarios) {
      if (u.getUsuariousername().equalsIgnoreCase(username)) {
            if(u.getUsuariocontraseña().equalsIgnoreCase(contrasena)){
                return u;
            }else{
                System.out.println("Contraseña incorrecta");
            }
        }
        }
         Usuario u=new Usuario(); 
         return u;
    }

public static Usuario logout(ArrayList<Usuario>usuarios){
         Usuario u=new Usuario(); 
         System.out.println("SESION TERMINADA");
         return u;
         
    }

public static void entrar (ArrayList<Usuario>usuarios) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Que desea hacer: 1. Sign up, 2. Log in, 3. Log out");
    int entar=entrada.nextInt();
    switch(entar){
        case 1:
            Signup(usuarios);
            break;
        case 2:
            login(usuarios);
            break;
        case 3:
            logout(usuarios);
            break;
            
    }
}

public static void comprar (ArrayList objetos){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Que desea comprar: 1. Casas \n 2. Edificios \n 3. Solares");
    int comprar=entrada.nextInt();
    switch(comprar){
        case 1:
            listarcasas(objetos);
            System.out.println("Ingrese la posición de la casa que quiere modificar");
             int casa=entrada.nextInt();
             System.out.println("Ingrese el nombre del nuevo dueno");
             String duecasa=entrada.nextLine();
             ((Casa)objetos.get(casa)).setDueño(duecasa);
            break;
        case 2:
            listaredificios(objetos);
             System.out.println("Ingrese la posición del edificio que quiere modificar");
             int edificio=entrada.nextInt();
             System.out.println("Ingrese el nombre del nuevo dueno");
             String dueedi=entrada.nextLine();
             ((Edificio)objetos.get(edificio)).setDueño(dueedi);
            break;
        case 3:
            listarsolares(objetos);
             System.out.println("Ingrese la posición del edificio que quiere modificar");
             int solar=entrada.nextInt();
             System.out.println("Ingrese el nombre del nuevo dueno");
             String duesol=entrada.nextLine();
             ((Solar)objetos.get(solar)).setDueño(duesol);
            break;
    }
}

public static void listarcasas (ArrayList objetos){
    for (Object o: objetos) {
            if(o instanceof Casa){
                System.out.println(objetos.indexOf(o)+" "+o);
            }
    }
}
public static void listaredificios (ArrayList objetos){
    for (Object o: objetos) {
            if(o instanceof Edificio){
                System.out.println(objetos.indexOf(o)+" "+o);
            }
    }
}
public static void listarsolares (ArrayList objetos){
    for (Object o: objetos) {
            if(o instanceof Solar){
                System.out.println(objetos.indexOf(o)+" "+o);
            }
    }
}

//clase
}