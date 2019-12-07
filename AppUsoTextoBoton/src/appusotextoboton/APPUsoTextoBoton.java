/*
    Joaquin Montero. 2DAM. DI --> APPUsoTextoBoton
    Clase controladora.
    Incorporar a Scene Builder el control CampoTextoBoton implementado
    en el ejercicio 4.5.1. Se implementará una App AppUsoTextoBoton con una vista como la de la
    imagen donde al pulsar cada uno de los botones se muestra el texto asociado en la etiqueta inferior.
 */

package appusotextoboton;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author joaquin
 */
public class APPUsoTextoBoton extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        StackPane root = new StackPane();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLUsoTextoBoton.fxml"));
        
        Parent rootView = fxmlLoader.load();
        root.getChildren().add(rootView);
        
        Scene scene = new Scene(root, 250, 80);
        
        primaryStage.setTitle("Selector");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
