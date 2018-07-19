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
public class Mecanico extends Usuario{
    private int ManoObra;
    public Mecanico(String Nombre,int Edad, String Correo, String Usuario) {
        super(Nombre,Edad,Correo,Usuario);
    }
    
}
