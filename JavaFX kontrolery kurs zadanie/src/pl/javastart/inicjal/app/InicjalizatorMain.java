package pl.javastart.inicjal.app;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InicjalizatorMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {
	URL resource = getClass().getResource("/pl/javastart/inicjal/view/InicjalizatorPane.fxml");
	Parent parent = (Parent) FXMLLoader.load(resource);
	Scene scene = new Scene(parent);
	stage.setScene(scene);
	stage.setTitle("Inicjalizator");
	stage.show();

    }

    public static void main(String[] args) {
	launch(args);

    }

}
