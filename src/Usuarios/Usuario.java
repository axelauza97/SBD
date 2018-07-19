/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Axel
 */
public class Usuario {
    protected String Nombre;
    protected int Edad;
    protected String Correo;
    protected String Usuario;
    
    public Usuario(String Usuario){
        this.Usuario=Usuario;
    };
    
    public Usuario(String Nombre,int Edad, String Correo, String Usuario){
        this.Nombre=Nombre;
        this.Edad=Edad;
        this.Correo=Correo;
        this.Usuario=Usuario;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    public boolean Login(Connection conexion,String contr) throws SQLException{
    try{
         Statement consulta = conexion.createStatement();
         ResultSet rs = consulta.executeQuery("SELECT id FROM Empleados where usuario='"+this.Usuario+"' and contrasena='"+contr+"'");
         while(rs.next()){
            return true; 
            //System.out.println("Valores "+ rs.getString(1));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
        return false;
    };

  
}
