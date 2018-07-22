/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Usuarios.Mecanico;
import java.util.ArrayList;

/**
 *
 * @author Axel
 */
public class Servicio {

    private String DescAntes;
    private String DescDesp;
    private short Tipo;
    private ArrayList<Articulo> Articulos;
    private ArrayList<Auto> Autos;
    private ArrayList<Mecanico> Mecanicos;

    public Servicio(String DescAntes, String DescDesp, short Tipo, ArrayList<Articulo> Articulos, ArrayList<Auto> Autos, ArrayList<Mecanico> Mecanicos) {
        this.DescAntes = DescAntes;
        this.DescDesp = DescDesp;
        this.Tipo = Tipo;
        this.Articulos = Articulos;
        this.Autos = Autos;
        this.Mecanicos = Mecanicos;
    }
    
    public void Finalizar(Auto auto){
        for(Auto a: Autos){
            if(a.equals(auto))
                auto.setEnServicio(false);
        }
    }
    
    
}
