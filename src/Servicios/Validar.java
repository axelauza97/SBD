/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Axel
 */
public class Validar {
    
    public static boolean seleccion(Connection conexion, String usuario,String contr) throws SQLException{
    try{
         Statement consulta = conexion.createStatement();
         ResultSet rs = consulta.executeQuery("SELECT id FROM Empleados where usuario='"+usuario+"' and contrasena='"+contr+"'");
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
