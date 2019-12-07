/*
    Joaquin Montero. 2 DAM. DI --> T3 AppVisorAnimales
    Lista de animales con "ListView", al pulsar sobre texto
    de un animal despliega la imagen de dicho animal.
    En lugar de mostrar una representación del String de Animales (es decir, su nombre)
    mostrará una imagen.
 */
package visoranimales2;

import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author joaquin
 */
public class CeldaImagenTexto extends ListCell<Animal>
{
    // Atributos ( Valor aniadido a sobre la listView )
    VBox vb = new VBox();
    ImageView image = new ImageView();
    Label nombre = new Label();
    
    // Constructor
    public CeldaImagenTexto()
    {
        // ImageView tiene la relación de aspecto de la imagen
        image.setPreserveRatio(true);
        // ImageView tiene 100 puntos de altura
        image.setFitHeight(100);
        // Aniade a VBox ( imagen y label ) los coloca centrados
        vb.getChildren().addAll(image,nombre);
    }
    
    // Este metodo es llamado por cellfactory
    // configura el texto de la etiqueta y la imagen de ImageView luego
    // muestra la presentación personalizada en ListView.
    @Override     // Recibe animal y boolean si celda esta vacia
    public void updateItem(Animal animal,boolean empty)
    {
        // La superclase garantiza que las celdas personalizadas se
        // visualicen correctamente
        super.updateItem(animal, empty);
        // Si la celda esta vacia o el valor es nulo
        if(animal == null)
        {
             // No hay nada que mostrar
            setGraphic(null);
        }
        else
        {
            // Configura Label e ImageView de ImageTextCell
            Image imagen = new Image(animal.getImagenMiniatura());
            image.setImage(imagen);
            nombre.setText(animal.getNombre());
            // Establece VBox al metodo setGraphic 
            setGraphic(vb);
        }
    }
}
