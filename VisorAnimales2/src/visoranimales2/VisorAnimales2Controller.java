/*
    Joaquin Montero. 2 DAM. DI --> T3 AppVisorAnimales
    Lista de animales con "ListView", al pulsar sobre texto
    de un animal despliega la imagen de dicho animal.
    En lugar de mostrar una representación del String de Animales (es decir, su nombre)
    mostrará una imagen.
 */
package visoranimales2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author joaquin
 */
public class VisorAnimales2Controller implements Initializable {

    @FXML
    private ListView<Animal> listView;
    @FXML
    private ImageView imageView;
    ObservableList<Animal> animales = FXCollections.observableArrayList();
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        Animal perro = new Animal("Perro","visoranimales2/miniPerro.jpg","visoranimales2/perro.jpg");
        Animal gato = new Animal("Gato","visoranimales2/miniGato.jpg","visoranimales2/gato.jpg");
        Animal pajaro = new Animal("Pajaro","visoranimales2/miniPajaro.jpg","visoranimales2/pajaro.jpg");
        animales.add(gato);
        animales.add(perro);
        animales.add(pajaro);
        
        listView.setItems(animales);
        
        listView.setCellFactory((ListView<Animal> l) -> new CeldaImagenTexto());
        
        listView.getSelectionModel().selectedItemProperty().addListener(
         (ObservableValue<? extends Animal> ov, Animal old_val, 
                Animal new_val) -> {
            Image imagen = new Image(new_val.getImagenGrande());
            imageView.setImage(imagen);
             
                });
    } 
}
