/*
    Joaquin Montero. 2DAM.   DI --> T3A6
    CustomControl.  
    fuente : https://docs.oracle.com/javase/8/javafx/fxml-tutorial/custom_control.htm   
 */
package CustomControlExample;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CustomControlMain extends Application 
{
    @Override
    public void start(Stage stage) throws Exception 
    {
        CustomControl customControl = new CustomControl();
        customControl.setText("Hello!");
        
        stage.setScene(new Scene(customControl));
        stage.setTitle("Custom Control");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
}
