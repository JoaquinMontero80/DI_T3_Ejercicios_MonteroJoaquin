/*
    Joaquín Montero. 2DAM. DI --> Selector deslizamiento
    Clase que procede del proyecto Componentes_MonteroJoaquin
    Clase Controladora
 */
package appusoselector;

import SelectorDeslizamiento.SelectorDeslizamiento;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class FXMLUsoSelectorController implements Initializable {

    @FXML
    private SelectorDeslizamiento arriba;
    @FXML
    private SelectorDeslizamiento abajo;
    @FXML
    private Label texto;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        ArrayList<String> numeros = new ArrayList();
        numeros.add("Uno");
        numeros.add("Dos");
        numeros.add("Tres");
        numeros.add("Cuatro");
        numeros.add("Cinco");
        numeros.add("Seis");
        numeros.add("Siete");
        numeros.add("Ocho");
        numeros.add("Nueve");
        numeros.add("Diez");
        
        arriba.setItems(numeros);
        abajo.setItems(numeros);

        arriba.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                texto.setText("Pulsado el selector de arriba.");
            }
        });
        
        abajo.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                texto.setText("Pulsado el selector de abajo.");
            }
        });
    }    
    
}
