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
public class Provedor {
 
    private String Nombre;
    private String Direccion;
    private ArrayList<Articulo> articulos;

    public Provedor(String Nombre, String Direccion, ArrayList<Articulo> articulos) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.articulos = articulos;
    }

    public Provedor(String Nombre, String Direccion) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
    }

    public void AnadirArticulo(Articulo a){
        articulos.add(a);
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    
}
