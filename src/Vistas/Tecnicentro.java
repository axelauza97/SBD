/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Axel
 */
public class Tecnicentro extends Application{
    static Stage stage;
    public static Scene scene;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        this.stage=stage;
        //VLogin pane=new VLogin();
        scene=new Scene(new VLogin().getRoot(),800,600);
        scene.getStylesheets().add("/styles/welcome.css");
        stage.setTitle("Tecnicentro");
        stage.setScene(scene);
        
        stage.show();
    }
    
    public static void CambioInicio() throws IOException{
        //VInicio i=new VInicio();
        Scene scene=new Scene(new VInicio().getRoot(),800,600);
        stage.setScene(scene);
        stage.setOnCloseRequest((t) -> {
           System.exit(0);
       });
        //stage.setMaximized(true);
    } 
    
}
