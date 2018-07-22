/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import Objetos.Articulo;
import Servicios.Query;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Axel
 */
public class ConsultaGeneral{
    
    public ArrayList<Articulo> Articulo(Connection conexion, String query) throws SQLException{
        
        return(Query.DevolucionArticulo(conexion, query));
    };
    
    public void ServicioArticulo(){};
    public void ServicioMante(){};
    public void Cliente(){};
}
