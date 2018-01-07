package pl.javastart.inicjal.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class InicjalizatorController implements Initializable {

    @FXML
    private Label firstLabel;

    @FXML
    private Button firstButton;
 
    @FXML
    private Label secondLabel;

    @FXML
    private Button secondButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
	firstLabel.setText("Etykieta 1");
	secondLabel.setText("Etykieta 2");
    }

}
