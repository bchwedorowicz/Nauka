package pl.javastart.mp3player.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;

public class MainController implements Initializable {

    @FXML
    private Menu fileMenu;

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem dirMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private MenuItem AboutMenuItem;

    @FXML
    private TableView<?> contentTable;

    @FXML
    private Button prevButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider songSlider;

    @FXML
    private ContentPaneController contentPaneController;

    @FXML
    private ControlPaneController controlPaneController;

    @FXML
    private MenuPaneController menuPaneController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
	System.out.println(contentPaneController);
	System.out.println(controlPaneController);
	System.out.println(menuPaneController);
	// configureButtons();
	// configureVolume();
	//
	// }
	//
	// public void configureVolume() {
	// volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED, new
	// EventHandler<MouseEvent>() {
	//
	// @Override
	// public void handle(MouseEvent event) {
	// System.out.println("Wciœniêto przycisk na suwaku g³oœnoœci");
	// }
	//
	// });
	// }
	//
	// private void configureButtons() {
	// prevButton.setOnAction(new EventHandler<ActionEvent>() {
	// @Override
	// public void handle(ActionEvent event) {
	// System.out.println("Poprzednia piosenka");
	// }
	// });
	// nextButton.setOnAction(x -> System.out.println("Nastêpna piosenka"));
	// playButton.setOnAction(new EventHandler<ActionEvent>() {
	// @Override
	// public void handle(ActionEvent event) {
	// if (playButton.isSelected()) {
	// System.out.println("Play");
	// } else {
	// System.out.println("Stop");
	// }
	// }
	// });
    }
}
