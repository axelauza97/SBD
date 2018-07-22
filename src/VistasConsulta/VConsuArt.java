/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasConsulta;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Axel
 */
public class VConsuArt {
    
    private BorderPane root;
    private VBox PaneLabel;
    private VBox PaneEdit;
    private HBox PaneCont;
    private Label lbl_nombre;
    private Label lbl_precio;
    private Label lbl_descripcion;
    private TextField txt_nombre; 
    private TextField txt_precio; 
    private TextField txt_descripcion; 
    private Button btn_ConsuArt;
    private Button btn_ConsuSerArt;
    private Button btn_ConsuSerMan;
    private Button btn_ConsuCliente;
    
    public VConsuArt(){
        root=new BorderPane();
        PaneLabel=new VBox();
        PaneEdit=new VBox();
        PaneCont=new HBox();
        setUp();
        PaneLabel.getChildren().addAll(lbl_nombre,lbl_precio,lbl_descripcion);
        PaneEdit.getChildren().addAll(txt_nombre,txt_precio,txt_descripcion);
        PaneCont.getChildren().addAll(PaneLabel,PaneEdit);
        root.setCenter(PaneCont);
    }
    
    private void setUp(){
        lbl_nombre=new Label("Nombre:");
        txt_nombre=new TextField("");
        lbl_precio=new Label("Precio:");
        txt_precio=new TextField("");
        lbl_descripcion=new Label("Descripcion:");
        txt_descripcion=new TextField("");
        
    }
    public Node ventana(){
        return root;
    }
    
}
