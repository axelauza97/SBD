/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.io.IOException;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Axel
 */
public class VInicio {
    private BorderPane root;
    private Label txt_new;
    public BorderPane getRoot() {
        return root;
    }
   
    public VInicio(){
        root=new BorderPane();
        txt_new=new Label("Bienvenido");
        root.setCenter(txt_new);
        
    }
    
    /*public void ventana() throws IOException{
        Tecnicentro tec = new Tecnicentro();
        tec.CambioInicio();
    }*/
}
