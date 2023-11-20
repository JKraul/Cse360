package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;


public class RegisterController {
	
	@FXML
	private Button CloseButton;
	@FXML
	private Label RegistrationMssgeLabel;
	@FXML
	private PasswordField SetpasswordField;
	@FXML
	private PasswordField ConfirmPasswordField;
	@FXML
	private Label confirmpasswordLabel;
	@FXML
	private TextField usernameTextField;
	
	public void closeButtonOnAction(ActionEvent event) {
		Stage stage = (Stage) CloseButton.getScene().getWindow();
		stage.close();
		Platform.exit();
	}
	
	public void registerButtonOnAction(ActionEvent event) {
		
		if(SetpasswordField.getText().equals(ConfirmPasswordField.getText())) {
			registerUser();
			confirmpasswordLabel.setText("");
		}else {
			confirmpasswordLabel.setText("Password does not Match!");
		}
	}
	
	public void registerUser() {
		DataBaseConnection connectNow = new DataBaseConnection();
		Connection connectDB = connectNow.getConnection();
		
		String username = usernameTextField.getText();
		String password = SetpasswordField.getText();
		
		String insertFields = "INSERT INTO user_accountinfo(username, password) VALUES('";
		String insertValues = username +"','" + password + "',')";
		String insertToRegister = insertFields + insertValues;
		
		try {
			Statement statement = connectDB.createStatement();
			statement.executeUpdate(insertToRegister);
			
			RegistrationMssgeLabel.setText("User has been registered!");
		}catch (Exception e) {
			e.printStackTrace();
			e.getCause();
		}
		
	}
	
}
