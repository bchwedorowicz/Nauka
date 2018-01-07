package pl.javastart.kontrolery.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
	System.out.println("wczytuje widok");
	Parent parent = (Parent) FXMLLoader.load(getClass().getResource(
		"/pl/javastart/kontrolery/view/LoginPane.fxml"));
	System.out.println("widok wczytany");
	Scene scene = new Scene(parent);
	stage.setScene(scene);
	stage.setTitle("Login Page");
	stage.show();
    }

    public static void main(String[] args) {
	launch(args);
    }

}
