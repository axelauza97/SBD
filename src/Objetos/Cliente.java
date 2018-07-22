/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author Axel
 */
public class Cliente {
 
    private String Nombre;
    private short Edad;
    private ArrayList<Auto> Autos;

    public Cliente(String Nombre, short Edad, ArrayList<Auto> Autos) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Autos = Autos;
    }

    public Cliente(String Nombre, short Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public short getEdad() {
        return Edad;
    }

    public void setEdad(short Edad) {
        this.Edad = Edad;
    }
    
}
