/*
    Joaquin Montero. 2DAM. DI --> APPUsoTextoBoton
    Clase controladora.
    Incorporar a Scene Builder el control CampoTextoBoton implementado
    en el ejercicio 4.5.1. Se implementará una App AppUsoTextoBoton con una vista como la de la
    imagen donde al pulsar cada uno de los botones se muestra el texto asociado en la etiqueta inferior.
 */
package appusotextoboton;

import CampoTextoNumero.Custom_controlController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;



/**
 * FXML Controller class
 *
 * @author joaquin
 */
public class FXMLUsoTextoBotonController implements Initializable {

    @FXML
    private Custom_controlController nombre;
    @FXML
    private Custom_controlController apellidos;
    @FXML
    private Label texto;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        nombre.getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                texto.setText("Se ha grabado nombre : "+nombre.getText());      
            }
        });
                  
        apellidos.getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                texto.setText("Se ha grabado apellido : "+apellidos.getText());      
            }
        });

    }    
    
}
