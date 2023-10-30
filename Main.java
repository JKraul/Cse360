package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Stage stg;
	
	 @Override // setting up how program will look at the start
	    public void start(Stage primaryStage) throws Exception{
	        stg = primaryStage;
	        primaryStage.setResizable(false);
	        Parent root = FXMLLoader.load(getClass().getResource("Loginscreen.fxml"));
	        primaryStage.setTitle("EffortLogger");
	        primaryStage.setScene(new Scene(root, 600, 400));
	        primaryStage.show();
	}
	 	// changes scenes
	    public void changeScene(String fxml) throws IOException {
	        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
	        stg.getScene().setRoot(pane);
	    }


	    public static void main(String[] args) {
	        launch(args);
	    }
}
