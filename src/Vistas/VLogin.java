/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Servicios.Conexion;
import Servicios.Validar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author Axel
 */
public class VLogin {
    private Pane root;
    private HBox PaneUsu;
    private HBox PaneCont;
    private VBox PaneConteiner;
    private Button btn_ing;
    private Label lbl_usu, lbl_logo;
    private Label lbl_cont;
    private TextField txt_usu;
    private TextField txt_cont;
    public Text nameData;
    
    /**
     * 
     * @return: Devuelve el contenedor principal
     */
    public Pane getRoot() {
        return root;
    }
    /**
     * Constructor de la clase
     */
    public VLogin() {
        //root=new Pane();
        //PaneUsu=new HBox();
        //PaneCont=new HBox();
        
        
        //PaneConteiner=new VBox();
        Font.loadFont(VLogin.class.getResource("/fonts/Chicle-Regular.ttf").toExternalForm(),10);
        Font.loadFont(VLogin.class.getResource("/fonts/Chewy-Regular.ttf").toExternalForm(),10);
        btn_ing=new Button("Ingresar");
        lbl_usu=new Label("Usuario:");
        txt_usu=new TextField();
        
        lbl_cont=new Label("Contraseña:");
        txt_cont=new TextField();
        nameData = new Text("ArchData Car");
        nameData.setId("nameData");
        SetupButtons();
        ConfigButtons();
        
        //root.setCenter(PaneConteiner);
        
        
        
    }
    
    
private void SetupButtons(){
        root=new Pane();
        lbl_usu.setLayoutX(300);
        lbl_usu.setLayoutY(350);
        txt_usu.setLayoutX(450);
        txt_usu.setLayoutY(350);
        
        lbl_cont.setLayoutX(300);
        lbl_cont.setLayoutY(420);
        txt_cont.setLayoutX(450);
        txt_cont.setLayoutY(420);
        
        btn_ing.setLayoutX(350);
        btn_ing.setLayoutY(500);
        
        nameData.setLayoutX(200);
        nameData.setLayoutY(150);
        
        Image imagelogo= new Image(getClass().getResourceAsStream("/image/logo.png"));
        lbl_logo = new Label("",new ImageView(imagelogo));
        lbl_logo.setLayoutX(300);
        lbl_logo.setLayoutY(200);
        
        
        /*
        PaneUsu.getChildren().addAll(lbl_usu,txt_usu);
        PaneUsu.setPrefSize(100, 100);
        PaneUsu.setSpacing(10);
        lbl_usu.setAlignment(Pos.CENTER);
        txt_usu.setAlignment(Pos.CENTER);
       
        PaneCont.getChildren().addAll(lbl_cont,txt_cont);
        PaneCont.setPrefSize(100, 100);
        PaneCont.setSpacing(10);
        lbl_cont.setAlignment(Pos.CENTER);
        txt_cont.setAlignment(Pos.CENTER);
        */
        root.getChildren().addAll(nameData,lbl_usu,txt_usu,lbl_cont,txt_cont,btn_ing, lbl_logo);
        //PaneConteiner.getChildren().addAll(PaneUsu,PaneCont,btn_ing);
        /*
        btn_ing.setPrefSize(100,50);
        btn_ing.setAlignment(Pos.CENTER);
        
        
        PaneConteiner.setSpacing(30);
        PaneConteiner.setPrefSize(500, 500);
        PaneConteiner.setAlignment(Pos.CENTER);
        */
        
    }
private void ConfigButtons(){
    btn_ing.setOnAction((e)->{
        try{
            ingreso(e);
        }catch(Exception ex){
        Logger.getLogger(Tecnicentro.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
}
private void ingreso(ActionEvent e) throws ParseException,IOException, SQLException, ClassNotFoundException{
    Connection con=Conexion.obtener();
    if(Validar.seleccion(con, txt_usu.getText(), txt_cont.getText()))
    {
        System.out.println("INICIO DE SESION EXITOSO");    
        Tecnicentro ini=new Tecnicentro();
        ini.CambioInicio();
    }
    else
        System.out.println("Usuario o clave incorrecto");
    }
    
}
