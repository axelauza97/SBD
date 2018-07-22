/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import VistasConsulta.VConsuCliente;
import VistasConsulta.VConsuArt;
import VistasConsulta.VConsuSerArt;
import VistasConsulta.VConsuSerMan;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author Axel
 */
public class VInicio {
    private BorderPane root;
    private HBox PaneButton;
    private Label txt_new;
    private Button btn_ConsuArt;
    private Button btn_ConsuSerArt;
    private Button btn_ConsuSerMan;
    private Button btn_ConsuCliente;
    public BorderPane getRoot() {
        return root;
    }
   
    public VInicio(){
        root=new BorderPane();
        PaneButton= new HBox();
        txt_new=new Label("Bienvenido");
        setUpButton();
        PaneButton.getChildren().addAll(txt_new,btn_ConsuArt,btn_ConsuSerArt,btn_ConsuSerMan,
                btn_ConsuCliente);
        root.setTop(PaneButton);
        
        
    }
    private void setUpButton(){
        btn_ConsuArt=new Button("Consultar Artículo");
        btn_ConsuSerArt=new Button("Consultar Servicio Artículo");
        btn_ConsuSerMan=new Button("Consultar Servicio Mantenimiento");
        btn_ConsuCliente=new Button("Consultar Cliente");
        
        btn_ConsuArt.setOnAction(new ConsuArt());
        btn_ConsuSerArt.setOnAction(new ConsuSerArt());
        btn_ConsuSerMan.setOnAction(new ConsuSerMan());
        btn_ConsuCliente.setOnAction(new ConsuCliente());
       
        
    
    }

    private class ConsuArt implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            VConsuArt vcon=new VConsuArt();
            root.setCenter(vcon.ventana());
        }
    
    }
    private class ConsuSerArt implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            VConsuSerArt vcon=new VConsuSerArt();
            //root.setCenter(vcon.ventana());
        }
    
    }
    private class ConsuSerMan implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            VConsuSerMan vcon=new VConsuSerMan();
            //root.setCenter(vcon.ventana());
        }
    
    }
    private class ConsuCliente implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            VConsuCliente vcon=new VConsuCliente();
            //root.setCenter(vcon.ventana());
        }
    
    }
    /*public void ventana() throws IOException{
        Tecnicentro tec = new Tecnicentro();
        tec.CambioInicio();
    }*/
}
