/*
    Joaquin Montero. 2 DAM. DI --> T3 AppVisorAnimales
    Lista de animales con "ListView", al pulsar sobre texto
    de un animal despliega la imagen de dicho animal.
 */
package visoranimales2;

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
public class AppVisorAnimales extends Application {
    
   @Override
    public void start(Stage primaryStage) throws Exception 
    {
        StackPane rootMain = new StackPane();
        
        FXMLLoader fx = new FXMLLoader(getClass().getResource("VisorAnimales2.fxml"));
        Parent root = fx.load();
        rootMain.getChildren().add(root);
        
        Scene scene = new Scene(rootMain,600,500);
        primaryStage.setTitle("Visor de Animales");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
