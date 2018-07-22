/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Usuarios.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Axel
 */
public class Local {

    private String Nombre;
    private String Direccion;
    private ArrayList<Articulo> Articulos;
    private ArrayList<Usuario> Usuarios;

    public Local(String Nombre, String Direccion, ArrayList<Articulo> Articulos, ArrayList<Usuario> Usuarios) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Articulos = Articulos;
        this.Usuarios = Usuarios;
    }
    public Local(String Nombre, String Direccion) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
    }
    public ArrayList<Articulo> getArticulos() {
        return Articulos;
    }

    public void setArticulos(ArrayList<Articulo> Articulos) {
        this.Articulos = Articulos;
    }

    public ArrayList<Usuario> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> Usuarios) {
        this.Usuarios = Usuarios;
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
    
    
}
