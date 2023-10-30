package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Afterlogin {

	@FXML
	private Button logout;
	//changing back to the login screen
	public void UserLogout(ActionEvent event) throws IOException{
			Main m = new Main();
			m.changeScene("Loginscreen.fxml");
	}
	
}
