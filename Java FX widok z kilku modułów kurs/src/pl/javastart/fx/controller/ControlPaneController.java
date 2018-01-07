package pl.javastart.fx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControlPaneController implements Initializable {

    @FXML
    private Button upperCaseButton;

    @FXML
    private Button lowerCaseButton;

    public Button getLowerCaseButton() {
	return lowerCaseButton;
    }

    public Button getUpperCaseButton() {
	return upperCaseButton;
    }

    public void setLowerCaseButton(Button lowerCaseButton) {
	this.lowerCaseButton = lowerCaseButton;
    }

    public void setUpperCaseButton(Button upperCaseButton) {
	this.upperCaseButton = upperCaseButton;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
	System.out.println("Stworzono ControlPaneController");
    }

}
