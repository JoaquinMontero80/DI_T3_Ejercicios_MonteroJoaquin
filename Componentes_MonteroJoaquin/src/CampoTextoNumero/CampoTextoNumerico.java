/*
    Joaquin Montero. 2DAM. DI --> T3 TextFieldNumerico
        Implementar un componente personalizado llamado CampoTextoNumerico
        que extienda de la clase TextField modificando su comportamiento 
        para que solo admita valores numéricos.
        Obtiene clase CampoTextoNumerico del proyecto con mismo nombre. ( sus metodos correspondientes )
 */
package CampoTextoNumero;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

/**
 *
 * @author joaquin
 */
public class CampoTextoNumerico extends TextField
{
    private String texto;
    
    public CampoTextoNumerico()
    {
        super();
        
        this.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                onActionProperty().get().handle(event);
            }
        });
    }
    
    @Override
    public void replaceText(int start, int end, String text) 
    {
        if (!text.matches("[a-z,A-Z]")) 
        {
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(String text) 
    {
        
        if (!text.matches("[a-z,A-Z]")) 
        {
            super.replaceSelection(text);
        }
    }

    public String getTexto() 
    {
        return texto;
    }

    public void setTexto(String texto) 
    {
        this.texto = texto;
        super.setText(texto);
    } 
}
