package pl.javastart.fxaction.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class Controller implements Initializable {
    @FXML
    private TextArea firstTextArea;

    @FXML
    private TextArea secondTextArea;

    @FXML
    private Button clearButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
	reverseText(firstTextArea, secondTextArea);
	reverseText(secondTextArea, firstTextArea);

	clearButton.setOnAction(new EventHandler<ActionEvent>() {

	    @Override
	    public void handle(ActionEvent event) {
		firstTextArea.clear();
		secondTextArea.clear();

	    }
	});

    }

    public void reverseText(TextArea firstArea, TextArea secondArea) {
	firstArea.setOnKeyReleased(new EventHandler<KeyEvent>() {

	    @Override
	    public void handle(KeyEvent event) {
		String text = firstArea.getText();
		StringBuilder sb = new StringBuilder(text);
		secondArea.setText(sb.reverse().toString());
	    }

	});
    }

}
