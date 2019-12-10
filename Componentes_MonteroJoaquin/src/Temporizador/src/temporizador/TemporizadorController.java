/*
    Joaquin Montero. 2DAM. DI --> T3 Temporizador
    Temporizador gráfico que realiza una cuenta atrás con las siguientes
    características:
         El componente se basa es una etiqueta que dispone de una propiedad llamada tiempo, de tipo int,
        que representa los segundos que van a transcurrir desde su creación hasta que llega a cero.
         Cada segundo disminuye en uno el valor de tiempo, que visualizamos en el texto de la etiqueta.
         Para programarlo utiliza un atributo de tipo javafx.animation.Timeline, que será el que marque
        cuando se cambia el valor de tiempo.
         Al finalizar la cuenta atrás se lanza un evento de finalización de cuenta que puede ser recogido
        por la aplicación en la que se incluya el componente.
 */
package temporizador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author joaquin
 */
public class TemporizadorController extends javafx.scene.layout.HBox implements Initializable
{
    // Atributos
    @FXML private Label Numero;
    private Timeline tiempo;
    private Integer inicio = 5;
    private IntegerProperty segundos = new SimpleIntegerProperty(inicio);
    @FXML private HBox panel;
    @FXML private Label label1;
    @FXML private Label label2;
    
    // Constructor
    public TemporizadorController()
    {
        try
        {
            // Carga el .fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Temporizador.fxml"));
            fxmlLoader.setRoot(this);
            fxmlLoader.setController(this);
            fxmlLoader.load();
        }
        catch(IOException ex)
        {
            System.out.println("Error no se ha podido cargar el componente..");
        }
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        Numero.textProperty().bind(segundos.asString());
        segundos.set(inicio);
        tiempo = new Timeline();
        tiempo.getKeyFrames().add(new KeyFrame(Duration.seconds(inicio + 1), new KeyValue(segundos,0)));
        tiempo.playFromStart();
    }

    // Metodos getter and setter
    public Label getNumero() 
    {
        return Numero;
    }

    public void setNumero(Label Numero) 
    {
        this.Numero = Numero;
    }

    public Timeline getTiempo() 
    {
        return tiempo;
    }

    public void setTiempo(Timeline tiempo) 
    {
        this.tiempo = tiempo;
    }

    public Integer getInicio() 
    {
        return inicio;
    }

    public void setInicio(Integer inicio) 
    {
        this.inicio = inicio;
    }

    public IntegerProperty getSegundos() 
    {
        return segundos;
    }

    public void setSegundos(IntegerProperty segundos) 
    {
        this.segundos = segundos;
    }

    public HBox getPanel() 
    {
        return panel;
    }

    public void setPanel(HBox panel) 
    {
        this.panel = panel;
    }

    public Label getLabel1() 
    {
        return label1;
    }

    public void setLabel1(Label label1) 
    {
        this.label1 = label1;
    }

    public Label getLabel2() 
    {
        return label2;
    }

    public void setLabel2(Label label2) 
    {
        this.label2 = label2;
    }
}

