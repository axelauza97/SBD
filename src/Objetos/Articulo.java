/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Axel
 */
public class Articulo {
    private String nombre;
    private short precio;

    public Articulo(String nombre, short precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getPrecio() {
        return precio;
    }

    public void setPrecio(short precio) {
        this.precio = precio;
    }
    
    
}
