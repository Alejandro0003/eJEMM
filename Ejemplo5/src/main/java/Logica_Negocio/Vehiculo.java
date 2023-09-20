/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Lenovo
 */
public class Vehiculo {
    
    public String Marca;
    public String Placa;
    public String Tipo_v;
    
    //No parametrizado
    public Vehiculo(){
    }
    //Parametrizado 

    public Vehiculo(String Marca, String Placa, String Tipo_v) {
        this.Marca = Marca;
        this.Placa = Placa;
        this.Tipo_v = Tipo_v;
    }
    //Setter

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setTipo_v(String Tipo_v) {
        this.Tipo_v = Tipo_v;
    }

 //Getter 

    public String getMarca() {
        return Marca;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getTipo_v() {
        return Tipo_v;
    }
    
}
