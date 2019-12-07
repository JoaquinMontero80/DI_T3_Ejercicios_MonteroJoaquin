/*
    Joaquin Montero. 2 DAM. DI --> T3 AppVisorAnimales
    Lista de animales con "ListView", al pulsar sobre texto
    de un animal despliega la imagen de dicho animal.
 */

package appvisoranimales;


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
public class VisorAnimalesController implements Initializable 
{
    @FXML
    private ListView<Animal> listView;
    @FXML
    private ImageView imageView;
    // Variable de instancia Animal de tipo ObservableList<?>
    ObservableList<Animal> animales = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // Instancia Animal ( 3 parametros ) definido constructor
        Animal perro = new Animal ("Perro", "appvisoranimales/miniPerro.jpg", "appvisoranimales/perro.jpg");
        Animal gato = new Animal ("Gato", "appvisoranimales/miniGato.jpg", "appvisoranimales/gato.jpg");
        Animal pajaro = new Animal ("Pájaro", "appvisoranimales/miniPajaro.jpg", "appvisoranimales/pajaro.jpg");
        Animal caballo = new Animal("Caballo", "appvisoranimales/miniCaballo.jpg", "appvisoranimales/caballo.jpg");
        Animal delfin = new Animal("Delfín", "appvisoranimales/miniDelfin.jpg", "appvisoranimales/delfin.jpg");    
        Animal elefante = new Animal ("Elefante", "appvisoranimales/miniElefante.jpg", "appvisoranimales/elefante.jpg");
        Animal leon = new Animal ("León", "appvisoranimales/miniLeón.jpg", "appvisoranimales/leon.jpg");
        Animal mono = new Animal ("Mono", "appvisoranimales/miniMono.jpg", "appvisoranimales/mono.jpg");
        Animal tigre = new Animal("Tigre", "appvisoranimales/miniTigre.jpg", "appvisoranimales/tigre.jpg");
        Animal oso = new Animal("Oso", "appvisoranimales/miniOso.jpg", "appvisoranimales/oso.jpg");
        
        // Aniade a coleccion cada animal
        // vincula el ListView al ObservableList. 
        // De forma predeterminada, ListView muestra la representación de cada String de animal.
        animales.add(perro);
        animales.add(gato);
        animales.add(pajaro);
        animales.add(caballo);
        animales.add(delfin);
        animales.add(elefante);
        animales.add(leon);
        animales.add(mono);
        animales.add(tigre);
        animales.add(oso);
        
        
        // Escucha de los cambios de selección de ListView
        // Sincroniza animal seleccionado con la imagen
        listView.setItems(animales);
        
        
        // Resgitra listener para responder al cambio de seleccion de animal propiedad --> ( selectedItem. )
        // El metodo listView devuelve un objeto MultipleSelectionModel.
        // El metodo selectedItemProperty devuelve una lectura de animales de viejo a nuevo valor
        listView.getSelectionModel().selectedItemProperty().addListener(
        (ObservableValue<? extends Animal> ov, Animal old_val, 
            Animal new_val) -> {
        Image imagen = new Image(new_val.getImagenGrande());
        imageView.setImage(imagen);
             
            });
        
        
        
    }   // Fin de initialize 
    
}  // Fin de Clase
