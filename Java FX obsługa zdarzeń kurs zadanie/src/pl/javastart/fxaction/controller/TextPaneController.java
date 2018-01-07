package pl.javastart.fxaction.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class TextPaneController implements Initializable {

    @FXML
    private TextArea firstTextArea;

    @FXML
    private TextArea secondTextArea;

    public TextArea getFirstTextArea() {
	return firstTextArea;
    }

    public void setFirstTextArea(TextArea firstTextArea) {
	this.firstTextArea = firstTextArea;
    }

    public TextArea getSecondTextArea() {
	return secondTextArea;
    }

    public void setSecondTextArea(TextArea secondTextArea) {
	this.secondTextArea = secondTextArea;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub

    }

}
