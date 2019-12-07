/*
    Joaquín Montero. 2DAM. DI --> Selector deslizamiento
    Clase que procede de Componentes_MonteroJoaquin
    Clase principal
 */
package appusoselector;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



/**
 *
 * @author joaquin
 */
public class APPUsoSelector extends Application 
{
    
    @Override
    public void start(Stage primaryStage) throws IOException 
    {
        
        StackPane root = new StackPane();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLUsoSelector.fxml"));
        
        Parent rootView = fxmlLoader.load();
        root.getChildren().add(rootView);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Selector deslizamiento");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
