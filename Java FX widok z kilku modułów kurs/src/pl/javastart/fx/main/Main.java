package pl.javastart.fx.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
	Parent parent = FXMLLoader.load(getClass().getResource(
		"/pl/javastart/fx/view/MainPane.fxml"));
	Scene scene = new Scene(parent);
	stage.setScene(scene);
	stage.setTitle("FX exercise");
	stage.show();

    }

    public static void main(String[] args) {
	launch(args);

    }

}
