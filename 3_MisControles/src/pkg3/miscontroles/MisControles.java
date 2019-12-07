/*
    Joaquin Montero. 2DAM.  DI --> T3A3
    Creo una clase, que tiene unos mtodos, creo el archivo "resources.jar"
    Boton derecho en NetBeans - Clean and build
    Este archivo lo importo en nuevo proyecto ("UsandoMisControles")
    Libraries - Add JAR/Foldr - aniado archivo ( dentro de carpeta "dist" )
    Importo libreria en archivo.
 */

package pkg3.miscontroles;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class MisControles extends Application 
{
    
    @Override
    public void start(Stage primaryStage) 
    {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
