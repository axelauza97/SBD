/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Objetos.Articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Axel
 */
public class Query {

    
    public static boolean Condicional(Connection conexion, String query) throws SQLException{
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
    
    
    
    public static ArrayList<Articulo> DevolucionArticulo(Connection conexion, String query) throws SQLException{
        ArrayList<Articulo> articulos=new ArrayList<Articulo>();
        try{
         Statement consulta = conexion.createStatement();
         ResultSet rs = consulta.executeQuery(query);
         while(rs.next()){
            //se debe de acomodar al store procedure
            Articulo articulo=new Articulo(rs.getString(0), (short) Integer.parseInt(rs.getString(1))); 
            articulos.add(articulo);
            //System.out.println("Valores "+ rs.getString(1));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
        return articulos;
    };
    
    
}
