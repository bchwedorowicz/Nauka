package pl.javastart.fxaction.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller implements Initializable {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button lowerCaseButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
	lowerCaseButton.setOnAction(new EventHandler<ActionEvent>() {

	    @Override
	    public void handle(ActionEvent event) {
		System.out.println("Wygenerowano zdarzenie " + event.getEventType());
		String text = mainTextArea.getText();
		mainTextArea.setText(text.toLowerCase());
	    }
	});

    }

}
