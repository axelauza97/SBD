/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author Axel
 */
public class Administrador extends Usuario{

    public Administrador(String Nombre,int Edad, String Correo, String Usuario) {
        super(Nombre,Edad,Correo,Usuario);
    }
    
    public void ActualizarStock(){}
    public void Ingresar(){}
    public void Eliminar(){}
}
