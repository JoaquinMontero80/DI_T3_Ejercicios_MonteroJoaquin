/*
    Joaquin Montero. 2DAM.  DI --> T3A3
    Creo una clase, que tiene unos mtodos, creo el archivo "resources.jar"
    Boton derecho en NetBeans - Clean and build
    Este archivo lo importo en nuevo proyecto ("UsandoMisControles")
    Libraries - Add JAR/Foldr - aniado archivo ( dentro de carpeta "dist" )
    Importo libreria en archivo.
 */

package pkg3.usandomiscontroles;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pkg3.miscontroles.MiControl;


/**
 *
 * @author usuario
 */
public class UsandoMisControles extends Application 
{
    private int contador = 0;
    
    @Override
    public void start(Stage primaryStage)
    {
        BorderPane bpane = new BorderPane();
        MiControl mcontrol = new MiControl();
        
        mcontrol.setMaxHeight(100);
        mcontrol.setMaxWidth(100);
        
        Label label = new Label();
        
        mcontrol.setOnAction(e->{
            contador++;
            label.setText("Has pulsado el boton : " + contador + " veces");
                       
        });

        
        bpane.setBottom(label);
        bpane.setCenter(mcontrol);
        
        Scene scene = new Scene(bpane, 300, 300);
        primaryStage.setTitle("Usando mi control.");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    } // Fin de metodo

    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
