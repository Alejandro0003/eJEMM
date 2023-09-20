/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica_cliente;

import java.util.Scanner;
import logica_negocio.Persona;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //declaracion de variables 
    String Nombre="";
    int Cedula=0;
    int Año_nacimiento=0;
    int Año_actual=2023;
   
    //creacion de objetos con no parametrizado
    Persona objpersona=new Persona();

    //fijar informacion
    Scanner scan=new Scanner(System.in);
    
    //pedir informacion 
    
    System.out.println("Digite su nombre");
    Nombre=scan.nextLine();
    objpersona.setNombre(Nombre);
    
    System.out.println("Digite su numero de cedula");
    Cedula=scan.nextInt();
    objpersona.setCedula(Cedula);
    
    System.out.println("Digite el año de nacimiento");
    Año_nacimiento=scan.nextInt();
    objpersona.setAño_nacimiento(Año_nacimiento);
    
    
    //creacion de objeto con parametrizado
    
    Persona objpersona1=new Persona(Nombre, Cedula, Año_nacimiento);
    
     //operacion
    int resultado =Año_actual-objpersona.getAño_nacimiento();
    //imprimir
    System.out.println("EL nombre de el usuario es:"+"\t"+objpersona.getNombre());
    System.out.println("La cedula de el usuario es:"+"\t"+objpersona.getCedula());
    System.out.println("La edad de el usuario es:"+"\t"+resultado);
    
    System.out.println("EL nombre de el usuario es:"+"\t"+objpersona1.getNombre());
    System.out.println("La cedula de el usuario es:"+"\t"+objpersona1.getCedula());
    System.out.println("La edad de el usuario es:"+"\t"+resultado);
    }
 
}
    

