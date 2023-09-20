/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Vehiculo;
import java.util.Scanner;

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
       
     //Declaracion de variables 
     String Marca="";
     String Tipo_v="";
     String placa="";
     
     //Creacion de objeto
     Vehiculo objvehiculo=new Vehiculo();
     
     //fijar info
     Scanner scan=new Scanner(System.in);
     //pedir info
 
     
     System.out.println("digite la marca de el vehiculo");
     Marca=scan.nextLine();
     objvehiculo.setMarca(Marca);
     
     System.out.println("digite la placa de vehiculo");
     placa=scan.nextLine();
     objvehiculo.setPlaca(placa);
     
     System.out.println("digite el tipo de vehiculo" );
     Tipo_v=scan.nextLine();
     objvehiculo.setTipo_v(Tipo_v);
     
     Vehiculo objvehiculo1=new Vehiculo(Marca, placa, Tipo_v);
     
     //imprmir
     System.out.println("la marca de el vehiculo es:"+"\t"+objvehiculo.getMarca());
     System.out.println("la placa de el vehiculo es:"+"\t"+objvehiculo.getPlaca());
     System.out.println("el tipo de el vehiculo es:"+"\t"+objvehiculo.getTipo_v());
     
      System.out.println("la marca de el vehiculo es:"+"\t"+objvehiculo1.getMarca());
     System.out.println("la placa de el vehiculo es:"+"\t"+objvehiculo1.getPlaca());
     System.out.println("el tipo de el vehiculo es:"+"\t"+objvehiculo1.getTipo_v());
    }
    
}
