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
public class Query {
    
    public static boolean ejecutar(Connection conexion, String query) throws SQLException{
    try{
         Statement consulta = conexion.createStatement();
         ResultSet rs = consulta.executeQuery(query);
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
