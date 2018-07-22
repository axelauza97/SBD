/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Axel
 */
public class Auto {
   
    private String Placa;
    private String Categoria;
    private String Modelo;
    private boolean EnServicio;

    public Auto(String Placa, String Categoria, String Modelo, boolean EnServicio) {
        this.Placa = Placa;
        this.Categoria = Categoria;
        this.Modelo = Modelo;
        this.EnServicio = EnServicio;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public boolean isEnServicio() {
        return EnServicio;
    }

    public void setEnServicio(boolean EnServicio) {
        this.EnServicio = EnServicio;
    }
    
    
}
