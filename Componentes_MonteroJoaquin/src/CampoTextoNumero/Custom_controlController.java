/*
    Joaquin Montero. 2DAM. DI --> T3 TextFieldNumerico
    Clase controladora.
        Implementar un componente personalizado llamado CampoTextoNumerico
        que extienda de la clase TextField modificando su comportamiento 
        para que solo admita valores numéricos.
        Obtiene clase CampoTextoNumerico del proyecto con mismo nombre. ( sus metodos correspondientes )
 */
package CampoTextoNumero;

import java.io.IOException;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author joaquin
 */
public class Custom_controlController extends HBox 
{
    @FXML private TextField textField;

    public Custom_controlController() 
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("custom_control.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public String getText() {
        return textProperty().get();
    }

    public void setText(String value) {
        textProperty().set(value);
    }

    public StringProperty textProperty() {
        return textField.textProperty();
    }

    @FXML
    protected void doSomething() {
        System.out.println("The button was clicked!");
    }
}
