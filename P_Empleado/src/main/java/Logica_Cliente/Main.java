/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Empleado;
import java.util.ArrayList;
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
        String Nombre="";
        String Codigo="";
        String id="";
        int Año_Ingreso=0;
        int Cantidad=0;
        int opcion=0;
        int bandera=0;
//Fijar informacion 
      Scanner scan=new Scanner(System.in);
//constructor
Empleado objempleado=new Empleado();
//lista
ArrayList < Empleado> listaempleados= new ArrayList<>();
 //Creando menu de opciones
            System.out.println("1. Registrar Empleado");
            System.out.println("2. Editar Empleado");
            System.out.println("3. Consultar Empleado");
            System.out.println("4. Mostrar Empleados");
            System.out.println("5. Eliminar Empleado");
            System.out.println("6. Salir");
           
            System.out.println("Digite la opcion");
            opcion= scan.nextInt();
           
            switch(opcion){
  case 1:
//Registro
        System.out.println("Digite la cantidad de empleados: ");
        Cantidad= scan.nextInt();
        scan.nextLine();
//ciclo para
        
        if (Cantidad>0){
        for(int i = 0; i < Cantidad; i++ ){
            scan.nextLine();

            System.out.println("Digite el nombre del usuario");
            Nombre= scan.nextLine();
            System.out.println("Digite el codigo del usuario");
            Codigo= scan.nextLine();
            System.out.println("Digite el año de ingreso del usuario");
            Año_Ingreso= scan.nextInt();
            
            scan.nextLine();
            objempleado=new Empleado ( Nombre,  Codigo,  Año_Ingreso);
            listaempleados.add(objempleado);
            
            System.out.println("El empleado ha sido registrado con exito");
    
            }   }
            else
             {
                System.out.println("La cantidad debe ser mayor que 0");
             }    
break;
case 2:
//Editar
                   
            System.out.println("Digite el id del empleado a modificar ");
            id=scan.nextLine();
 //ciclo para     
            for(int i = 0;i < listaempleados.size(); i++){
          if(listaempleados.get(i).getCodigo().equals(id)){
            
            System.out.println("Digite el nombre del usuario");
            Nombre= scan.nextLine();
            System.out.println("Digite el codigo del usuario");
            Codigo= scan.nextLine();
            System.out.println("Digite el año de ingreso del usuario");
            Año_Ingreso= scan.nextInt();      
            
            listaempleados.get(i).setNombre(Nombre);
            listaempleados.get(i).setCodigo(Codigo);
            listaempleados.get(i).setAño_Ingreso(Año_Ingreso);
            
            System.out.println("el empleado ha sido modificado con exito");
             bandera=1;
          }
            }
              if (bandera==0) {
            System.out.println("el empleado no existe");
            }
            break; 
          
 case 3:
//buscar
        scan.nextLine();
        System.out.println( "Digite el codigo del empleado a buscar");
        id=scan.nextLine();
//ciclo para
        for (int i = 0; i <listaempleados.size(); i++) {
        if(listaempleados.get(i).getCodigo().equals(id))
        {
        System.out.println("\n");
        System.out.println("Empleado"+"\t"+(i+1));
        System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
        System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
        System.out.println("El año de ingreso del empleado es:"+"\t"+listaempleados.get(i).getAño_Ingreso());
        System.out.println("El empleado ha sido encontrado con exito");
        break;
        }
            }
        if (bandera==0){
        System.out.println( "El empleado no existe");
        }    
 break;                 
                
 case 4:
//Listar
//ciclo para
        if(listaempleados.size()<0){
        for (int i = 0; i < listaempleados.size();i++) {
        System.out.println("\n");
        System.out.println("Empleado"+"\t"+(i+1));
        System.out.println("El nombre del empleado es: "+ "\t"+listaempleados.get(i).getNombre());
        System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
        System.out.println("El año de ingreso del empleado es:"+"\t"+listaempleados.get( i).getAño_Ingreso());
         bandera=1;
        }
       }
         if (bandera==0){
        System.out.println( "No hay empleados registrados");
        }
break;

case 5:
//eliminar 
            System.out.println("Digite el codigo del empleado a buscar");
            id= scan.nextLine();
        
            for (int i = 0; i < listaempleados.size(); i++){
            if(listaempleados.get(i).getCodigo().equals(id))
        {
            System.out.println("\n");
            System.out.println("Empleado"+"\t"+(i+1));
             System.out.println("el empleado ha sido eliminado con exito");
            listaempleados.remove(i);
            bandera=1;
            }
        }
          if (bandera==0){
        System.out.println( "El empleado no existe");
          }   
break;
case 6:
//cerrar programa
System.out.println("saliendo del programa");
break;

default:
System.out.println("Opcion no valida para el menu");
            }
       }
}
    


















 

