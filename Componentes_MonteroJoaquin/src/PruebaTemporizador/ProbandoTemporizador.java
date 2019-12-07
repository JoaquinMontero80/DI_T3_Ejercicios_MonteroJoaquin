/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaTemporizador;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import temporizador.TemporizadorController;

/**
 *
 * @author joaquin
 */
public class ProbandoTemporizador extends Application
{
    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception 
    {
        TemporizadorController c = new TemporizadorController();
        c.setAlignment(Pos.CENTER);
        
        VBox root = new VBox(); //Distribución vertical
        root.setPrefSize(400, 300);
        root.setAlignment(Pos.CENTER);
        
        VBox v = new VBox();
        v.getChildren().add(c);
        
        root.getChildren().add(v);
        Scene scene = new Scene(root); 
        stage.setScene(scene);
        stage.show();
        
        c.getNumero().textProperty().addListener(new ChangeListener<String>()
        {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                if(newValue.equals("0"))
                {
                    
                }
            }
        });
   
    } 
}
