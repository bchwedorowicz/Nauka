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

public class ContentPaneController implements Initializable {

    @FXML
    private Button clearButton;

    @FXML
    private TextPaneController textPaneController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
	TextArea firstTextArea = textPaneController.getFirstTextArea();
	TextArea secondTextArea = textPaneController.getSecondTextArea();

	firstTextArea.addEventFilter(KeyEvent.KEY_RELEASED,
		x -> secondTextArea.setText(new StringBuilder(firstTextArea.getText()).reverse().toString()));
	secondTextArea.addEventFilter(KeyEvent.KEY_RELEASED,
		x -> firstTextArea.setText(new StringBuilder(secondTextArea.getText()).reverse().toString()));

	clearButton.setOnAction(new EventHandler<ActionEvent>() {

	    @Override
	    public void handle(ActionEvent event) {
		firstTextArea.clear();
		secondTextArea.clear();

	    }
	});

    }

}
