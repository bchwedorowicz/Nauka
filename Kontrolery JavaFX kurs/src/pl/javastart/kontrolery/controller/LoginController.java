package pl.javastart.kontrolery.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {

    @FXML
    private Label userNameLabel;

    @FXML
    private TextField userNameText;

    @FXML
    private Button loginButton;
    
    public LoginController() {
	System.out.println("konstruktor kontrolera");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
	System.out.println("Inicjalizacja kontrolera");
	System.out.println(userNameLabel.getText());
	userNameText.setPromptText("Wpisz swoje imiê");

    }

}
