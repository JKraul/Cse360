package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {
	
	public Login() {
		
	}
	//setting all properties to use
	@FXML
	private Button login;
	@FXML
	private Label Wronglogin;
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	
	//method to what happens when the login button is pressed
public void UserLoginScreen(ActionEvent event) throws IOException{
	checkLogin();
}
//checking the user login
private void checkLogin() throws IOException{
	Main m = new Main();
	if(username.getText().toString().equals("UserName")&& password.getText().toString().equals("123")) {
		Wronglogin.setText("Sucess!");
		m.changeScene("afterlogin.fxml");
	}
	else if(username.getText().isEmpty()&& password.getText().isEmpty()) {
		Wronglogin.setText("Please enter your data!");
	}
	else {
		Wronglogin.setText("Wrong username or password");
		}
	}	
}
